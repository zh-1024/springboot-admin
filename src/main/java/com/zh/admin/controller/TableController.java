package com.zh.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

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
    public String dynamicTable(){
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
