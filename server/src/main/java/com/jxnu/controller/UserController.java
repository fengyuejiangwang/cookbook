package com.jxnu.controller;


import com.baomidou.mybatisplus.core.toolkit.ObjectUtils;
import com.jxnu.entity.User;
import com.jxnu.service.IUserService;
import com.jxnu.utils.Result;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author h.h.Huang
 * @since 2022-11-13
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private IUserService iUserService;
    @PostMapping("/info")
    public Result getInfo(@RequestBody User user) {
        List<User> userList = iUserService.findUserListByRealName(user.getRealName());
        if (!ObjectUtils.isEmpty(userList)) {
            return Result.ok(userList).message("用户信息查询成功");
        }
        return Result.error().message("用户信息查询失败");
    }
}
