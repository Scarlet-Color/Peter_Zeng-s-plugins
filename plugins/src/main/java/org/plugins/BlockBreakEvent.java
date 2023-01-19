package org.plugins;

import org.bukkit.block.Block;
import org.bukkit.event.Cancellable;
import org.bukkit.event.block.BlockExpEvent;
import org.jetbrains.annotations.NotNull;

import static org.bukkit.Bukkit.getPlayer;

public class BlockBreakEvent extends BlockExpEvent implements Cancellable {

    public BlockBreakEvent(Block block, int exp){
        super(block, exp);
    }

    @Override
    public boolean isCancelled() {
        return false;
    }

    @Override
    public void setCancelled(boolean cancel) {
    }

    public String getPlayer(String name){
        return name;
    }
}
