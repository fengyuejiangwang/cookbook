package com.jxnu.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.jxnu.entity.Cook;
import com.jxnu.entity.Note;
import com.baomidou.mybatisplus.extension.service.IService;
import com.jxnu.vo.query.NoteQueryVo;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author h.h.Huang
 * @since 2023-01-30
 */
public interface INoteService extends IService<Note> {

    List<Note> getHotNote();

    Long getUserId(Note note);

    IPage<Note> findNoteList(IPage<Note> page, NoteQueryVo noteQueryVo);

    Note getNoteDetail(Long id);
}
