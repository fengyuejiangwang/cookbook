package com.jxnu.service;

import com.jxnu.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author h.h.Huang
 * @since 2022-11-13
 */
public interface IUserService extends IService<User> {

    List<User> findUserListByRealName(String realName);
}
