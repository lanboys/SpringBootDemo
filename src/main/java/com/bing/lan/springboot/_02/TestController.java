package com.bing.lan.springboot._02;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by 蓝兵 on 2018/6/6.
 */

@Controller
@RequestMapping("/test")
public class TestController {

    @RequestMapping(value = "/controller", method = RequestMethod.GET)
    public String controller() {

        return "index";
        //return "Hello SpringBoot controller";
    }
}
