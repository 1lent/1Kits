package com.lent.Kits.kit.type;

import com.lent.Kits.Main;
import com.lent.Kits.kit.Kit;
import com.lent.Kits.kit.KitType;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.inventory.ItemStack;

import java.util.UUID;

public class GoldenKit extends Kit {
    public GoldenKit(Main main, UUID uuid) {
        super(main, KitType.GOLD, uuid); {
        }
    }

    @Override
    public void onStart(Player player) {
        player.getInventory().addItem(new ItemStack(Material.GOLDEN_CHESTPLATE));
        player.getInventory().addItem(new ItemStack(Material.GOLDEN_HELMET));
        player.getInventory().addItem(new ItemStack(Material.GOLDEN_LEGGINGS));
        player.getInventory().addItem(new ItemStack(Material.GOLDEN_BOOTS));
        player.getInventory().addItem(new ItemStack(Material.GOLDEN_SWORD));
        player.getInventory().addItem(new ItemStack(Material.GOLDEN_APPLE, 8));
    }
    @EventHandler
    public void onKill(PlayerDeathEvent e) {
        String killer = e.getEntity().getKiller().getName();
        if (uuid.equals(e.getEntity().getKiller().getUniqueId())) {
            Bukkit.broadcastMessage(killer + "has slain someone as a royal");
        }
    }
}


