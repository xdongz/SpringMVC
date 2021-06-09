package com.tongy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RestfulController {

  // 原来的方式需要访问： http://localhost:8080/annotationmvc-03/admin?a=1&b=2
  @RequestMapping("/admin")
  public String index(int a, int b, Model model) {
    int result = a+b;
    model.addAttribute("msg", "测试结果为："+ result);
    return "hello";
  }

  // Restful风格
  @RequestMapping("/commit/{a}/{b}")
  public String index2(@PathVariable int a, @PathVariable int b, Model model) {
    int result = a+b;
    model.addAttribute("msg", "测试结果为："+ result);
    return "hello";
  }

  // 如果是get类型的request直接用@GetMapping
  // 同样的还有@PostMapping @PutMapping @DeleteMapping @PatchMapping
  @GetMapping("/t3/{a}/{b}")
  public String index3(@PathVariable int a, @PathVariable int b, Model model) {
    int result = a+b;
    model.addAttribute("msg", "测试结果为："+ result);
    return "hello";
  }

}
