package com.laytonsmith.abstraction;

/**
 * @author jb_aero
 */
public interface MCTeam {
    public boolean allowFriendlyFire();

    public boolean canSeeFriendlyInvisibles();

    public String getDisplayName();

    public void setDisplayName(String displayName);

    public String getName();

    public String getPrefix();

    public void setPrefix(String prefix);

    public MCScoreboard getScoreboard();

    public int getSize();

    public String getSuffix();

    public void setSuffix(String suffix);

    public void setAllowFriendlyFire(boolean enabled);

    public void setCanSeeFriendlyInvisibles(boolean enabled);

    public void unregister();
}
