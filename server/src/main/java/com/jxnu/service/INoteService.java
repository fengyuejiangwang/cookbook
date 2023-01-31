package com.jxnu.service;

import com.jxnu.entity.Note;
import com.baomidou.mybatisplus.extension.service.IService;

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
}
