package com.xj.ptgd.dao;

import com.xj.ptgd.entity.body.Intended;

import java.util.List;

/**
 * IntendedDao
 * @author hjd
 * @since 2018/8/2
 */

public interface IntendedDao {
    List<Intended> findIntended();
}
