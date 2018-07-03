package com.zm.aop;

import com.zm.bean.Logs;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.CodeSignature;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

import java.util.Date;

@Aspect
@Component
public class LogDemo {

   @Autowired
    private MongoTemplate mongoTemplate;

    @Autowired
    private AmqpTemplate amqpTemplate;

    @Pointcut("execution(* com.zm.service.*.*(..))args(JoinPoint joinPoint)")
    public void webLog() {
    }

    @AfterReturning(pointcut = "webLog()")
    public void doAfterReturning(JoinPoint jp) throws Throwable {

        String clazzName = null;
         try {
             //获取当前执行的类名（getSimpleName  aop的一个底层类）
             clazzName=Class.forName(jp.getTarget().getClass().getName()).getSimpleName();
        } catch (Exception e) {
            e.printStackTrace();
        }

        //获取当前执行的方法名
        String methodName = jp.getSignature().getName();

         //获取当前执行的方法的参数

        //获取当前执行方法的aop对象的参数属性，参数的值
        Object[] paramValues = jp.getArgs();
        //获取当前执行方法的所带的参数名称
        String[] paramNames = ((CodeSignature) jp.getSignature()).getParameterNames();
        //定义一个空变量
        String params = "";
        //循环当前执行方法的参数，以key（paramNames）,value（paramValues）形式存贮mongodb
        for (int i = 0; i < paramNames.length; i++) {
            params += paramNames[i] + ":" + paramValues[i] + ",";
        }

        Logs logs = new Logs();
        logs.setClazzName(clazzName);
        logs.setMethodName(methodName);
        logs.setParams(params);
        logs.setTiem(new Date().toString());
        logs.setSetIsexception("正常");


        amqpTemplate.convertAndSend("testA",logs);
        mongoTemplate.insert(logs);
        amqpTemplate.convertAndSend("testB",logs);
    }


}
