package de.fabiexe.oresoresores.block;

import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.OreBlock;
import net.minecraft.world.level.material.Material;
import de.fabiexe.oresoresores.OresOresOres;

public class Crappium extends OreBlock {
    public static RegistrySupplier<Block> BLOCK;
    public static RegistrySupplier<Item> ITEM;

    public Crappium() {
        super(Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(3.0F, 3.0F));
    }

    public static class CrappiumItem extends BlockItem {
        public CrappiumItem() {
            super(BLOCK.get(), new Properties().tab(OresOresOres.TAB));
        }
    }
}