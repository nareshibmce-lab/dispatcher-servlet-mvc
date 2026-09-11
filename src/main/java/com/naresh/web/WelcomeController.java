package com.naresh.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class WelcomeController implements Controller {

  @Override
  public ModelAndView handleRequest(
      HttpServletRequest arg0,
      HttpServletResponse arg1) throws Exception {
    ModelAndView mav = new ModelAndView("welcome");

    mav.addObject("message", "dispatcherServlet successfully routed this request.");
    mav.addObject("name", "Naresh");

    return mav;
  }

}
