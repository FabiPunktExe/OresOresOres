package de.fabiexe.oresoresores.block;

import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.material.Material;
import de.fabiexe.oresoresores.OresOresOres;

import java.util.HashMap;
import java.util.Random;

public class Killium extends Block {
    public static RegistrySupplier<Block> BLOCK;
    public static RegistrySupplier<Item> ITEM;

    public Killium() {
        super(Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(3.0F, 3.0F));
    }

    public static class KilliumItem extends BlockItem {
        private HashMap<Entity, Integer> ticksInInventory = new HashMap<>();

        public KilliumItem() {
            super(BLOCK.get(), new Properties().tab(OresOresOres.TAB));
        }

        @Override
        public void inventoryTick(ItemStack itemStack, Level level, Entity entity, int i, boolean bl) {
            if (!level.isClientSide && entity instanceof LivingEntity le) {
                ticksInInventory.put(le, ticksInInventory.getOrDefault(le, 0) + 1);
                if (ticksInInventory.get(le) >= 20 * 3 + new Random().nextInt(20 * 4)) {
                    ticksInInventory.remove(le);
                    le.hurt(DamageSource.GENERIC, Float.MAX_VALUE);
                }
            }
        }
    }
}