package com.zm.mq;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class Rabbit {

     @Autowired
     private RabbitTemplate rabbitTemplate;

     @Bean
     public Queue getA(){
         return new Queue("testA");
     }

     @Bean
     public Queue getB(){
         return new Queue("testB");

     }

     @Bean
     public Queue getC(){
         return new Queue("testC");
     }

     @Bean
     FanoutExchange fanoutExchange(){
         return new FanoutExchange("code");
     }


     @Bean
     Binding bindingExchangeA(Queue getA,FanoutExchange fanoutExchange) {
          return BindingBuilder.bind(getA).to(fanoutExchange);
     }

     @Bean
     Binding bindingExchangeB(Queue getB, FanoutExchange fanoutExchange) {
          return BindingBuilder.bind(getB).to(fanoutExchange);
     }

     @Bean
     Binding bindingExchangeC(Queue getC, FanoutExchange fanoutExchange) {
          return BindingBuilder.bind(getC).to(fanoutExchange);
     }


}
