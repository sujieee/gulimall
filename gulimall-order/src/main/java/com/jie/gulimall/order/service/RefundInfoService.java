package com.jie.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jie.common.utils.PageUtils;
import com.jie.gulimall.order.entity.RefundInfoEntity;

import java.util.Map;

/**
 * �˿���Ϣ
 *
 * @author jie
 * @email jie@gmail.com
 * @date 2020-12-14 23:40:14
 */
public interface RefundInfoService extends IService<RefundInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

