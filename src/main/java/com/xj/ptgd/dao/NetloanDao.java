package com.xj.ptgd.dao;

import com.xj.ptgd.entity.body.Netloan;

import java.util.List;

/**
 * NetloanDao
 * @author hjd
 * @since 2018/8/2
 */
public interface NetloanDao {
    List<Netloan> findNetloan();
}
