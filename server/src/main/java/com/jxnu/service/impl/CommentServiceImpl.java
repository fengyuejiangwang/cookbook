package com.jxnu.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jxnu.entity.Comment;
import com.jxnu.entity.Cook;
import com.jxnu.entity.Material;
import com.jxnu.mapper.CommentMapper;
import com.jxnu.mapper.CookMapper;
import com.jxnu.service.ICommentService;
import com.jxnu.service.ICookService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class CommentServiceImpl extends ServiceImpl<CommentMapper, Comment> implements ICommentService {

    @Resource
    private CommentMapper commentMapper;
    @Override
    public List<Comment> findCommentByCookId(Long id) {
        QueryWrapper<Comment> queryWrapper=new QueryWrapper<>();
        queryWrapper.eq("cook_id",id);
        return commentMapper.selectList(queryWrapper);
    }


}
