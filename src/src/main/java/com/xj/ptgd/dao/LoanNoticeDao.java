package com.xj.ptgd.dao;


import com.xj.ptgd.entity.body.LoanNotice;

import java.util.List;

/**
 * 放款通知推送中证
 *  @author cp
 * @date 2018/8/2
 */
public interface LoanNoticeDao {
   List<LoanNotice> findLoanNotice();

   LoanNotice findById(String userId);
}
