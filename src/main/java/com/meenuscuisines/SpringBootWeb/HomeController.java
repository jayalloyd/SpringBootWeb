package com.meenuscuisines.SpringBootWeb;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;
import java.io.PrintWriter;

@Controller //annotation used above controller class
public class HomeController  {
     @RequestMapping("/")//annotation for mapping
    public String home(){
        return "index.jsp";
    }
  @RequestMapping("add")//path that is given in index jsp page form tag uses Dispatcher Servlet
//    public String add(HttpServletRequest req, HttpSession session){//Now using servlet only...
//         int num1= Integer.parseInt(req.getParameter("num1"));
//      int num2= Integer.parseInt(req.getParameter("num2"));
//      int result=num1+num2;
//      System.out.println("Result added");
//
//     //when we call add,dispatcher servlet is calling Result.jsp,ie two different pages
//      // using session of servlet we can display result in a page
//      session.setAttribute("result",result);
//      //in result.jsp using session we can display the result <%=session.getAttribute("result)%>
//      //either JSTL Expression language ${result}
//      return "Result.jsp";
//    }
//    public String add(@RequestParam("num1")int num1, @RequestParam("num2")int num2, HttpSession session){//Now using request param only..removing HTTpServletrequest
//
//        int result=num1+num2;
//        System.out.println("Result added");
//
//        //when we call add,dispatcher servlet is calling Result.jsp,ie two different pages
//        // using session of servlet we can display result in a page
//        session.setAttribute("result",result);
//        //in result.jsp using session we can display the result <%=session.getAttribute("result)%>
//        //either JSTL Expression language ${result}
//        return "Result.jsp";
//    }
    public String add(@RequestParam("num1")int num1, @RequestParam("num2")int num2, Model model){//Now using model object to get rid of HttpSession
        int result=num1+num2;
        System.out.println("Result added");

        //when we call add,dispatcher servlet is calling Result.jsp,ie two different pages
        // using session of servlet we can display result in a page
       model.addAttribute("result",result);
        //in result.jsp using session we can display the result <%=session.getAttribute("result)%>
        //either JSTL Expression language ${result}
        return "Result.jsp";
    }
}
