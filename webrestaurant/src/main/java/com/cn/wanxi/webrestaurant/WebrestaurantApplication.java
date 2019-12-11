package com.cn.wanxi.webrestaurant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@SpringBootApplication
public class WebrestaurantApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebrestaurantApplication.class, args);
    }
    /**
     * 返回页面
     *
     * @return
     */
    @RequestMapping("/rest")
    public String aa() {
        return "index";
    }
}
