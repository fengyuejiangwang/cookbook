package com.jxnu.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.jxnu.entity.User;
import com.jxnu.mapper.UserMapper;
import com.jxnu.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author h.h.Huang
 * @since 2022-12-13
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public User findUserById(Long id) {
        QueryWrapper<User> queryWrapper=new QueryWrapper<>();
        queryWrapper.eq("id",id);
        return userMapper.selectOne(queryWrapper);
    }

    @Override
    public List<User> getGourmetDaren() {
        QueryWrapper<User> queryWrapper=new QueryWrapper<>();
        queryWrapper.orderByDesc("follower_Count")
                    .orderByAsc("id");
        return userMapper.selectList(queryWrapper.last("limit 5"));
    }

    @Override
    public List<User> findUserListById(List<User> userList) {
        List<User> users=new ArrayList<>();
        for (int i=0;i<userList.size();i++){
            QueryWrapper<User> queryWrapper=new QueryWrapper<>();
            queryWrapper.eq("id",userList.get(i).getId());
            users.add(userMapper.selectOne(queryWrapper));
        }
        return users;
    }

}
