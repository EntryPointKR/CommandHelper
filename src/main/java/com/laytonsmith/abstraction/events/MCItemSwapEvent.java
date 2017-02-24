package com.laytonsmith.abstraction.events;

import com.laytonsmith.abstraction.MCItemStack;

public interface MCItemSwapEvent extends MCPlayerEvent {
    public MCItemStack getMainHandItem();

    public void setMainHandItem(MCItemStack item);

    public MCItemStack getOffHandItem();

    public void setOffHandItem(MCItemStack item);
}
