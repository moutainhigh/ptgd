package com.xj.ptgd.service;

/**
 * 放款通知推送中证
 *  @author cp
 * @date 2018/8/2
 */
public interface LoanNoticeService {
    String findById(String id);

    String findLoanNotice();

    String sendPost();
}
