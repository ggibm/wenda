package com.nowcoder.wenda.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author bsc
 * @create 2019/7/24 - 22:02
 */
@Controller
public class IndexController {

    @RequestMapping("/")
    @ResponseBody
    public String index() {
        return "Hello NowCoder";
    }
}
