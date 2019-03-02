package com.example.myschedule.controller;

import com.example.myschedule.bean.TaskBean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author wxy
 * @create 2019-03-02 11:32
 **/
@Controller
public class IndexController {
    @GetMapping(value = "/index.do")
    public String index() {

        return "index";
    }
}
