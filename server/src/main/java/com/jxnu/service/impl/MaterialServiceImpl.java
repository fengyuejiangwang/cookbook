package com.jxnu.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.jxnu.entity.Material;
import com.jxnu.mapper.MaterialMapper;
import com.jxnu.service.IMaterialService;
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
 * @since 2023-02-05
 */
@Service
public class MaterialServiceImpl extends ServiceImpl<MaterialMapper, Material> implements IMaterialService {
    @Resource
    MaterialMapper materialMapper;
    @Override
    public List<Material> findMaterialByCookId(Long id) {
        QueryWrapper<Material> queryWrapper=new QueryWrapper<>();
        queryWrapper.eq("cook_id",id);
        return materialMapper.selectList(queryWrapper);
    }
}
