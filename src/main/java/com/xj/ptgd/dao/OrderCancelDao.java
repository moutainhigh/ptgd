package com.xj.ptgd.dao;

import com.xj.ptgd.entity.body.OrderCancel;

import java.util.List;

/**
 * 订单取消通知
 * @author cp
 * @date 2018/8/2
 */
public interface OrderCancelDao {
    List<OrderCancel> findOrderCancel();

    OrderCancel findById(String userId);
}
