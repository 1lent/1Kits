package com.lent.Kits.kit;

import org.bukkit.ChatColor;
import org.bukkit.Material;

public enum KitTypes {

    NETHERITE( ChatColor.DARK_BLUE + "Netherite", Material.NETHERITE_INGOT, "Only the best"),
    DIAMOND(ChatColor.AQUA + "Diamoond", Material.DIAMOND, "Gladiator use"),
    GOLD(ChatColor.GOLD + "Gold", Material.GOLD_INGOT, "Just golden"),
    IRON(ChatColor.WHITE + "Iron", Material.IRON_INGOT, "Getting there");

    private String display, description;
    private Material material;

    KitTypes(String display, Material material, String description) {
        this.display = display;
        this.material = material;
        this.description = description;
    }

    public String getDisplay() {return display;}
    public Material getMaterial() {return material;}
    public String getDescription() {return description;}

}

