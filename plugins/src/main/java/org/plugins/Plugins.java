package org.plugins;

import org.bukkit.Bukkit;
import org.bukkit.block.Block;
import org.bukkit.event.Cancellable;
import org.bukkit.event.block.BlockExpEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class Plugins extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("Hello, world!");
        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        Bukkit.resetRecipes();
        // Plugin shutdown logic
    }
}


