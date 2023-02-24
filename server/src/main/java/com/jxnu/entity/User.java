package com.jxnu.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

import lombok.Data;


/**
 * <p>
 * 
 * </p>
 *
 * @author h.h.Huang
 * @since 2022-12-13
 */
@Data
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private String username;

    private String password;

    /**
     * 真实姓名
     */
    private String realName;

    /**
     * 头像
     */
    private String avatar;

    private Integer sex;

    private Integer age;

    /**
     * 用户的口味
     */
    private String taste;

    /**
     * 自我介绍
     */
    private String selfIntroduction;

    /**
     * 用户IP属地
     */
    private String ip;

    /**
     * 地址
     */
    private String addr;

    /**
     * 关注我的人数
     */
    private Long followerCount;

    /**
     * 我关注的人数
     */
    private Long followeeCount;

    /**
     * 用户发布菜谱数量
     */
    private Long cookCount;

    /**
     * 用户发布笔记数量
     */
    private Long noteCount;

    /**
     * 用户发布菜单数量
     */
    private Long menuCount;

}
