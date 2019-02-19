package com.demo1.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author wangzihang
 * @createTime 2019/2/19
 * @description
 */
@Controller
public class HelloController {

    @RequestMapping("/index")
    public String index(ModelMap map) {

        map.addAttribute("host", "http://blog.didispace.com");

        return "index";
    }

}
