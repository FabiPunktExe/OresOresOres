package de.fabiexe.oresoresores.item;

import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.world.item.Item;
import de.fabiexe.oresoresores.OresOresOres;

public class RawCrappium extends Item {
    public static RegistrySupplier<Item> ITEM;

    public RawCrappium() {
        super(new Properties().tab(OresOresOres.TAB));
    }
}