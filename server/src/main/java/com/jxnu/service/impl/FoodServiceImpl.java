package com.jxnu.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.jxnu.entity.Food;
import com.jxnu.mapper.FoodMapper;
import com.jxnu.service.IFoodService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author h.h.Huang
 * @since 2023-01-31
 */
@Service
public class FoodServiceImpl extends ServiceImpl<FoodMapper, Food> implements IFoodService {
   @Resource
   private FoodMapper foodMapper;
    @Override
    public Food findFoodInfoById(Long id) {
        QueryWrapper<Food> queryWrapper=new QueryWrapper<>();
        queryWrapper.eq("id",id);
        return foodMapper.selectOne(queryWrapper);
    }

    @Override
    public List<Food> getHotFood() {
        QueryWrapper<Food> queryWrapper=new QueryWrapper<>();
        queryWrapper.orderByDesc("views")
                .orderByAsc("id");
        return foodMapper.selectList(queryWrapper.last("limit 12"));
    }
}
