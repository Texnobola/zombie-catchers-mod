package zombie.catchers.init;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import zombie.catchers.Zombiecatchers;

public class ModItems {

    // DeferredRegister is Forge's way of safely registering items
    public static final DeferredRegister<Item> ITEMS =
        DeferredRegister.create(ForgeRegistries.ITEMS, Zombiecatchers.MOD_ID);

    // Our first item stub — no behaviour yet, just registers the name
    public static final RegistryObject<Item> HARPOON_GUN =
        ITEMS.register("harpoon_gun", () -> new Item(new Item.Properties()));

    // This connects our register to the mod event bus
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
        Zombiecatchers.LOGGER.info("Items registered.");
    }
}