package com.zm.mq;

import com.zm.bean.Logs;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "testA")
public class test {


    @RabbitHandler
    public void processA(Logs logs){
        System.out.println("ReceiverA:"+logs);
    }
}
