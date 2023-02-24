package com.jxnu.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import java.time.LocalDateTime;

import lombok.Data;


/**
 * <p>
 * 
 * </p>
 *
 * @author h.h.Huang
 * @since 2022-12-12
 */
@Data
public class Cook implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private Long userId;

    /**
     * 菜谱标题
     */
    private String cookTitle;

    /**
     * 菜谱介绍
     */
    private String description;

    /**
     * 菜谱封面
     */
    private String cover;

    /**
     * 菜谱视频
     */
    private String video;

    /**
     * 小贴士
     */
    private String skill;

    /**
     * 烹饪难度
     */
    private String cookDiff;

    /**
     * 烹饪时间
     */
    private String cookTime;

    /**
     * 菜谱二级类别id
     */
    private Long category2Id;
    private Long category1Id;

    /**
     * 菜谱等级
     */
    private String level;

    /**
     * 浏览数
     */
    private Long views;

    /**
     * 收藏数
     */
    private Long collections;

    /**
     * 评论数量
     */
    private Long commentCount;

    /**
     * 菜谱创建时间
     */
    private LocalDateTime createTime;

    /**
     * 菜谱更新时间
     */
    private String updateTime;

    /**
     * 0代表菜谱不存在，1代表菜谱已存在
     */
    private Integer status;


}
