package com.zh.admin.controller;

import com.sun.org.apache.xpath.internal.operations.Mod;
import com.sun.xml.internal.bind.v2.TODO;
import com.zh.admin.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.jws.WebParam;
import javax.servlet.http.HttpSession;

@Controller
public class IndexController {


    /**
     * @Description: 使请求地址+/与请求地址+/login跳转到登陆页面
     * @author zhanghui
     * @date 2021/10/9 21:21
     * @return java.lang.String
     */
    @GetMapping(value = {"/","/login"})
    public String LoginPage(){
        return "login";
    }

    /**
     * @Description: 处理用户登陆请求，登陆成功重定向到/main.html 防止表单重复刷新
     * @author zhanghui
     * @date 2021/10/9 21:28
     * @param user
     * @return java.lang.String
     */
    @PostMapping("/login")
    public String login(User user, Model model, HttpSession session){
        System.out.println(user);
        if(user.getUsername().equals("zh")&&user.getPassword().equals("123")) {
            session.setAttribute("user",user);
            return "redirect:/main.html";
        }
        else
        {
            model.addAttribute("msg","账号或密码错误");
            return "login";
        }

    }

    @GetMapping("/main.html")
    public String mainPage(HttpSession session, Model model){
        return "main";
    }
}
