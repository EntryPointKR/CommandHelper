package com.laytonsmith.abstraction.bukkit.entities;

import com.laytonsmith.abstraction.MCLivingEntity;
import com.laytonsmith.abstraction.MCProjectile;
import com.laytonsmith.abstraction.bukkit.BukkitConvertor;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Projectile;

public class BukkitMCProjectile extends BukkitMCEntity implements MCProjectile {

    Projectile proj;

    public BukkitMCProjectile(Entity e) {
        super(e);
        this.proj = (Projectile) e;
    }

    @Override
    public boolean doesBounce() {
        return proj.doesBounce();
    }

    @Override
    public MCLivingEntity getShooter() {
        return (MCLivingEntity) BukkitConvertor.BukkitGetCorrectEntity(proj.getShooter());
    }

    @Override
    public void setShooter(MCLivingEntity shooter) {
        if (shooter == null) {
            proj.setShooter(null);
        } else {
            proj.setShooter((LivingEntity) shooter.getHandle());
        }
    }

    @Override
    public void setBounce(boolean doesBounce) {
        proj.setBounce(doesBounce);
    }

    public Projectile asProjectile() {
        return proj;
    }
}
