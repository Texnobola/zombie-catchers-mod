package zombie.catchers.init;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import zombie.catchers.Zombiecatchers;
import zombie.catchers.init.ModItems;

public class ModCreativeTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
        DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Zombiecatchers.MOD_ID);

    // Our custom tab — shows up in creative inventory
    public static final RegistryObject<CreativeModeTab> ZOMBIE_CATCHERS_TAB =
        CREATIVE_MODE_TABS.register("zombie_catchers_tab", () ->
            CreativeModeTab.builder()
                .title(Component.translatable("itemGroup.zombiecatchers.main"))
                .icon(() -> new ItemStack(ModItems.HARPOON_GUN.get()))
                .displayItems((params, output) -> {
                    output.accept(ModItems.HARPOON_GUN.get());
                    output.accept(ModItems.ZOMBIE_CAGE.get());
                    output.accept(ModItems.JETPACK.get());
                    output.accept(ModItems.ZOMBIE_JUICE_GREEN.get());
                    output.accept(ModItems.ZOMBIE_JUICE_RED.get());
                    output.accept(ModItems.ZOMBIE_JUICE_BLUE.get());
                    output.accept(ModItems.ZOMBIE_ESSENCE.get());
                    output.accept(ModItems.GOLD_COIN.get());
                })
                .build()
        );

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}