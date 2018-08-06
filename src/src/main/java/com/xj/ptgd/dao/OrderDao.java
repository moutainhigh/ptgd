package com.xj.ptgd.dao;

import com.xj.ptgd.entity.body.Order;

import java.util.List;

/**
 * OrderDao
 * @author hjd
 * @since 2018/8/2
 */
public interface OrderDao {
    List<Order> findOrder();
}
