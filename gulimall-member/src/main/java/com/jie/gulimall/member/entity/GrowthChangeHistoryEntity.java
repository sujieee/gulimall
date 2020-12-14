package com.jie.gulimall.member.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * �ɳ�ֵ�仯��ʷ��¼
 * 
 * @author jie
 * @email jie@gmail.com
 * @date 2020-12-14 23:34:56
 */
@Data
@TableName("ums_growth_change_history")
public class GrowthChangeHistoryEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * member_id
	 */
	private Long memberId;
	/**
	 * create_time
	 */
	private Date createTime;
	/**
	 * �ı��ֵ������������
	 */
	private Integer changeCount;
	/**
	 * ��ע
	 */
	private String note;
	/**
	 * ������Դ[0-���1-����Ա�޸�]
	 */
	private Integer sourceType;

}
