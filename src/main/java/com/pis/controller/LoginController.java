package com.pis.controller;

import com.pis.entity.User;
import org.springframework.stereotype.Controller;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2018-01-19.
 */
@Controller
@RequestMapping("/")
public class LoginController extends  AbstractController{
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping("/toLogin")
    public String toLogin(Model model){
        model.addAttribute("ctx", getContextPath()+"/");
        System.out.println(getContextPath()+"/");
        return "login";
    }

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    @ResponseBody
    public Map<String,Object> login(HttpServletRequest request, HttpServletResponse response){
        request.setAttribute("ctx",request.getContextPath());
        Map<String,Object> map =new HashMap<String,Object>();
        String userName=request.getParameter("userName");
        String password=request.getParameter("password");
        System.out.println(userName+"/"+password);
        if(!userName.equals("") && password!=""){
            User user =new User();
            user.setName(userName);
            user.setPassword(password);
            request.getSession().setAttribute("user",user);
            map.put("result","1");
        }else{
            map.put("result","0");
        }
        return map;
    }
}
