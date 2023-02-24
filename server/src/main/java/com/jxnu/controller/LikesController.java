package com.jxnu.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.ObjectUtils;
import com.jxnu.entity.Cook;
import com.jxnu.entity.Likes;
import com.jxnu.entity.User;
import com.jxnu.service.ICookService;
import com.jxnu.service.ILikesService;
import com.jxnu.service.IUserService;
import com.jxnu.utils.Result;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author h.h.Huang
 * @since 2023-02-24
 */
@RestController
@RequestMapping("/likes")
public class LikesController {
    @Resource
    private ILikesService iLikesService;
    @Resource
    private ICookService iCookService;
    @Resource
    private IUserService iUserService;
    @PostMapping("/judgecollect")
    public Result judgeCollect(@RequestBody Likes likes) {
       Boolean isLike = iLikesService.judgeCollect(likes);
        if(isLike){
            return Result.ok(isLike).message("收藏菜谱成功");
        }
        return Result.error().message("收藏菜谱失败");
    }
    @PostMapping("/judgeattention")
    public Result judgeAttention(@RequestBody Likes likes) {
        Boolean isLike = iLikesService.judgeAttention(likes);
        if(isLike){
            return Result.ok(isLike).message("关注成功");
        }
        return Result.error().message("关注失败");
    }
    @PostMapping("/collect")
    public Result collect(@RequestBody Likes likes) {
        Boolean isCollect= iLikesService.save(likes);
        if(isCollect){
            Long newCollections=iCookService.getCookDetail(likes.getCookId()).getCollections();
            Cook cook=new Cook();
            cook.setId(likes.getCookId());
            cook.setCollections(++newCollections);
            System.out.println(newCollections);
            iCookService.updateById(cook);
            return Result.ok(isCollect).message("收藏菜谱成功");
        }
        return Result.error().message("收藏菜谱失败");
    }
    @PostMapping("/attention")
    public Result attention(@RequestBody Likes likes) {
        Boolean isAttention= iLikesService.save(likes);
        if(isAttention){
            Long newFollowerCount=iUserService.findUserById(likes.getFollowerId()).getFollowerCount();
            User user=new User();
            user.setId(likes.getFollowerId());
            user.setFollowerCount(++newFollowerCount);
            iUserService.updateById(user);
            return Result.ok(isAttention).message("关注成功");
        }
        return Result.error().message("关注失败");
    }
    @PostMapping("/decollect")
    public Result deCollect(@RequestBody Likes likes) {
        QueryWrapper queryWrapper=new QueryWrapper<>().eq("cook_id",likes.getCookId())
                .eq("followee_id",likes.getFolloweeId());
        Boolean deCollect= iLikesService.remove(queryWrapper);
        if(deCollect){
            Long newCollections=iCookService.getCookDetail(likes.getCookId()).getCollections();
            Cook cook=new Cook();
            cook.setId(likes.getCookId());
            cook.setCollections(--newCollections);
            iCookService.updateById(cook);
            return Result.ok(deCollect).message("取消收藏菜谱成功");
        }
        return Result.error().message("取消收藏菜谱失败");
    }
    @PostMapping("/deattention")
    public Result deAttention(@RequestBody Likes likes) {
        QueryWrapper queryWrapper=new QueryWrapper<>().eq("follower_id",likes.getFollowerId())
                .eq("followee_id",likes.getFolloweeId());
        Boolean deAttention= iLikesService.remove(queryWrapper);
        if(deAttention){
            Long newFollowerCount=iUserService.findUserById(likes.getFollowerId()).getFollowerCount();
            User user=new User();
            user.setId(likes.getFollowerId());
            user.setFollowerCount(--newFollowerCount);
            iUserService.updateById(user);
            return Result.ok(deAttention).message("取消关注成功");
        }
        return Result.error().message("取消关注失败");
    }
}
