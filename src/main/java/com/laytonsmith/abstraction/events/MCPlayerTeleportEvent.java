package com.laytonsmith.abstraction.events;

import com.laytonsmith.abstraction.MCLocation;
import com.laytonsmith.abstraction.enums.MCTeleportCause;

/**
 *
 *
 */
public interface MCPlayerTeleportEvent extends MCPlayerEvent {
    public MCTeleportCause getCause();

    public MCLocation getFrom();

    public void setFrom(MCLocation oldloc);

    public MCLocation getTo();

    public void setTo(MCLocation newloc);

    public boolean isCancelled();

    public void setCancelled(boolean state);
}