package com.laytonsmith.abstraction.entities;

import com.laytonsmith.abstraction.MCTameable;
import com.laytonsmith.abstraction.enums.MCDyeColor;

/**
 * @author jb_aero
 */
public interface MCWolf extends MCTameable {

    MCDyeColor getCollarColor();

    void setCollarColor(MCDyeColor color);

    boolean isAngry();

    void setAngry(boolean angry);

    boolean isSitting();

    void setSitting(boolean sitting);

}
