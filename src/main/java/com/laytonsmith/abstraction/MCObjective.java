package com.laytonsmith.abstraction;

import com.laytonsmith.abstraction.enums.MCDisplaySlot;

/**
 * @author jb_aero
 */
public interface MCObjective {
    public String getCriteria();

    public String getDisplayName();

    public void setDisplayName(String displayName);

    public MCDisplaySlot getDisplaySlot();

    public void setDisplaySlot(MCDisplaySlot slot);

    public String getName();

    public MCScore getScore(MCOfflinePlayer player);

    public MCScoreboard getScoreboard();

    public boolean isModifiable();

    public void unregister();
}
