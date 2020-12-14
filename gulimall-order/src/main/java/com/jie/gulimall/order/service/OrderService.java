package com.jie.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jie.common.utils.PageUtils;
import com.jie.gulimall.order.entity.OrderEntity;

import java.util.Map;

/**
 * ����
 *
 * @author jie
 * @email jie@gmail.com
 * @date 2020-12-14 23:40:15
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

