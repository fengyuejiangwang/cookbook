package com.jxnu.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 
 * </p>
 *
 * @author h.h.Huang
 * @since 2023-01-31
 */
@Data
public class Food implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private String name;

    /**
     * 别名
     */
    private String cname;

    /**
     * 热量
     */
    private String heats;

    /**
     * 适宜人群
     */
    private String suitablePeople;

    /**
     * 食材图片
     */
    private String picture;

    /**
     * 浏览量
     */
    private Long views;
}
