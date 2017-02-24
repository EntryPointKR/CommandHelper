package com.laytonsmith.abstraction.events;

import com.laytonsmith.abstraction.MCEntity;
import com.laytonsmith.abstraction.MCLocation;
import com.laytonsmith.abstraction.MCTravelAgent;
import com.laytonsmith.core.events.BindableEvent;

public interface MCEntityPortalEvent extends BindableEvent {
    MCEntity getEntity();

    MCLocation getFrom();

    MCLocation getTo();

    void setTo(MCLocation newloc);

    boolean isCancelled();

    void setCancelled(boolean state);

    void useTravelAgent(boolean useTravelAgent);

    MCTravelAgent getPortalTravelAgent();
}
