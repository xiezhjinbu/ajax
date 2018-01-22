package com.pis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2018-01-19.
 */
@Controller
public class IndexController  extends  AbstractController{

    @RequestMapping("/main")
    public String main(Model model){
        model.addAttribute("ctx", getContextPath()+"/");
        return "main";
    }

    @RequestMapping("/index")
    public String index(Model model){
        model.addAttribute("ctx", getContextPath()+"/");
        return "index";
    }
}
