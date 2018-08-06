package com.xj.ptgd.dao;


import com.xj.ptgd.entity.body.QuotaQuery;

import java.util.List;

/**
 * 推送客户额度信息
 * @author cp
 * @date 2018/8/2
 */
public interface QuotaQueryDao {
   List<QuotaQuery> findQuotaQuery();

   QuotaQuery findById(String userId);
}
