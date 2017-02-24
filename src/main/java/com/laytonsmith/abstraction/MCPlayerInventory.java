package com.laytonsmith.abstraction;

/**
 *
 *
 */
public interface MCPlayerInventory extends MCInventory {
    public MCItemStack getHelmet();

    public void setHelmet(MCItemStack stack);

    public MCItemStack getChestplate();

    public void setChestplate(MCItemStack stack);

    public MCItemStack getLeggings();

    public void setLeggings(MCItemStack stack);

    public MCItemStack getBoots();

    public void setBoots(MCItemStack stack);

    public int getHeldItemSlot();

    public void setHeldItemSlot(int slot);
}
