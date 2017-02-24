package com.laytonsmith.abstraction.events;

/**
 *
 *
 */
public interface MCPlayerCommandEvent extends MCPlayerEvent {
    public String getCommand();

    public void setCommand(String val);

    public void cancel();

    public boolean isCancelled();
}
