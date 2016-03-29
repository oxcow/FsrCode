package com.leeyee.xcode.redis.web;

import com.google.common.collect.Maps;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

/**
 * Created by leeyee on 16-3-25.
 */
@Controller
public class IndexController {
    @RequestMapping("/helloWorlds")
    public ModelAndView helloWorld(Model model) {
        model.addAttribute("message", "Hello World!");
        return new ModelAndView("helloWorld");
    }

    @RequestMapping("/helloWorld.do")
    public String ftlHelloWorld(Model model) {
        model.addAttribute("message", "Freemarker Hello World!");
        return "helloWorld";
    }

    @RequestMapping("/b.do")
    @ResponseBody
    public String bodyt() {
        return "fdasfsafasfsadfasdfds";
    }

    @RequestMapping("/mp.do")
    @ResponseBody
    public Map mp() {
        Map<String, String> map = Maps.newHashMap();
        map.put("a", "131231");
        map.put("b", "1bbbbb31231");
        return map;
    }
}
