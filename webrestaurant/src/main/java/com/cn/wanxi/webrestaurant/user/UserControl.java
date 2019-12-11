package com.cn.wanxi.webrestaurant.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/d")
public class UserControl {


    @RequestMapping(value = "/d")
    @ResponseBody
    public Map<String, String> findall(@RequestBody Map<String,String> param) {
        Map<String, String> map = new HashMap<>();

        map.put("a",param.get("id"));
        map.put("b",param.get("url"));
        return map;
    }
    @RequestMapping("/u")
    public String b() {
        return "user/user";
    }
}
