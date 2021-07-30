package com.wk.controller;


import com.wk.service.UserService;
import com.wk.service.impl.UserServiceImpl;
import io.swagger.models.auth.In;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 哇卡哇卡
 * @since 2021-07-19
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserServiceImpl userService;

    @PostMapping("/cancel")
    public String cancle (@RequestParam("o_id") Integer o_id){
        userService.cancelOrder(o_id);
        return "/common/success";
    }
}

