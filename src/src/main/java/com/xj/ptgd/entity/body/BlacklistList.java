package com.xj.ptgd.entity.body;

import com.xj.ptgd.entity.base.BaseDto;

import java.util.List;

public class BlacklistList extends BaseDto{
    List<Blacklist> Frame;

    public List<Blacklist> getFrame() {
        return Frame;
    }

    public void setFrame(List<Blacklist> frame) {
        Frame = frame;
    }
}
