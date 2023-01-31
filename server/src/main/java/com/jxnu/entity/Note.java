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
 * @since 2023-01-30
 */
@Data
public class Note implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 作者id
     */
    private Long userId;

    /**
     * 笔记标题
     */
    private String noteTitle;

    /**
     * 点赞数
     */
    private Long likes;

    private String description;

    /**
     * 用户上传的图片
     */
    private String picture1;

    /**
     * 用户上传的图片
     */
    private String picture2;

    /**
     * 用户上传的图片
     */
    private String picture3;

    /**
     * 用户上传的图片
     */
    private String picture4;

    /**
     * 用户上传的视频
     */
    private String video;

    /**
     * 笔记创建时间
     */
    private LocalDateTime createTime;

    /**
     * 0代表笔记不存在，1代表笔记存在
     */
    private Integer status;


}
