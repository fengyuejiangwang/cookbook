package com.jxnu.controller;

import com.baomidou.mybatisplus.core.toolkit.ObjectUtils;
import com.jxnu.entity.Cook;
import com.jxnu.entity.FoodItem;
import com.jxnu.entity.User;
import com.jxnu.service.ICookService;
import com.jxnu.service.IFoodItemService;
import com.jxnu.service.IFoodService;
import com.jxnu.service.IUserService;
import com.jxnu.utils.Result;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author h.h.Huang
 * @since 2022-12-12
 */
@RestController
@RequestMapping("/cook")
public class CookController {
    @Resource
     private ICookService icookService;
    @Resource
    private IUserService iUserService;
    @Resource
    private IFoodService iFoodService;
    @Resource
    private IFoodItemService iFoodItemService;
    @GetMapping ("/dailyhotcook")
    public  Result getDailyHotCook(){
       List<Cook> cookList = icookService.getDailyHotCook();
       Map<String,Cook> map=new HashMap<>();
         for(int i=0;i<cookList.size();i++){
            map.put(iUserService.findUserById(icookService.getUserId(cookList.get(i))).getUsername(),cookList.get(i));
         }
        if(!ObjectUtils.isEmpty(map)){
            return Result.ok(map).message("获取每日精选菜谱信息成功");
        }
        return Result.error().message("获取每日精选菜谱信息失败");
    }
    @PostMapping("/cookdetail")
    public  Result getCookDetail(@RequestBody Cook cook){
        Cook cook1 = icookService.getCookDetail(cook.getId());
        if(!ObjectUtils.isEmpty(cook1)){
            return Result.ok(cook1).message("获取菜谱详细信息成功");
        }
        return Result.error().message("获取菜谱详细信息失败");
    }
    @PostMapping("/authorinfo")
    public  Result getAuthorInfo(@RequestBody Cook cook){
         User user= iUserService.findUserById(icookService.getUserId(cook));
        if(!ObjectUtils.isEmpty(user)){
            return Result.ok(user).message("获取菜谱作者信息成功");
        }
        return Result.error().message("获取菜谱作者信息失败");
    }
    @PostMapping("/material")
    public  Result getMaterial(@RequestBody Cook cook){
        List<FoodItem> foodItemList= iFoodItemService.findMaterialByCookId(cook.getId());
        Map<String,String> map=new HashMap<>();
        for (int i=0;i<foodItemList.size();i++){
            map.put(iFoodService.findFoodInfoById(foodItemList.get(i).getFoodId()).getName(),foodItemList.get(i).getConsumption());
        }
        if(!ObjectUtils.isEmpty(map)){
            return Result.ok(map).message("获取菜谱用料信息成功");
        }
        return Result.error().message("获取菜谱用料信息失败");
    }

}
