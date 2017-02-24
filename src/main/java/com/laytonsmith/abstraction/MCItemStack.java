package com.laytonsmith.abstraction;

import com.laytonsmith.abstraction.blocks.MCMaterial;

import java.util.Map;

/**
 *
 *
 */
public interface MCItemStack extends AbstractionObject {
    public MCMaterialData getData();

    public void setData(int data);

    public short getDurability();

    public void setDurability(short data);

    public int getTypeId();

    public void setTypeId(int type);

    public void addEnchantment(MCEnchantment e, int level);

    public void addUnsafeEnchantment(MCEnchantment e, int level);

    public Map<MCEnchantment, Integer> getEnchantments();

    public void removeEnchantment(MCEnchantment e);

    public MCMaterial getType();

    public int maxStackSize();

    public int getAmount();

    public boolean hasItemMeta();

    public MCItemMeta getItemMeta();

    public void setItemMeta(MCItemMeta im);
}
