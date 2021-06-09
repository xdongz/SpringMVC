package com.tongy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

  @RequestMapping("/hello")
  public String test(Model model) {
    model.addAttribute("msg", "HelloSpringMVCAnnotation");
    return "hello";
  }

  @RequestMapping("/t2")
  public String test2(Model model) {
    model.addAttribute("msg", "Hellot2");
    return "hello";
  }

}
