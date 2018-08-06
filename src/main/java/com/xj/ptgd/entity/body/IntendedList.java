package com.xj.ptgd.entity.body;

import com.xj.ptgd.entity.base.BaseDto;

import java.util.List;

public class IntendedList extends BaseDto{
    List<Intended> Frame;

    public List<Intended> getFrame() {
        return Frame;
    }

    public void setFrame(List<Intended> frame) {
        Frame = frame;
    }
}
