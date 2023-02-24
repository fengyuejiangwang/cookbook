package com.jxnu.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jxnu.entity.Comment;

import java.util.List;

public interface ICommentService extends IService<Comment> {
    List<Comment> findCommentByCookId(Long id);

}
