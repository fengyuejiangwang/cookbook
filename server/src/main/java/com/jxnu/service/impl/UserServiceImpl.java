package com.jxnu.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.jxnu.entity.User;
import com.jxnu.dao.UserMapper;
import com.jxnu.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author h.h.Huang
 * @since 2022-11-13
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Override
    public List<User> findUserListByRealName(String realName) {
        char realNames[] = realName.toCharArray();
        realName="";
        for(int i=0;i<realNames.length;i++){
            realName+="%"+realNames[i];
        }
        QueryWrapper queryWrapper = new QueryWrapper<>();
        queryWrapper.likeRight("real_name",realName);
        return baseMapper.selectList(queryWrapper);
    }
}
