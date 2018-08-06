package com.xj.ptgd.entity.body;

import com.xj.ptgd.entity.base.BaseDto;

import java.util.List;

public class NetloanList extends BaseDto {
    List<Netloan> Frame;

    public List<Netloan> getFrame() {
        return Frame;
    }

    public void setFrame(List<Netloan> frame) {
        Frame = frame;
    }
}
