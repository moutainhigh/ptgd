package com.xj.ptgd.service;

/**
 * 订单取消通知
 * @author cp
 * @date 2018/8/2
 */
public interface OrderCancelService {
    String findById(String id);

    String findOrderCancel();

    String sendPost();
}
