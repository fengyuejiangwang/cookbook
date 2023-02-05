package com.jxnu.controller;


import com.jxnu.entity.Cook;
import com.jxnu.entity.Material;
import com.jxnu.service.IMaterialService;
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
 * @since 2023-02-05
 */
@RestController
@RequestMapping("/material")
public class MaterialController {
    @Resource
    private IMaterialService iMaterialService;
    @PostMapping("/uploadmaterial")
    public Result uploadMaterial(@RequestBody Material material){
        boolean isSave = iMaterialService.save(material);
        if(isSave){
            return Result.ok().message("菜谱发布成功！");
        }
        return Result.error().message("菜谱发布失败");
    }
}
