package com.xj.ptgd.dao;


import com.xj.ptgd.entity.body.LoanFinancing;

import java.util.List;

/**
 * 订单融资申请转发中证
 * @author cp
 * @date 2018/8/2
 */
public interface LoanFinancingDao {
   List<LoanFinancing> findLoanFinancing();

   LoanFinancing findById(String userId);
}
