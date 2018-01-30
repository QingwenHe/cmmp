package com.hqw.cmmp.center.user.controller;

import com.hqw.cmmp.center.user.entity.User;
import com.hqw.cmmp.center.user.service.UserService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;


@RestController
@RequestMapping("/user")
public class HelloController {

    @Resource
    private UserService userService;

    @ResponseBody
    @ApiOperation(value = "获取单个用户的详细信息", notes = "根据url的id来获取用户的详细信息")
    @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "Long", paramType = "path")
    @RequestMapping(value = "/getUser/{id}", method = RequestMethod.GET)
    public User getUser(@PathVariable("id")  Long id) {
        User user = userService.getUser(id);
        user.setName("Big's" + user.getName());
        return user;
    }
}
