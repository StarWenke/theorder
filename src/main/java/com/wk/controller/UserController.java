package com.wk.controller;


import com.wk.service.UserService;
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


    @PostMapping("/cancel")
    public String cancle (@RequestParam("c_id") String c_id
            ,@RequestParam("o_id") String o_id){
        UserService.cancelOrder(c_id, o_id);
        return "/common/success";
    }
}

