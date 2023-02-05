package com.jxnu.controller;


import com.baomidou.mybatisplus.core.toolkit.ObjectUtils;
import com.jxnu.entity.Cook;
import com.jxnu.entity.Material;
import com.jxnu.entity.Step;
import com.jxnu.service.IMaterialService;
import com.jxnu.service.IStepService;
import com.jxnu.utils.Result;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author h.h.Huang
 * @since 2023-02-01
 */
@RestController
@RequestMapping("/step")
public class StepController {
    @Resource
    private IStepService iStepService;
    @PostMapping("/stepinfo")
    public Result getStep(@RequestBody Cook cook){
        List<Step> stepList=iStepService.findStepListByCookId(cook.getId());
        if(!ObjectUtils.isEmpty(stepList)){
            return Result.ok(stepList).message("获取菜谱步骤信息成功");
        }
        return Result.error().message("获取菜谱步骤信息失败");
    }
    @PostMapping("/uploadstep")
    public Result uploadMaterial(@RequestBody Step step){
        boolean isSave = iStepService.save(step);
        if(isSave){
            return Result.ok().message("菜谱发布成功！");
        }
        return Result.error().message("菜谱发布失败");
    }
}
