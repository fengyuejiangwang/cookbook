package com.jxnu.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.jxnu.entity.Cook;
import com.baomidou.mybatisplus.extension.service.IService;
import com.jxnu.vo.query.CookQueryVo;

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

    IPage<Cook> findCookList(IPage<Cook> page, CookQueryVo cookQueryVo);

    IPage<Cook> findCookPageByType(IPage<Cook> page, CookQueryVo cookQueryVo);

    Cook getLastCook();
}
