package com.naresh.web;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AboutController implements Controller {
    public ModelAndView handleRequest( HttpServletRequest arg0,
                                       HttpServletResponse arg1){
        ModelAndView mav = new ModelAndView("about");

        mav.addObject("name", "Naresh");
        mav.addObject("page","About Page");

        return mav;
    }
}
