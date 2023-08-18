package ooo.item;

import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.world.item.Item;
import ooo.OresOresOres;

public class CrappiumIngot extends Item {
    public static RegistrySupplier<Item> ITEM;

    public CrappiumIngot() {
        super(new Properties().tab(OresOresOres.TAB));
    }
}