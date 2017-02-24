package com.laytonsmith.abstraction.events;

import com.laytonsmith.abstraction.MCBookMeta;

/**
 * @author Hekta
 */
public interface MCPlayerEditBookEvent extends MCPlayerEvent {

    public MCBookMeta getNewBookMeta();

    public void setNewBookMeta(MCBookMeta bookMeta);

    public MCBookMeta getPreviousBookMeta();

    public int getSlot();

    public boolean isSigning();

    public void setSigning(boolean isSigning);
}