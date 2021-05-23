package com.nullv.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.nullv.pojo.User;
import com.nullv.service.UserServiceImpl;
import com.nullv.util.RES;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserServiceImpl userService;

    /**
     * 登录
     *
     * @Author NulLV
     * @creat: 2021-05-19 22:51
     * @return: java.lang.String
     */
    @PostMapping("/login")
    public String getAllVote(@RequestBody String json) {
        RES res = new RES();

        JSONObject jsonObject = JSON.parseObject(json);
        String username = (String) jsonObject.get("username");
        String userpwd = (String) jsonObject.get("password");
        User user = userService.login(username, userpwd);

        if (user == null) {
            res.setCode(500);
            res.setMessage("账号或者密码错误");
        } else {
            res.setCode(200);
            res.setMessage("登陆成功");
            res.setData(user);
        }
        return JSON.toJSONString(res);
    }

}