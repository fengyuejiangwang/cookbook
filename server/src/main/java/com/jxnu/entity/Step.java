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
 * @since 2023-02-01
 */
@Data
public class Step implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private Long cookId;

    /**
     * 步骤图
     */
    private String picture;

    /**
     * 步骤描述
     */
    private String description;


}
