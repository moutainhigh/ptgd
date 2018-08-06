package com.xj.ptgd.service;

/**
 * 推送客户额度信息
 * @author cp
 * @date 2018/8/2
 */
public interface QuotaQueryService {
    String findQuotaQuery();

    String findByName(String name);

    String sendPost();
}
