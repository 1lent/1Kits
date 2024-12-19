package com.lent.Kits.kit;

import org.bukkit.ChatColor;
import org.bukkit.Material;

public enum KitType {

    NETHERITE( ChatColor.DARK_BLUE + "Netherite Kit", Material.NETHERITE_INGOT, "Only the best"),
    DIAMOND(ChatColor.AQUA + "Diamond Kit", Material.DIAMOND, "Gladiator use"),
    GOLD(ChatColor.GOLD + "Gold Kit", Material.GOLD_INGOT, "Just golden"),
    IRON(ChatColor.WHITE + "Iron Kit", Material.IRON_INGOT, "Getting there");

    private String display, description;
    private Material material;

    KitType(String display, Material material, String description) {
        this.display = display;
        this.material = material;
        this.description = description;
    }

    public String getDisplay() {return display;}
    public Material getMaterial() {return material;}
    public String getDescription() {return description;}

}