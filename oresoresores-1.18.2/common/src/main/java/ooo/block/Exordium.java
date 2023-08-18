package ooo.block;

import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.OreBlock;
import net.minecraft.world.level.material.Material;
import ooo.OresOresOres;

import java.util.HashMap;
import java.util.Random;

public class Exordium extends OreBlock {
    public static RegistrySupplier<Block> BLOCK;
    public static RegistrySupplier<Item> ITEM;

    public Exordium() {
        super(Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(3.0F, 3.0F));
    }

    public static class ExordiumItem extends BlockItem {
        public ExordiumItem() {
            super(BLOCK.get(), new Properties().tab(OresOresOres.TAB));
        }
    }
}