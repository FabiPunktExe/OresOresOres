package de.fabiexe.oresoresores.item;

import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.world.item.Item;
import de.fabiexe.oresoresores.OresOresOres;

public class RawExordium extends Item {
    public static RegistrySupplier<Item> ITEM;

    public RawExordium() {
        super(new Properties().tab(OresOresOres.TAB));
    }
}