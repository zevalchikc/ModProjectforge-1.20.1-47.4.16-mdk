package net.kerozione.tutorialmod.item;

import net.kerozione.tutorialmod.TutorialModByKerozione;
import net.kerozione.tutorialmod.block.ModBlocks;
import net.kerozione.tutorialmod.util.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTiers {
    public static final Tier PYRITE = TierSortingRegistry.registerTier(
            new ForgeTier(3,1500,5f,4f,25,
                    ModTags.Blocks.NEEDS_PYRITE_TOOL, () -> Ingredient.of(Moditems.PYRITE.get())),
            ResourceLocation.fromNamespaceAndPath(TutorialModByKerozione.MOD_ID, "pyrite"), List.of(Tiers.IRON), List.of());
}
