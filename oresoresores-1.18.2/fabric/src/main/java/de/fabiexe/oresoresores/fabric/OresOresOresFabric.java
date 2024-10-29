package de.fabiexe.oresoresores.fabric;

import net.fabricmc.api.ModInitializer;
import de.fabiexe.oresoresores.OresOresOres;

public class OresOresOresFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        OresOresOres.init();
    }
}