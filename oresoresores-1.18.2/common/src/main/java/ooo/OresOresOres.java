package ooo;

import dev.architectury.registry.CreativeTabRegistry;
import dev.architectury.registry.registries.DeferredRegister;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import ooo.block.*;

public class OresOresOres {
    public static final String MOD_ID = "ooo";
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(MOD_ID, Registry.ITEM_REGISTRY);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(MOD_ID, Registry.BLOCK_REGISTRY);
    public static final CreativeModeTab TAB = CreativeTabRegistry.create(new ResourceLocation(MOD_ID, "ores"), () -> new ItemStack(Killium.ITEM.get()));

    public static void init() {
        Exordium.BLOCK = OresOresOres.BLOCKS.register("exordium", Exordium::new);
        Exordium.ITEM = OresOresOres.ITEMS.register("exordium", Exordium.ExordiumItem::new);
        RawExordium.ITEM = OresOresOres.ITEMS.register("raw_exordium", RawExordium::new);
        ExordiumIngot.ITEM = OresOresOres.ITEMS.register("exordium_ingot", ExordiumIngot::new);
        ExordiumBlock.BLOCK = OresOresOres.BLOCKS.register("exordium_block", ExordiumBlock::new);
        ExordiumBlock.ITEM = OresOresOres.ITEMS.register("exordium_block", ExordiumBlock.ExordiumBlockItem::new);
        Killium.BLOCK = OresOresOres.BLOCKS.register("killium", Killium::new);
        Killium.ITEM = OresOresOres.ITEMS.register("killium", Killium.KilliumItem::new);
        BLOCKS.register();
        ITEMS.register();
    }
}
