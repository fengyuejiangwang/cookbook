package com.jxnu.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.ObjectUtils;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.jxnu.entity.Note;
import com.jxnu.service.INoteService;
import com.jxnu.service.IUserService;
import com.jxnu.utils.Result;
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
 * @since 2023-01-30
 */
@RestController
@RequestMapping("/note")
public class NoteController {
  @Resource
    private INoteService iNoteService;
  @Resource
  private IUserService iUserService;

  @PostMapping("/notelist")
  public Result getNoteList(@RequestBody NoteQueryVo noteQueryVo){
      IPage<Note> page=new Page<>(noteQueryVo.getPageNo(),noteQueryVo.getPageSize());
      iNoteService.findNoteList(page,noteQueryVo);

      if(!ObjectUtils.isEmpty(page)){
          return Result.ok(page).message("物资信息获取成");
      }
      return Result.error().message("获取物资信息失败");

  }
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

