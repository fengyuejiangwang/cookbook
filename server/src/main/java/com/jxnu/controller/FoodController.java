package com.jxnu.controller;


import com.baomidou.mybatisplus.core.toolkit.ObjectUtils;
import com.jxnu.entity.Food;
import com.jxnu.service.IFoodService;
import com.jxnu.utils.Result;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author h.h.Huang
 * @since 2023-01-31
 */
@RestController
@RequestMapping("/food")
public class FoodController {
    @Resource
    private IFoodService iFoodService;
    @PostMapping("/foodinfo")
    public Result getFoodInfo(Food food){
        Food food1 = iFoodService.findFoodInfoById(food.getId());
        if(!ObjectUtils.isEmpty(food1)){
            return Result.ok(food1).message("获取食物信息成功");
        }
        return Result.error().message("获取食物信息失败");
    }
}
