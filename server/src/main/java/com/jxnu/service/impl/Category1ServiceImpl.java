package com.jxnu.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.jxnu.entity.Category1;
import com.jxnu.mapper.Category1Mapper;
import com.jxnu.service.ICategory1Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author h.h.Huang
 * @since 2022-11-15
 */
@Service
public class Category1ServiceImpl extends ServiceImpl<Category1Mapper, Category1> implements ICategory1Service {

    @Override
    public Long findCategoryByType(String type) {
        QueryWrapper<Category1> queryWrapper=new QueryWrapper<>();
         queryWrapper.eq(!ObjectUtils.isEmpty(type),"category_name",type);
         Category1 category1=baseMapper.selectOne(queryWrapper);
         return category1.getId();
    }
}
