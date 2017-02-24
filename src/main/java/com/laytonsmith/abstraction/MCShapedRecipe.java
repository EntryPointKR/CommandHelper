package com.laytonsmith.abstraction;

import java.util.Map;

public interface MCShapedRecipe extends MCRecipe {

    public Map<Character, MCItemStack> getIngredientMap();

    @Override
    public MCItemStack getResult();

    public String[] getShape();

    public MCShapedRecipe setShape(String[] shape);

    public MCShapedRecipe setIngredient(char key, MCItemStack ingredient);

    public MCShapedRecipe setIngredient(char key, int type, int data);

    public MCShapedRecipe setIngredient(char key, MCMaterialData data);
}
