package com.laytonsmith.abstraction;

import com.laytonsmith.abstraction.enums.MCGameMode;

/**
 *
 *
 */
public interface MCHumanEntity extends MCInventoryHolder, MCLivingEntity, MCAnimalTamer {
    public void closeInventory();

    public MCGameMode getGameMode();

    //public MCInventoryView	openWorkbench(MCLocation location, boolean force);
    void setGameMode(MCGameMode mode);

    public MCItemStack getItemInHand();

    void setItemInHand(MCItemStack item);

    public MCItemStack getItemOnCursor();

    void setItemOnCursor(MCItemStack item);

    @Override
    public String getName();

    public int getSleepTicks();

    public boolean isBlocking();

    public boolean isSleeping();

    public MCInventoryView openEnchanting(MCLocation location, boolean force);

    public MCInventoryView openInventory(MCInventory inventory);

    public MCInventoryView getOpenInventory();

    public MCInventory getEnderChest();

    public MCInventoryView openWorkbench(MCLocation loc, boolean force);

    //public boolean setWindowProperty(MCInventoryView.Property prop, int value);
}
