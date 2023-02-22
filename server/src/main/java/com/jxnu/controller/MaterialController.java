package com.jxnu.controller;


import com.baomidou.mybatisplus.core.toolkit.ObjectUtils;
import com.jxnu.entity.Cook;
import com.jxnu.entity.Food;
import com.jxnu.entity.Material;
import com.jxnu.service.IFoodService;
import com.jxnu.service.IMaterialService;
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
 * @since 2023-02-05
 */
@RestController
@RequestMapping("/material")
public class MaterialController {
    @Resource
    private IMaterialService iMaterialService;
    @Resource
    private IFoodService iFoodServicee;
    @PostMapping("/uploadmaterial")
    public Result uploadMaterial(@RequestBody List<Material> materialList){
        for(int i=0;i<materialList.size();i++) {
            Food food = iFoodServicee.findFoodByFoodName(materialList.get(i).getFoodName());
            if (!ObjectUtils.isEmpty(food)) {
                materialList.get(i).setFoodId(food.getId());
            }
        }
        boolean isSave = iMaterialService.saveBatch(materialList);
        if(isSave){
            return Result.ok().message("菜谱发布成功！");
        }
        return Result.error().message("菜谱发布失败");
    }
}
