package com.jxnu.service;

import com.jxnu.entity.Step;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author h.h.Huang
 * @since 2023-02-01
 */
public interface IStepService extends IService<Step> {

    List<Step> findStepListByCookId(Long id);
}
