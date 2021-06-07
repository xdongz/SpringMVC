package com.tongy.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// 注意：运行这个module，访问的url应该是 http://localhost:8080/servlet-01/hello
public class HelloSevlet extends HttpServlet {

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
    System.out.println("进入了doGet方法=======");
    // 设置响应类型:
    resp.setContentType("text/html");
    // 获取输出流:
    PrintWriter pw = resp.getWriter();
    // 写入响应:
    pw.write("<h1>Hello, world!</h1>");
    // 最后不要忘记flush强制输出:
    pw.flush();
  }

}
