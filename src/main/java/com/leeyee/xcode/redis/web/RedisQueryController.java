package com.leeyee.xcode.redis.web;


import com.leeyee.xcode.redis.service.RedisService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

/**
 * Created by leeyee on 16-3-27.
 */
@Controller
@RequestMapping("/redis")
public class RedisQueryController {

    @Resource
    private RedisService redisService;

    @RequestMapping("/index")
    public String index() throws Exception{
        return "index";
    }


    @RequestMapping("/get")
    @ResponseBody
    public String get(@RequestParam("k") String k) {
        return redisService.get(k);

    }

    @RequestMapping("/set")
    @ResponseBody
    public String set(@RequestParam("k") String k, @RequestParam("v") String v) {
        redisService.set(k, v);
        return "设置成功";
    }


}
