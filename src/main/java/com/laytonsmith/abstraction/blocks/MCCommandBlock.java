package com.laytonsmith.abstraction.blocks;


public interface MCCommandBlock extends MCBlockState {

    public String getCommand();

    public void setCommand(String command);

    public String getName();

    public void setName(String name);
}
