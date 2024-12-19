package com.lent.Kits.kit.type;

import com.lent.Kits.kit.KitType;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;

public class KitGUI {

    public KitGUI(Player player) {
        Inventory gui = Bukkit.createInventory(null, 54, ChatColor.GRAY + "Kit Selector");

        for (KitType type : KitType.values()) {
            ItemStack is = new ItemStack(type.getMaterial());
            ItemMeta isMeta = is.getItemMeta();
            isMeta.setDisplayName(type.getDisplay());
            isMeta.setLore(Arrays.asList(type.getDescription()));
            isMeta.setLocalizedName(type.name());

            gui.addItem(is);
        }

        player.openInventory(gui);
    }

}
