package com.laytonsmith.abstraction.bukkit;

import com.laytonsmith.PureUtilities.Common.ReflectionUtils;
import com.laytonsmith.abstraction.MCObjective;
import com.laytonsmith.abstraction.MCOfflinePlayer;
import com.laytonsmith.abstraction.MCScore;
import com.laytonsmith.abstraction.MCScoreboard;
import com.laytonsmith.abstraction.enums.MCDisplaySlot;
import com.laytonsmith.abstraction.enums.bukkit.BukkitMCDisplaySlot;
import org.bukkit.OfflinePlayer;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Score;

public class BukkitMCObjective implements MCObjective {

    Objective o;

    public BukkitMCObjective(Objective obj) {
        o = obj;
    }

    @Override
    public String getCriteria() {
        return o.getCriteria();
    }

    @Override
    public String getDisplayName() {
        return o.getDisplayName();
    }

    @Override
    public void setDisplayName(String displayName) {
        o.setDisplayName(displayName);
    }

    @Override
    public MCDisplaySlot getDisplaySlot() {
        DisplaySlot ds = o.getDisplaySlot();
        if (ds == null) {
            return null;
        }
        return BukkitMCDisplaySlot.getConvertor().getAbstractedEnum(ds);
    }

    @Override
    public void setDisplaySlot(MCDisplaySlot slot) {
        if (slot == null) {
            o.setDisplaySlot(null);
        } else {
            o.setDisplaySlot(BukkitMCDisplaySlot.getConvertor().getConcreteEnum(slot));
        }
    }

    @Override
    public String getName() {
        return o.getName();
    }

    @Override
    public MCScore getScore(MCOfflinePlayer player) {
        try {
            return new BukkitMCScore(o.getScore((OfflinePlayer) player.getHandle()));
        } catch (NoSuchMethodError ex) {
            // Probably 1.7.8 or prior
            return new BukkitMCScore((Score) ReflectionUtils.invokeMethod(o, "getScore", player));
        }
    }

    @Override
    public MCScoreboard getScoreboard() {
        return new BukkitMCScoreboard(o.getScoreboard());
    }

    @Override
    public boolean isModifiable() {
        return o.isModifiable();
    }

    @Override
    public void unregister() {
        o.unregister();
    }
}
