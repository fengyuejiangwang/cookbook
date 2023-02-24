package com.jxnu.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.ObjectUtils;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.jxnu.entity.Cook;
import com.jxnu.entity.Note;
import com.jxnu.entity.User;
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
    @PostMapping("/notedetail")
    public  Result getNoteDetail(@RequestBody Note note){
        Note note1 = iNoteService.getNoteDetail(note.getId());
        if(!ObjectUtils.isEmpty(note1)){
            return Result.ok(note1).message("获取菜谱详细信息成功");
        }
        return Result.error().message("获取菜谱详细信息失败");
    }
    @PostMapping("/noteauthorinfo")
    public  Result getNoteAuthorInfo(@RequestBody Note note){
        User user= iUserService.findUserById(iNoteService.getUserId(note));
        if(!ObjectUtils.isEmpty(user)){
            return Result.ok(user).message("获取菜谱作者信息成功");
        }
        return Result.error().message("获取菜谱作者信息失败");
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
    @PostMapping("/notelistbyuserid")
    public Result getNoteListByUserId(@RequestBody Note note){
        List<Note> noteList=iNoteService.findNoteListByUserId(note.getUserId());
        if(!ObjectUtils.isEmpty(noteList)){
            return Result.ok(noteList).message("查询当前类别物资成功");
        }
        else return Result.error().message("查询当前类别物资失败");

    }
}

