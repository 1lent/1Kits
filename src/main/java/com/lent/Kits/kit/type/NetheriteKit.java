package com.lent.Kits.kit.type;

import com.lent.Kits.Main;
import com.lent.Kits.kit.Kit;
import com.lent.Kits.kit.KitType;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Server;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.server.BroadcastMessageEvent;
import org.bukkit.inventory.ItemStack;

import java.util.UUID;

public class NetheriteKit extends Kit {
    public NetheriteKit(Main main, UUID uuid) {
        super(main, KitType.NETHERITE, uuid); {
        }
    }


    @Override
    public void onStart(Player player) {
        player.getInventory().addItem(new ItemStack(Material.NETHERITE_CHESTPLATE));
        player.getInventory().addItem(new ItemStack(Material.NETHERITE_HELMET));
        player.getInventory().addItem(new ItemStack(Material.NETHERITE_LEGGINGS));
        player.getInventory().addItem(new ItemStack(Material.NETHERITE_BOOTS));
        player.getInventory().addItem(new ItemStack(Material.NETHERITE_SWORD));
        player.getInventory().addItem(new ItemStack(Material.GOLDEN_APPLE, 64));
        player.getInventory().addItem(new ItemStack(Material.SHIELD));
        player.getInventory().addItem(new ItemStack(Material.TOTEM_OF_UNDYING));
    }
    @EventHandler
    public void onKill(PlayerDeathEvent e) {
        String killer = e.getEntity().getKiller().getName();
        if (uuid.equals(e.getEntity().getKiller().getUniqueId())) {
            Bukkit.broadcastMessage(killer + "has slain someone using the Netherite Kit");
        }
    }
}
