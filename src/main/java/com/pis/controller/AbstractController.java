package com.pis.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Administrator on 2018-01-18.
 */
@Controller
public abstract class AbstractController {
    protected Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private HttpServletRequest request;

    protected String getContextPath(){
        return request.getContextPath();
    }
}
