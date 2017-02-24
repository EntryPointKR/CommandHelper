package com.laytonsmith.abstraction.entities;

import com.laytonsmith.abstraction.MCTameable;
import com.laytonsmith.abstraction.enums.MCOcelotType;

/**
 * @author jb_aero
 */
public interface MCOcelot extends MCTameable {

    MCOcelotType getCatType();

    void setCatType(MCOcelotType type);

    boolean isSitting();

    void setSitting(boolean sitting);
}
