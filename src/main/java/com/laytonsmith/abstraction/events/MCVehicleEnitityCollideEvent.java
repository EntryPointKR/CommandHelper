package com.laytonsmith.abstraction.events;

import com.laytonsmith.abstraction.MCEntity;

public interface MCVehicleEnitityCollideEvent extends MCVehicleCollideEvent {
    public MCEntity getEntity();

    public boolean isCollisionCancelled();

    public void setCollisionCancelled(boolean cancel);

    public boolean isPickupCancelled();

    public void setPickupCancelled(boolean cancel);
}
