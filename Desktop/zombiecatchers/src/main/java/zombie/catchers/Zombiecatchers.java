package zombie.catchers;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import zombie.catchers.init.ModCreativeTabs;
import zombie.catchers.init.ModItems;

@Mod(Zombiecatchers.MOD_ID)
public class Zombiecatchers {

    public static final String MOD_ID = "zombiecatchers";
    public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

    public Zombiecatchers() {
        LOGGER.info("Zombie Catchers mod loading...");

        ModItems.register(FMLJavaModLoadingContext.get().getModEventBus());
        ModCreativeTabs.register(FMLJavaModLoadingContext.get().getModEventBus());

        // TODO Step 3: ModBlocks.register()
        // TODO Step 4: ModEntities.register()

        LOGGER.info("Zombie Catchers mod loaded!");
    }
}