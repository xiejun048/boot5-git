package com.example.boot2.com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName : Hello
 * @Description :
 * @Author : jxie
 * @Date: 2020-07-29 22:44
 */
@RestController
public class Hello {
    @RequestMapping("info")
    public String say(){
        return "hello word";
    }
    //呃呃呃呃呃呃呃呃呃呃呃呃
}
