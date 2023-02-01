package com.jxnu.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.jxnu.entity.Step;
import com.jxnu.mapper.StepMapper;
import com.jxnu.service.IStepService;
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
 * @since 2023-02-01
 */
@Service
public class StepServiceImpl extends ServiceImpl<StepMapper, Step> implements IStepService {
   @Resource
   private StepMapper stepMapper;
    @Override
    public List<Step> findStepListByCookId(Long id) {
        QueryWrapper<Step> queryWrapper=new QueryWrapper<>();
        queryWrapper.eq("cook_id",id);
        return stepMapper.selectList(queryWrapper);
    }
}
