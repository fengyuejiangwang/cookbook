package com.jxnu.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 
 * </p>
 *
 * @author h.h.Huang
 * @since 2023-02-05
 */
@Getter
@Setter
public class Material implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private Long cookId;

    private Long foodId;

    /**
     * 用料名
     */
    private String foodName;

    /**
     * 用量
     */
    private String consumption;


}
