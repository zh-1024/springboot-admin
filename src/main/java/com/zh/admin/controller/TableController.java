package com.zh.admin.controller;

import com.zh.admin.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

/**
 * @ClassName TableController
 * @Date 2021/10/9 22:00
 * @Author zhang hui
 * @Description TODO
 */

@Controller
public class TableController {

    /**
     * @Description: 跳转到basic_html页面
     * @author zhanghui
     * @date 2021/10/9 22:02
     * @return java.lang.String
     */
    @GetMapping("/basic_table")
    public String basicTable(){
        return "table/basic_table";
    }

    /**
     * @Description: 跳转到dynamic_table页面
     * @author zhanghui
     * @date 2021/10/9 22:08
     * @param
     * @return java.lang.String
     */
    @GetMapping("/dynamic_table")
    public String dynamicTable(Model model){
        List<User> users = Arrays.asList(new User("zh", "123"),
                new User("zh1", "123"),
                new User("zh2", "123"),
                new User("zh3", "123"));
        model.addAttribute("users",users);          //将用户列表放在请求域中
        return "table/dynamic_table";
    }

    /**
     * @Description: 跳转到editable_table页面
     * @author zhanghui
     * @date 2021/10/9 22:08
     * @param
     * @return java.lang.String
     */
    @GetMapping("/editable_table")
    public String editableTable(){
        return "table/editable_table";
    }

    /**
     * @Description: 跳转到pricing_table页面
     * @author zhanghui
     * @date 2021/10/9 22:09
     * @param
     * @return java.lang.String
     */
    @GetMapping("/pricing_table")
    public String pricingTable(){
        return "table/pricing_table";
    }

    /**
     * @Description: 跳转到responsive_table页面
     * @author zhanghui
     * @date 2021/10/9 22:10
     * @param
     * @return java.lang.String
     */
    @GetMapping("/responsive_table")
    public String responsiveTable(){
        return "table/responsive_table";
    }
}
