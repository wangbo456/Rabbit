package com.zm.controller;

import com.zm.bean.Powar;
import com.zm.service.BdWbService;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
@RequestMapping("test")
public class Acontroller {

   @Autowired
    private BdWbService bdWbService;

    @Autowired
    private AmqpTemplate amqpTemplate;



   @RequestMapping("getA")
    public void  get(){
      List<Powar> list =  bdWbService.getTree();
       System.out.println(list);
   }

}
