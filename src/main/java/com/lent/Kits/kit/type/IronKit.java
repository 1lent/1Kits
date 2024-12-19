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

public class IronKit extends Kit {
    public IronKit(Main main, UUID uuid) {
        super(main, KitType.IRON, uuid); {
        }
    }

    @Override
    public void onStart(Player player) {
        player.getInventory().addItem(new ItemStack(Material.IRON_CHESTPLATE));
        player.getInventory().addItem(new ItemStack(Material.IRON_HELMET));
        player.getInventory().addItem(new ItemStack(Material.IRON_LEGGINGS));
        player.getInventory().addItem(new ItemStack(Material.IRON_BOOTS));
        player.getInventory().addItem(new ItemStack(Material.IRON_SWORD));
        player.getInventory().addItem(new ItemStack(Material.GOLDEN_APPLE, 16));
        player.getInventory().addItem(new ItemStack(Material.BOW));
        player.getInventory().addItem(new ItemStack(Material.COBWEB, 24));
        player.getInventory().addItem(new ItemStack(Material.ARROW, 16));
    }
    @EventHandler
    public void onKill(PlayerDeathEvent e) {
        String killer = e.getEntity().getKiller().getName();
        if (uuid.equals(e.getEntity().getKiller().getUniqueId())) {
            Bukkit.broadcastMessage(killer + "has slain someone using the iron Kit he must of sucked!");
        }
    }
}
