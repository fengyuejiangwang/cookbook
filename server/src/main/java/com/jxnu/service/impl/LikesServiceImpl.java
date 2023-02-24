package com.jxnu.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.jxnu.entity.Likes;
import com.jxnu.mapper.LikesMapper;
import com.jxnu.service.ILikesService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author h.h.Huang
 * @since 2023-02-24
 */
@Service
public class LikesServiceImpl extends ServiceImpl<LikesMapper, Likes> implements ILikesService {
    @Resource
    LikesMapper likesMapper;
    @Override
    public Boolean judgeCollect(Likes likes) {
        QueryWrapper<Likes> queryWrapper=new QueryWrapper<>();
        queryWrapper.exists("select id from likes where followee_id="+ likes.getFolloweeId() +" and cook_id="+ likes.getCookId());
        return likesMapper.exists(queryWrapper);
    }

    @Override
    public Boolean judgeAttention(Likes likes) {
        QueryWrapper<Likes> queryWrapper=new QueryWrapper<>();
        queryWrapper.exists("select id from likes where followee_id="+ likes.getFolloweeId() +" and follower_id="+ likes.getFollowerId());
        return likesMapper.exists(queryWrapper);
    }
}
