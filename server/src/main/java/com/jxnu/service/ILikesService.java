package com.jxnu.service;

import com.jxnu.entity.Likes;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author h.h.Huang
 * @since 2023-02-24
 */
public interface ILikesService extends IService<Likes> {

    Boolean judgeCollect(Likes likes);

    Boolean judgeAttention(Likes likes);
}
