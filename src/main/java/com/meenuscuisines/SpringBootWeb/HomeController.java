package com.meenuscuisines.SpringBootWeb;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServlet;
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
}
