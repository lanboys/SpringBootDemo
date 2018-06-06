package com.bing.lan.springboot._03_param;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author lanbing
 */

@RestController
@RequestMapping("/param")
public class ParamController {

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public String param(@RequestParam(value = "id", required = true,defaultValue = "111") Integer myId) {
        return "Id: " + myId;
    }
}
