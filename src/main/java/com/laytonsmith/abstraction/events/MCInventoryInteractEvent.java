package com.laytonsmith.abstraction.events;

import com.laytonsmith.abstraction.MCHumanEntity;
import com.laytonsmith.abstraction.enums.MCResult;

/**
 * @author import
 */
public interface MCInventoryInteractEvent extends MCInventoryEvent {
    public MCHumanEntity getWhoClicked();

    public MCResult getResult();

    public void setResult(MCResult newResult);

    public boolean isCanceled();

    public void setCancelled(boolean toCancel);
}
