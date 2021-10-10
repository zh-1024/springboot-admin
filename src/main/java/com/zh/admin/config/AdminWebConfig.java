package com.zh.admin.config;

import com.zh.admin.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @ClassName AdminWebConfig
 * @Date 2021/10/10 14:37
 * @Author zhang hui
 * @Description TODO
 */

@Configuration
public class AdminWebConfig implements WebMvcConfigurer {

    /**
     * @Description: 添加自定义拦截器,并配置要拦截哪些路径
     * @author zhanghui
     * @date 2021/10/10 14:39
     * @param registry
     * @return void
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginInterceptor())
                .addPathPatterns("/**") //拦截所有路径 包括静态资源
                .excludePathPatterns("/","/login") //除去"/"与"/login“ 这两个与登陆有关的路径
                .excludePathPatterns("/css/**","/fonts/**","/images/**","/js/**");//放行静态资源

    }
}
