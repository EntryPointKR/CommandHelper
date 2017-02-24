package com.laytonsmith.abstraction;

import com.laytonsmith.abstraction.enums.MCEquipmentSlot;

import java.util.Map;

/**
 * @author jb_aero
 */
public interface MCEntityEquipment {

    public void clearEquipment();

    public int getSize();

    public MCEntity getHolder();

    public Map<MCEquipmentSlot, MCItemStack> getAllEquipment();

    public void setAllEquipment(Map<MCEquipmentSlot, MCItemStack> stackmap);

    public Map<MCEquipmentSlot, Float> getAllDropChances();

    public void setAllDropChances(Map<MCEquipmentSlot, Float> slots);

    public MCItemStack getWeapon();

    public void setWeapon(MCItemStack stack);

    public MCItemStack getHelmet();

    public void setHelmet(MCItemStack stack);

    public MCItemStack getChestplate();

    public void setChestplate(MCItemStack stack);

    public MCItemStack getLeggings();

    public void setLeggings(MCItemStack stack);

    public MCItemStack getBoots();

    public void setBoots(MCItemStack stack);

    public float getWeaponDropChance();

    public void setWeaponDropChance(float chance);

    public float getHelmetDropChance();

    public void setHelmetDropChance(float chance);

    public float getChestplateDropChance();

    public void setChestplateDropChance(float chance);

    public float getLeggingsDropChance();

    public void setLeggingsDropChance(float chance);

    public float getBootsDropChance();

    public void setBootsDropChance(float chance);

}
