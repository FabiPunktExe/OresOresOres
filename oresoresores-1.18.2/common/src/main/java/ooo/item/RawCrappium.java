package ooo.item;

import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.world.item.Item;
import ooo.OresOresOres;

public class RawCrappium extends Item {
    public static RegistrySupplier<Item> ITEM;

    public RawCrappium() {
        super(new Properties().tab(OresOresOres.TAB));
    }
}