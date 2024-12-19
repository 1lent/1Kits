package com.lent.Kits;

import com.lent.Kits.kit.Kit;
import com.lent.Kits.kit.KitType;
import com.lent.Kits.kit.type.DiamondKit;
import com.lent.Kits.kit.type.GoldenKit;
import com.lent.Kits.kit.type.IronKit;
import com.lent.Kits.kit.type.NetheriteKit;
import org.bukkit.entity.Player;

import java.util.HashMap;
import java.util.UUID;

public class instance {
    private Main main; // Declare the field here
    private HashMap<UUID, Kit> kits;

    public instance(Main main) {
        this.main = main;
        this.kits = new HashMap<>();
    }

    public void removeKit(UUID uuid) {
        if (kits.containsKey(uuid)) {
            kits.get(uuid).remove();
            kits.remove(uuid);
        }
    }

    public void setKit(UUID uuid, KitType type) {
        removeKit(uuid);
        switch (type) {
            case DIAMOND:
                kits.put(uuid, new DiamondKit(main, uuid));
                break;
            case GOLD:
                kits.put(uuid, new GoldenKit(main, uuid));
                break;
            case NETHERITE:
                kits.put(uuid, new NetheriteKit(main, uuid));
                break;
            case IRON:
                kits.put(uuid, new IronKit(main, uuid));
                break;
        }
    }

    public KitType getKitType(Player player) {
        return kits.containsKey(player.getUniqueId()) ? kits.get(player.getUniqueId()).getType() : null;}

    public void applyKit(Player player, KitType type) {
        setKit(player.getUniqueId(), type); // Set the kit
        Kit kit = kits.get(player.getUniqueId());
        if (kit != null) {
            kit.onStart(player); // Apply the kit
        }
    }
}
