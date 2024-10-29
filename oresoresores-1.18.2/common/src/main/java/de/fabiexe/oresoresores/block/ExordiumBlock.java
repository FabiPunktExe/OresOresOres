package de.fabiexe.oresoresores.block;

import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import de.fabiexe.oresoresores.OresOresOres;
import de.fabiexe.oresoresores.item.ExordiumIngot;

public class ExordiumBlock extends Block {
    public static RegistrySupplier<Block> BLOCK;
    public static RegistrySupplier<Item> ITEM;

    public ExordiumBlock() {
        super(Properties.of(Material.METAL, MaterialColor.TERRACOTTA_ORANGE).requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL));
    }

    public static class ExordiumBlockItem extends BlockItem {
        public ExordiumBlockItem() {
            super(BLOCK.get(), new Properties().tab(OresOresOres.TAB).craftRemainder(ExordiumIngot.ITEM.get()));
        }
    }
}