package com.jxnu.service;

import com.jxnu.entity.Material;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author h.h.Huang
 * @since 2023-02-05
 */
public interface IMaterialService extends IService<Material> {
    List<Material> findMaterialByCookId(Long id);
}
