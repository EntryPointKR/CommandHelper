package com.laytonsmith.abstraction;

/**
 *
 *
 */
public interface MCProjectile extends MCEntity, MCMetadatable {
    public boolean doesBounce();

    public MCLivingEntity getShooter();

    public void setShooter(MCLivingEntity shooter);

    public void setBounce(boolean doesBounce);
}
