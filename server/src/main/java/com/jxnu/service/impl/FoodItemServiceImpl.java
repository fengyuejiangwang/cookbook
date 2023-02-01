package com.jxnu.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.jxnu.entity.FoodItem;
import com.jxnu.mapper.FoodItemMapper;
import com.jxnu.service.IFoodItemService;
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
public class FoodItemServiceImpl extends ServiceImpl<FoodItemMapper, FoodItem> implements IFoodItemService {
    @Resource
    FoodItemMapper foodItemMapper;
    @Override
    public List<FoodItem> findMaterialByCookId(Long id) {
        QueryWrapper<FoodItem> queryWrapper=new QueryWrapper<>();
        queryWrapper.eq("cook_id",id);
        return foodItemMapper.selectList(queryWrapper);
    }
}
