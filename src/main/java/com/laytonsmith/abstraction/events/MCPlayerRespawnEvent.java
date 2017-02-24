package com.laytonsmith.abstraction.events;

import com.laytonsmith.abstraction.MCLocation;

/**
 *
 *
 */
public interface MCPlayerRespawnEvent extends MCPlayerEvent {

    public MCLocation getRespawnLocation();

    public void setRespawnLocation(MCLocation location);

    public Boolean isBedSpawn();

}
