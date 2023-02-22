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
 * @since 2022-12-13
 */
public interface IUserService extends IService<User> {
    User findUserById(Long id);
    List<User> getGourmetDaren();

    List<User> findUserListById(List<User> userList);
}
