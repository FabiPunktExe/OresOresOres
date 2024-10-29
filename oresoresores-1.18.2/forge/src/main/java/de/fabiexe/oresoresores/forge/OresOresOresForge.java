package de.fabiexe.oresoresores.forge;

import de.fabiexe.oresoresores.OresOresOres;
import dev.architectury.platform.forge.EventBuses;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(OresOresOres.MOD_ID)
public class OresOresOresForge {
    public OresOresOresForge() {
        EventBuses.registerModEventBus(OresOresOres.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        OresOresOres.init();
    }
}