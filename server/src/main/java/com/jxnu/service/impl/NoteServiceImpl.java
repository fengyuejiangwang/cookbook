package com.jxnu.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.jxnu.entity.Cook;
import com.jxnu.entity.Note;
import com.jxnu.mapper.NoteMapper;
import com.jxnu.service.INoteService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jxnu.vo.query.NoteQueryVo;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author h.h.Huang
 * @since 2023-01-30
 */
@Service
public class NoteServiceImpl extends ServiceImpl<NoteMapper, Note> implements INoteService {

     private NoteMapper noteMapper;
    public List<Note> getHotNote() {
        QueryWrapper<Note> queryWrapper=new QueryWrapper<>();
        queryWrapper.orderByDesc("likes")
                    .orderByAsc("id");
        return baseMapper.selectList(queryWrapper.last("limit 4"));
    }

    @Override
    public Long getUserId(Note note) {
        QueryWrapper<Note> queryWrapper=new QueryWrapper<>();
        queryWrapper.eq("id",note.getId());
        return baseMapper.selectOne(queryWrapper).getUserId();
    }

    @Override
    public IPage<Note> findNoteList(IPage<Note> page, NoteQueryVo noteQueryVo) {
        QueryWrapper<Note> queryWrapper=new QueryWrapper<>();
        return baseMapper.selectPage(page,queryWrapper);
    }
    @Override
    public Note getNoteDetail(Long id) {
        QueryWrapper<Note> queryWrapper=new QueryWrapper<>();
        queryWrapper.eq("id",id);
        return baseMapper.selectOne(queryWrapper);
    }
}
