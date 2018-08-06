package com.xj.ptgd.entity.body;

import com.xj.ptgd.entity.base.BaseDto;

import java.util.List;

public class OrderList extends BaseDto{
    List<Order> Frame;

    public List<Order> getFrame() {
        return Frame;
    }

    public void setFrame(List<Order> frame) {
        Frame = frame;
    }
}
