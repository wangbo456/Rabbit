package com.zm.mq;

import com.zm.bean.Logs;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "testC")
public class testC {

    @RabbitHandler
    public void processC(Logs logs){
        System.out.println("ReceiverC:"+logs);
    }

}
