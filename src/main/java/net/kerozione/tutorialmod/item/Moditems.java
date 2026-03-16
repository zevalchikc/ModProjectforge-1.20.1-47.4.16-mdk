package net.kerozione.tutorialmod.item;

import net.kerozione.tutorialmod.TutorialModByKerozione;
import net.kerozione.tutorialmod.item.custom.MetalDetectorItem;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Moditems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TutorialModByKerozione.MOD_ID);

    public static final RegistryObject<Item> PYRITE = ITEMS.register("pyrite",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CALCINED_PYRITE = ITEMS.register("calcined_pyrite",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> METAL_DETECTOR = ITEMS.register("metal_detector",
            () -> new MetalDetectorItem(new Item.Properties().durability(100)));


    public static final RegistryObject<Item> PYRITE_SWORD = ITEMS.register("pyrite_sword",
            () -> new SwordItem(ModToolTiers.PYRITE, 4,2,  new Item.Properties()));
    public static final RegistryObject<Item> PYRITE_PICKAXE = ITEMS.register("pyrite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.PYRITE, 1,1,  new Item.Properties()));
    public static final RegistryObject<Item> PYRITE_AXE = ITEMS.register("pyrite_axe",
            () -> new AxeItem(ModToolTiers.PYRITE, 7,1,  new Item.Properties()));
    public static final RegistryObject<Item> PYRITE_SHOVEL = ITEMS.register("pyrite_shovel",
            () -> new ShovelItem(ModToolTiers.PYRITE, 1,1,  new Item.Properties()));
    public static final RegistryObject<Item> PYRITE_HOE = ITEMS.register("pyrite_hoe",
            () -> new HoeItem(ModToolTiers.PYRITE, 1,1,  new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}