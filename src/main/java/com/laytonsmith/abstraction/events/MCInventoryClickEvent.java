package com.laytonsmith.abstraction.events;

import com.laytonsmith.abstraction.MCHumanEntity;
import com.laytonsmith.abstraction.MCItemStack;
import com.laytonsmith.abstraction.enums.MCClickType;
import com.laytonsmith.abstraction.enums.MCInventoryAction;
import com.laytonsmith.abstraction.enums.MCSlotType;

/**
 * @author jb_aero
 */
public interface MCInventoryClickEvent extends MCInventoryInteractEvent {
    public MCInventoryAction getAction();

    public MCClickType getClickType();

    public MCItemStack getCurrentItem();

    public void setCurrentItem(MCItemStack slot);

    public MCItemStack getCursor();

    public void setCursor(MCItemStack cursor);

    public int getSlot();

    public int getRawSlot();

    public int getHotbarButton();

    public MCSlotType getSlotType();

    @Override
    public MCHumanEntity getWhoClicked();

    public boolean isLeftClick();

    public boolean isRightClick();

    public boolean isShiftClick();

    public boolean isCreativeClick();

    public boolean isKeyboardClick();
}
