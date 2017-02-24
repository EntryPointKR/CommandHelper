package com.laytonsmith.abstraction.events;

import com.laytonsmith.abstraction.MCPlayer;

/**
 * @author Jason Unger <entityreborn@gmail.com>
 */
public interface MCPlayerToggleSneakEvent {
    boolean isSneaking();

    MCPlayer getPlayer();

    boolean isCancelled();

    void setCancelled(boolean state);
}
