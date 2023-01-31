package com.jxnu.controller;


import com.baomidou.mybatisplus.core.toolkit.ObjectUtils;
import com.jxnu.entity.Note;
import com.jxnu.service.INoteService;
import com.jxnu.service.IUserService;
import com.jxnu.utils.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

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
 * @since 2023-01-30
 */
@RestController
@RequestMapping("/note")
public class NoteController {
  @Resource
    private INoteService iNoteService;
  @Resource
  private IUserService iUserService;
  @GetMapping("/hotnote")
    public Result getHotNote(){
      List<Note> noteList = iNoteService.getHotNote();
      Map<String,Map<String, Note>> map=new HashMap<>();
      for(int i=0;i<noteList.size();i++){
          Map<String,Note> map1=new HashMap<>();
          map1.put(iUserService.findUserById(iNoteService.getUserId(noteList.get(i))).getAvatar(),noteList.get(i));
          map.put(iUserService.findUserById(iNoteService.getUserId(noteList.get(i))).getUsername(),map1);
      }
      if(!ObjectUtils.isEmpty(map)){
          return Result.ok(map).message("获取热门笔记信息成功");
      }
      return Result.error().message("获取热门笔记信息失败");
  }
}

