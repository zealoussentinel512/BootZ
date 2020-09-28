package net.boot;

import me.sargunvohra.mcmods.autoconfig1u.AutoConfig;
import me.sargunvohra.mcmods.autoconfig1u.serializer.JanksonConfigSerializer;
import net.boot.config.bootconfig;
import net.fabricmc.api.ModInitializer;

public class speed implements ModInitializer {

        public static bootconfig CONFIG = new bootconfig();

        @Override
        public void onInitialize() {
                AutoConfig.register(bootconfig.class, JanksonConfigSerializer::new);
                CONFIG = AutoConfig.getConfigHolder(bootconfig.class).getConfig();
                SpeedingItem.init();
                bloot.init();
        }

}

// You are LOVED!!!
// Jesus loves you unconditional!