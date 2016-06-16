package com.example.controller;

import com.example.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Thilina on 6/16/16.
 */
@Controller
public class MyController {

    @Autowired
    MyService myService;

    @ResponseBody
    @RequestMapping(value = "/something", method = RequestMethod.GET)
    public String getSomething() {
        try {
            myService.myRetryableMethod();
        } catch (Exception e) {
            System.out.println("caught exception");
        }
        return "done";
    }

}
