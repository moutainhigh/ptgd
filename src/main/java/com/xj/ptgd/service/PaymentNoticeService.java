package com.xj.ptgd.service;

/**
 * 推送借据及还款信息
 * @author cp
 * @date 2018/8/2
 */
public interface PaymentNoticeService {
    String findById(String id);

    String findPaymentNotice();

    String sendPost();
}
