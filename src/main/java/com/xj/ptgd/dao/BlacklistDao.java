package com.xj.ptgd.dao;

import com.xj.ptgd.entity.body.Blacklist;

import java.util.List;

/**
 * BlacklistDao
 * @author hjd
 * @since  2018/8/2
 */
public interface BlacklistDao {
    List<Blacklist> findBlacklist();
}
