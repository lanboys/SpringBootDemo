package com.bing.lan.springboot._01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 蓝兵 on 2018/6/6.
 */

@RestController
@RequestMapping("/hello")
public class HelloController {

    @Value("${name}")
    private String name;

    @Value("${age}")
    private String age;

    @Value("${boyInfo}")
    private String boyInfo;

    @Autowired
    private GirlProperties girlProperties;

    @RequestMapping(value = {"/hello", "/hi"}, method = RequestMethod.GET)
    public String sayHello() {

        //return "Hello SpringBoot";
        return girlProperties.toString() + " " + boyInfo + " " + name + " " + age;
    }
}
