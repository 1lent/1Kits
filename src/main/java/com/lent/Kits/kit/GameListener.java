package com.lent.Kits.kit;

import com.lent.Kits.Main;
import com.lent.Kits.instance;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;


public class GameListener implements Listener {


    private Main main;
    private instance instance;

    public GameListener(Main main, instance instance) {this.main = main;
    this.instance = instance;}

    @EventHandler
    public void onClick(InventoryClickEvent e) {

        Player player = (Player) e.getWhoClicked();
        if (e.getView().getTitle().contains("Kit Selector") && e.getInventory() != null && e.getCurrentItem() != null) {
            e.setCancelled(true);

            KitType type = KitType.valueOf(e.getCurrentItem().getItemMeta().getLocalizedName());
            KitType activated = instance.getKitType(player);

            if (activated != null && activated == type) {
                System.out.println("skibidi DEBUGGING IGNORE");
                player.sendMessage(ChatColor.RED + "WARNING [!]" + ChatColor.WHITE + " You already have this equipped");
            } else {
                System.out.println("uwu DEBUGGING IGNORE");
                player.sendMessage(ChatColor.GREEN + "You have equipped the " + type.getDisplay() + ChatColor.GREEN + " kit.");
                instance.setKit(player.getUniqueId(), type);
                instance.applyKit(player, type);
                player.closeInventory();

            }
        }

    }
}
