package ooo.block;

import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.world.item.Item;
import ooo.OresOresOres;

public class ExordiumIngot extends Item {
    public static RegistrySupplier<Item> ITEM;

    public ExordiumIngot() {
        super(new Properties().tab(OresOresOres.TAB));
    }
}