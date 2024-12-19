package com.lent.Kits;

import com.lent.Kits.kit.GameListener;
import com.lent.Kits.kit.Kit;
import com.lent.Kits.kit.KitType;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin implements Listener {

    private instance gameInstance;

    @Override
    public void onEnable() {
        gameInstance = new instance(this);
        getLogger().info("Plugin enabled!");
        getCommand("kit").setExecutor(new KitCommand());
        Bukkit.getPluginManager().registerEvents(this, this);
        Bukkit.getPluginManager().registerEvents(new GameListener(this, gameInstance), this);
    }
    public instance getGameInstance() {
        return gameInstance;
    }
}
