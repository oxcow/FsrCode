package com.leeyee.xcode.redis.web;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by leeyee on 16-3-27.
 */
@Controller
public class RedisQueryController {

    @RequestMapping("/redis")
    public String query(@RequestParam("method") String method,
                        @RequestParam("key") String key) {


        return "redis query controller";

    }

}
