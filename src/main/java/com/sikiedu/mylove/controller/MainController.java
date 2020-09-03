package com.sikiedu.mylove.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Administrator
 * @date 2020/9/2 0002 21:22:57
 * @description
 */

@Controller
public class MainController {

    @RequestMapping("/love")
    public String love(){

        System.out.println("我爱你! !");
        return "love.html";

    }





}
