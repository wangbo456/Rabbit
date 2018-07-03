package com.zm.mq;

import com.zm.bean.Logs;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "testB")
public class testB {

    @RabbitHandler
    public void processB(Logs logs){
        System.out.println("ReceiverB:"+logs);
    }


}
