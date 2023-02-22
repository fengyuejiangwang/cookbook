package com.jxnu.vo.query;

import com.jxnu.entity.Cook;
import lombok.Data;

@Data
public class CookQueryVo extends Cook {
    private Long pageNo=1L;
    private Long pageSize=12L;
    private String type;
}
