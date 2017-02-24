package com.laytonsmith.abstraction.events;

import com.laytonsmith.abstraction.MCEntity;
import com.laytonsmith.abstraction.entities.MCFishHook;
import com.laytonsmith.abstraction.enums.MCFishingState;

public interface MCPlayerFishEvent extends MCPlayerEvent {
    public MCEntity getCaught();

    public int getExpToDrop();

    public void setExpToDrop(int exp);

    public MCFishHook getHook();

    public MCFishingState getState();
}
