package com.bing.lan.springboot._04_fastjson;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author lanbing
 */

@RestController
@RequestMapping("/json")
public class JsonController {

    @RequestMapping(value = "/json", method = RequestMethod.GET)
    public Foo json() {

        Foo foo = new Foo();
        foo.name = "lan";
        foo.age = "12";
        foo.date = new Date();

        return foo;
    }

    class Foo {

        public String name;
        public String age;

        //@JSONField(format = "yyyy-MM-dd HH:mm:ss")
        public Date date;//返回时间戳
    }

}
