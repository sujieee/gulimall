package com.jie.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jie.common.utils.PageUtils;
import com.jie.gulimall.product.entity.AttrEntity;

import java.util.Map;

/**
 * ��Ʒ����
 *
 * @author jie
 * @email jie@gmail.com
 * @date 2020-12-14 23:14:59
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

