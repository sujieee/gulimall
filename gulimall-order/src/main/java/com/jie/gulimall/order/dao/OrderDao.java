package com.jie.gulimall.order.dao;

import com.jie.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * ����
 * 
 * @author jie
 * @email jie@gmail.com
 * @date 2020-12-14 23:40:15
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
