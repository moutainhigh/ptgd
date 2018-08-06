package com.xj.ptgd.service;

/**
 * 订单融资申请转发中证
 * @author cp
 * @date 2018/8/2
 */
public interface LoanFinancingService {
    String findById(String id);

    String findLoanFinancing();

    String sendPost();
}
