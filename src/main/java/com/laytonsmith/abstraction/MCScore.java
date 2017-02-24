package com.laytonsmith.abstraction;

/**
 * @author jb_aero
 */
public interface MCScore {
    public MCObjective getObjective();

    public MCOfflinePlayer getPlayer();

    public int getScore();

    public void setScore(int score);

    public MCScoreboard getScoreboard();
}
