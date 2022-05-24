package ml.rajdeep.xpro;

import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import ml.rajdeep.xpro.XProMod;

public class XPriteMaterial implements ToolMaterial {
    public static final ToolMaterial INSTANCE = new XPriteMaterial();

    @Override
    public int getDurability() {
        return 20000;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 500.0F;
    }

    @Override
    public float getAttackDamage() {
        return 1000.0F;
    }

    @Override
    public int getMiningLevel() {
        return 500;
    }

    @Override
    public int getEnchantability() {
        return 255;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(XProMod.XPriteItem);
    }
}