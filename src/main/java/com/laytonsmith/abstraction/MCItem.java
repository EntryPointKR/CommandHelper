package com.laytonsmith.abstraction;

/**
 *
 *
 */
public interface MCItem extends MCEntity {

    public MCItemStack getItemStack();

    public void setItemStack(MCItemStack stack);

    public int getPickupDelay();

    public void setPickupDelay(int delay);
}
