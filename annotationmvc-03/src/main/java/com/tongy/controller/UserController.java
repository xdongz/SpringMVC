package com.tongy.controller;

import com.tongy.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {

  // @RequestParam表示传入参数的变量名
  // localhost:8080/user/t1?username=xxx
  @GetMapping("/t1")
  public String test1(@RequestParam("username") String name, Model model) {
    // 1. 接受前端参数
    System.out.println("接收前端参数为： " + name);

    // 2. 将返回的结果传递给前端
    model.addAttribute("msg", name);

    // 3. 视图跳转
    return "hello";
  }

  @GetMapping("/t2")
  @ResponseBody // 加了@ResponseBody之后就不会走视图解析器了。（@Controller + @ResponseBody 和 @RestController一样）
  public String test2(User user) {
    System.out.println(user);

    // 3. 视图跳转
    return "hello";
  }

}
