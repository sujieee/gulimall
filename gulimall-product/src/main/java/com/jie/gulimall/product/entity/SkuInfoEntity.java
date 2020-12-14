package com.jie.gulimall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * sku��Ϣ
 * 
 * @author jie
 * @email jie@gmail.com
 * @date 2020-12-14 23:14:59
 */
@Data
@TableName("pms_sku_info")
public class SkuInfoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * skuId
	 */
	@TableId
	private Long skuId;
	/**
	 * spuId
	 */
	private Long spuId;
	/**
	 * sku����
	 */
	private String skuName;
	/**
	 * sku��������
	 */
	private String skuDesc;
	/**
	 * �������id
	 */
	private Long catalogId;
	/**
	 * Ʒ��id
	 */
	private Long brandId;
	/**
	 * Ĭ��ͼƬ
	 */
	private String skuDefaultImg;
	/**
	 * ����
	 */
	private String skuTitle;
	/**
	 * ������
	 */
	private String skuSubtitle;
	/**
	 * �۸�
	 */
	private BigDecimal price;
	/**
	 * ����
	 */
	private Long saleCount;

}
