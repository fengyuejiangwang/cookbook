package com.jxnu.controller;

import com.baomidou.mybatisplus.core.toolkit.ObjectUtils;
import com.jxnu.entity.Comment;
import com.jxnu.entity.Cook;
import com.jxnu.service.ICommentService;
import com.jxnu.utils.Result;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
@RestController
@RequestMapping("/comment")
public class CommentController {
    @Resource
    private ICommentService iCommentService;
    @PostMapping("/getcomment")
    public Result getcomment(@RequestBody Cook cook) {
        List<Comment> CommentList= iCommentService.findCommentByCookId(cook.getId());
        if(!ObjectUtils.isEmpty(CommentList)){
            return Result.ok(CommentList).message("获取菜谱评论信息成功");
        }
        return Result.error().message("获取菜谱用料评论失败");
    }
    @PostMapping("/publishcomment")
    public Result publishcomment(@RequestBody Comment comment) {
       Boolean publish=iCommentService.save(comment);
        if(!ObjectUtils.isEmpty(publish)){
            return Result.ok(publish).message("评论菜谱成功");
        }
        return Result.error().message("评论菜谱失败");
    }
}
