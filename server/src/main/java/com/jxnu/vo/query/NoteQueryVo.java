package com.jxnu.vo.query;

import com.jxnu.entity.Note;
import lombok.Data;

@Data
public class NoteQueryVo extends Note {
    private Long pageNo=1L;
    private Long pageSize=9L;
}
