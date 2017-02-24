package com.laytonsmith.abstraction.events;

import com.laytonsmith.core.events.BindableEvent;

import java.net.InetAddress;

/**
 * @author jb_aero
 */
public interface MCServerPingEvent extends BindableEvent {

    public InetAddress getAddress();

    public int getMaxPlayers();

    public void setMaxPlayers(int max);

    public String getMOTD();

    public void setMOTD(String motd);

    public int getNumPlayers();
}