package com.jxnu.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.ObjectUtils;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.jxnu.entity.Cook;
import com.jxnu.entity.Material;
import com.jxnu.entity.Note;
import com.jxnu.entity.User;
import com.jxnu.service.ICookService;
import com.jxnu.service.IMaterialService;
import com.jxnu.service.IUserService;
import com.jxnu.utils.Result;
import com.jxnu.vo.query.CookQueryVo;
import com.jxnu.vo.query.NoteQueryVo;
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
    private IMaterialService iMaterialService;
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
        List<Material> foodItemList= iMaterialService.findMaterialByCookId(cook.getId());
        if(!ObjectUtils.isEmpty(foodItemList)){
            return Result.ok(foodItemList).message("获取菜谱用料信息成功");
        }
        return Result.error().message("获取菜谱用料信息失败");
    }
    @PostMapping("/uploadcookinfo")
    public Result uploadcookInfo(@RequestBody Cook cook){
        boolean isSave = icookService.save(cook);
        Cook cook1=icookService.getLastCook();
        if(isSave){
            Long newCount=iUserService.findUserById(cook.getUserId()).getCookCount();
            User user=new User();
            user.setCookCount(++newCount);
            iUserService.updateById(user);
            return Result.ok(cook1).message("菜谱发布成功！");
        }
            return Result.error().message("菜谱发布失败");
    }
    @PostMapping("/cooklist")
    public Result getCookList(@RequestBody CookQueryVo cookQueryVo){
        IPage<Cook> page=new Page<>(cookQueryVo.getPageNo(),cookQueryVo.getPageSize());
        icookService.findCookList(page,cookQueryVo);

        if(!ObjectUtils.isEmpty(page)){
            return Result.ok(page).message("物资信息获取成");
        }
        return Result.error().message("获取物资信息失败");

    }
    @PostMapping("/cooklistbytype")
    public Result cooklistByType(@RequestBody CookQueryVo cookQueryVo){

        //创建分页对象
        IPage<Cook> page = new Page<>(cookQueryVo.getPageNo(), cookQueryVo.getPageSize());
        //调用分页查询方法
        icookService.findCookPageByType(page, cookQueryVo);

        if(!ObjectUtils.isEmpty(page)){
            return Result.ok(page).message("查询当前类别物资成功");
        }
        else return Result.error().message("查询当前类别物资失败");

    }
}
