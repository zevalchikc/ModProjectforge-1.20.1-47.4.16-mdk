package net.kerozione.tutorialmod.item;

import net.kerozione.tutorialmod.TutorialModByKerozione;
import net.kerozione.tutorialmod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TutorialModByKerozione.MOD_ID);

    public static final RegistryObject<CreativeModeTab> TUTORIAL_ITEMS = CREATIVE_MODE_TABS.register("tutorial_items",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(Moditems.PYRITE.get()))
                    .title(Component.translatable("creativetab.tutorial_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(Moditems.PYRITE.get());
                        pOutput.accept(Moditems.CALCINED_PYRITE.get());

                        pOutput.accept(ModBlocks.PYRITE_ORE.get());

                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
