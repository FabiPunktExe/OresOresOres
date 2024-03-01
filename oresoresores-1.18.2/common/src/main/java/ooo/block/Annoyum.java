package ooo.block;

import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.OreBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import ooo.OresOresOres;

public class Annoyum extends OreBlock {
    public static RegistrySupplier<Block> BLOCK;
    public static RegistrySupplier<Item> ITEM;

    public Annoyum() {
        super(Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(3.0F, 3.0F));
    }

    @Override
    public void spawnAfterBreak(BlockState block, ServerLevel level, BlockPos pos, ItemStack itemStack) {
        ItemEntity item = new ItemEntity(level, pos.getX(), pos.getY(), pos.getZ(), ITEM.get().getDefaultInstance());
        item.setPickUpDelay(Integer.MAX_VALUE);
        level.addFreshEntity(item);
    }

    public static class AnnoyumItem extends BlockItem {
        public AnnoyumItem() {
            super(BLOCK.get(), new Properties().tab(OresOresOres.TAB));
        }
    }
}