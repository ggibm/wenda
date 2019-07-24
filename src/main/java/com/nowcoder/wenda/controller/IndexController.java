package com.nowcoder.wenda.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author bsc
 * @create 2019/7/24 - 22:02
 */
@Controller
public class IndexController {

    @RequestMapping(path = {"/", "index"})
    @ResponseBody
    public String index() {
        return "Hello NowCoder";
    }

    @RequestMapping(path = {"/profile/{groupId}/{userId}"})
    @ResponseBody
    public String profile(@PathVariable("userId") int userId,
                          @PathVariable("groupId")  String groupId) {
        return String.format("Profile Page of %s %d", groupId, userId);
    }

}
