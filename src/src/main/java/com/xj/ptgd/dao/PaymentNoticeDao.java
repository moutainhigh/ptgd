package com.xj.ptgd.dao;

import com.xj.ptgd.entity.body.PaymentNotice;

import java.util.List;

/**
 * 推送借据及还款信息
 * @author cp
 * @date 2018/8/2
 */
public interface PaymentNoticeDao {
    List<PaymentNotice> findPaymentNotice();

    PaymentNotice findById(String userId);
}
