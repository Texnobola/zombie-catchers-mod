package zombie.catchers.init;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import zombie.catchers.Zombiecatchers;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
        DeferredRegister.create(ForgeRegistries.ITEMS, Zombiecatchers.MOD_ID);

    // ── Harpoon Gun ── fires a projectile that captures zombies
    public static final RegistryObject<Item> HARPOON_GUN =
        ITEMS.register("harpoon_gun", () -> new Item(new Item.Properties()));

    // ── Zombie Cage ── holds a captured zombie
    public static final RegistryObject<Item> ZOMBIE_CAGE =
        ITEMS.register("zombie_cage", () -> new Item(new Item.Properties()));

    // ── Jetpack ── chestplate that lets you fly
    public static final RegistryObject<Item> JETPACK =
        ITEMS.register("jetpack", () -> new Item(new Item.Properties()));

    // ── Juices ── crafted from zombie cages, give buffs
    public static final RegistryObject<Item> ZOMBIE_JUICE_GREEN =
        ITEMS.register("zombie_juice_green", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ZOMBIE_JUICE_RED =
        ITEMS.register("zombie_juice_red", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ZOMBIE_JUICE_BLUE =
        ITEMS.register("zombie_juice_blue", () -> new Item(new Item.Properties()));

    // ── Resources ── drops and currency
    public static final RegistryObject<Item> ZOMBIE_ESSENCE =
        ITEMS.register("zombie_essence", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> GOLD_COIN =
        ITEMS.register("gold_coin", () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
        Zombiecatchers.LOGGER.info("Items registered.");
    }
}