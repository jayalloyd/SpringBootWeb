package com.meenuscuisines.SpringBootWeb;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;
import java.io.PrintWriter;

@Controller //annotation used above controller class
public class HomeController  {
     @RequestMapping("/")//annotation for mapping
    public String home(){
        return "index.jsp";
    }
  @RequestMapping("add")//path that is given in index jsp page form tag uses Dispatcher Servlet
    public String add(HttpServletRequest req){//Now using servlet only...
         int num1= Integer.parseInt(req.getParameter("num1"));
      int num2= Integer.parseInt(req.getParameter("num2"));
      int result=num1+num2;
      System.out.println("Result added");

      return "Result.jsp";
    }
}
