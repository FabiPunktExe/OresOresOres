package ooo.block;

import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.world.item.Item;
import ooo.OresOresOres;

public class RawExordium extends Item {
    public static RegistrySupplier<Item> ITEM;

    public RawExordium() {
        super(new Properties().tab(OresOresOres.TAB));
    }
}