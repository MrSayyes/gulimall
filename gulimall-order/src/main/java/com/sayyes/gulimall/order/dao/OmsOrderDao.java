package com.sayyes.gulimall.order.dao;

import com.sayyes.gulimall.order.entity.OmsOrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author sayyes
 * @email sayyes@gmail.com
 * @date 2020-06-04 01:01:26
 */
@Mapper
public interface OmsOrderDao extends BaseMapper<OmsOrderEntity> {
	
}
