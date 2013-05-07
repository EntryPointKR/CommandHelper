package com.laytonsmith.abstraction.bukkit;

import com.laytonsmith.abstraction.AbstractionUtils;
import com.laytonsmith.abstraction.MCObjective;
import com.laytonsmith.abstraction.MCOfflinePlayer;
import com.laytonsmith.abstraction.MCScore;
import com.laytonsmith.abstraction.MCScoreboard;
import com.laytonsmith.abstraction.enums.MCDisplaySlot;
import com.laytonsmith.abstraction.enums.bukkit.BukkitMCDisplaySlot;
import com.laytonsmith.annotations.WrappedItem;
import org.bukkit.OfflinePlayer;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;

public class BukkitMCObjective implements MCObjective {

	@WrappedItem Objective o;

	public String getCriteria() {
		return o.getCriteria();
	}

	public String getDisplayName() {
		return o.getDisplayName();
	}

	public MCDisplaySlot getDisplaySlot() {
		DisplaySlot ds = o.getDisplaySlot();
		if (ds == null) {
			return null;
		}
		return BukkitMCDisplaySlot.getConvertor().getAbstractedEnum(ds);
	}

	public String getName() {
		return o.getName();
	}

	public MCScore getScore(MCOfflinePlayer player) {
		return AbstractionUtils.wrap(o.getScore((OfflinePlayer) player.getHandle()));
	}

	public MCScoreboard getScoreboard() {
		return AbstractionUtils.wrap(o.getScoreboard());
	}

	public boolean isModifiable() {
		return o.isModifiable();
	}

	public void setDisplayName(String displayName) {
		o.setDisplayName(displayName);
	}

	public void setDisplaySlot(MCDisplaySlot slot) {
		o.setDisplaySlot(BukkitMCDisplaySlot.getConvertor().getConcreteEnum(slot));
	}

	public void unregister() {
		o.unregister();
	}

	public <T> T getHandle() {
		return (T) o;
	}
}