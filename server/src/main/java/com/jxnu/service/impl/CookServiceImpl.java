package com.jxnu.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.jxnu.entity.Cook;
import com.jxnu.mapper.CookMapper;
import com.jxnu.service.ICookService;
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
 * @since 2022-12-12
 */
@Service
public class CookServiceImpl extends ServiceImpl<CookMapper, Cook> implements ICookService {
    @Resource
    private CookMapper cookMapper;
    @Override
    public List<Cook> getDailyHotCook() {
        QueryWrapper<Cook> queryWrapper=new QueryWrapper<>();
        queryWrapper.orderByDesc("views")
                    .orderByAsc("id");;
        return cookMapper.selectList(queryWrapper.last("limit 8"));
    }

    @Override
    public Long getUserId(Cook cook) {
        QueryWrapper<Cook> queryWrapper=new QueryWrapper<>();
        queryWrapper.eq("id",cook.getId());
        return cookMapper.selectOne(queryWrapper).getUserId();
    }

    @Override
    public Cook getCookDetail(Long id) {
        QueryWrapper<Cook> queryWrapper=new QueryWrapper<>();
        queryWrapper.eq("id",id);
        return cookMapper.selectOne(queryWrapper);
    }

}
