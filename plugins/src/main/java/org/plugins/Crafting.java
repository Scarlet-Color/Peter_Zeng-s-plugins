package org.plugins;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.FurnaceRecipe;

public class Crafting {
    FurnaceRecipe fr = new FurnaceRecipe(
            new NamespacedKey(<org.plugins>),new ItemStack(Material.DIAMONDS),Material.OAK_PLANKS,0.8,200);
}
