package com.jxnu.service;

import com.jxnu.entity.Cook;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author h.h.Huang
 * @since 2022-12-12
 */
public interface ICookService extends IService<Cook> {
    public List<Cook> getDailyHotCook();
    public Long getUserId(Cook cook);
    public Cook getCookDetail(Long id);

    Cook getLastCook();
}
