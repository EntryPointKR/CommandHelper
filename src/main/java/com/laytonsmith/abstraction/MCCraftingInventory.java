package com.laytonsmith.abstraction;

public interface MCCraftingInventory extends MCInventory {

    public MCItemStack[] getMatrix();

    public void setMatrix(MCItemStack[] contents);

    public MCRecipe getRecipe();

    public MCItemStack getResult();

    public void setResult(MCItemStack result);
}
