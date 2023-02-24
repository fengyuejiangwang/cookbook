package com.jxnu.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import java.time.LocalDateTime;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 
 * </p>
 *
 * @author h.h.Huang
 * @since 2023-02-24
 */
@Data
public class Likes implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private Long followeeId;

    private Long followerId;

    private Long cookId;

    private Long menuId;

    private Long noteId;

    /**
     * 属于菜单，笔记，菜谱这些中哪个板块的id
     */
    private Integer contentId;

    private LocalDateTime createTime;

    /**
     * 0代表收藏不存在，1表示存在
     */
    private Integer isDeleted;


}
