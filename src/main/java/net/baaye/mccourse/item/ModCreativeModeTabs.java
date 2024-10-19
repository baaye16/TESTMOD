package net.baaye.mccourse.item;

import net.baaye.mccourse.MCCourseMod;
import net.baaye.mccourse.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MCCourseMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> COURSE_TAB = CREATIVE_MODE_TABS.register("course_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.alexandrite.get()))
                    .title(Component.translatable("creativetab.cource_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.alexandrite.get());
                        output.accept(ModBlocks.alexandrite_ore.get());
                        output.accept(ModItems.raw_alexandrite.get());

                        output.accept(ModBlocks.alexandrite_block.get());
                        output.accept(ModBlocks.raw_alexandrite_block.get());
                        output.accept(ModBlocks.nether_alexandrite_ore.get());
                        output.accept(ModBlocks.end_stone_alexandrite_ore.get());


                    }).build());

    public static void  register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
