package com.example.controller;

import com.example.properties.GirlProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * Created by tianyang on 2018/6/11.
 */
//@RestController  相当于@Controller+ @ResponseBody
@RestController
@RequestMapping("/hello")
public class HelloController {

    @Value("${cupSize}")
    private String cupSize;

    @Value("${age}")
    private Integer age;

    @Value("${content}")
    private String content;

    @Autowired
    private GirlProperties girlProperties;

//    value = {"/hello","hi"} 多url配置
//    @RequestMapping(value = "/say/{id}", method = RequestMethod.GET)
    @GetMapping(value = "/say/{id}")
    public String say(@PathVariable("id") Integer id,
                      @RequestParam(value = "id", required = false, defaultValue = "0") Integer mId) {
        return "id: " + id + "   mid: " + mId;
//        return girlProperties.getCupSize();
    }


}
