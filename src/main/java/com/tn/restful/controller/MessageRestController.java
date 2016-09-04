package com.tn.restful.controller;

import com.tn.restful.domain.Message;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by thangnguyen-imac on 9/3/16.
 */
@RestController
public class MessageRestController {

    @RequestMapping("/")
    public String welcome(){
        return "Welcome to Rest Example";
    }

    @RequestMapping("/hello/{player}")
    public Message message(@PathVariable String player){
        Message msg = new Message(player, "Hello World " + player);
        return msg;
    }
}
