package com.tongy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RedirectController {

  // 重定向
  // 不需要视图解析器，本质就是重新请求一个新地方，所以注意路径问题
  // 视图解析器是用来拼接路径的
  // 加了redirect或forward就不走视图解析器了
  @RequestMapping("/m1/t1")
  public String test() {
    return "redirect:/index.jsp";
  }

}
