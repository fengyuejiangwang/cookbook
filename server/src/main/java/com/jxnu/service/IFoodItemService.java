package com.jxnu.service;

import com.jxnu.entity.FoodItem;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author h.h.Huang
 * @since 2023-01-31
 */
public interface IFoodItemService extends IService<FoodItem> {

    List<FoodItem> findMaterialByCookId(Long id);
}
