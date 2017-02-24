package com.laytonsmith.abstraction;

import com.laytonsmith.abstraction.enums.MCDyeColor;

import java.util.List;

public interface MCBannerMeta extends MCItemMeta {

    public void addPattern(MCPattern pattern);

    public MCDyeColor getBaseColor();

    public void setBaseColor(MCDyeColor color);

    public MCPattern getPattern(int i);

    public List<MCPattern> getPatterns();

    public void setPatterns(List<MCPattern> patterns);

    public int numberOfPatterns();

    public void removePattern(int i);

    public void setPattern(int i, MCPattern pattern);

}
