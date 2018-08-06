package com.xj.ptgd.entity.body;

import com.xj.ptgd.entity.base.BaseDto;

import java.util.List;

/**
 * 推送客户额度信息集合
 * @author cp
 * @date 2018/8/2
 */
public class QuotaQueryList extends BaseDto {
    List<QuotaQuery> Frame;

    public List<QuotaQuery> getFrame() {
        return Frame;
    }

    public void setFrame(List<QuotaQuery> frame) {
        Frame = frame;
    }
}
