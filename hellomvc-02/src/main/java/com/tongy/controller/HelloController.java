package com.tongy.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class HelloController implements Controller {

  @Override
  public ModelAndView handleRequest(HttpServletRequest httpServletRequest,
      HttpServletResponse httpServletResponse) throws Exception {
    ModelAndView mv = new ModelAndView();

    mv.addObject("msg", "HelloSpringMVC!");
    // 该名字用来拼接成页面的存放路径
    mv.setViewName("hello"); // : /WEB-INF/jsp/hello.jsp
    return mv;
  }
}
