package com.jie.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jie.common.utils.PageUtils;
import com.jie.gulimall.product.entity.BrandEntity;

import java.util.Map;

/**
 * Ʒ��
 *
 * @author jie
 * @email jie@gmail.com
 * @date 2020-12-14 23:14:58
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

