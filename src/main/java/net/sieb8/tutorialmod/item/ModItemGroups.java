package net.sieb8.tutorialmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.sieb8.tutorialmod.TutorialMod;
import net.sieb8.tutorialmod.block.ModBlocks;

public class ModItemGroups {
    public static final ItemGroup TEST_TAB = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TutorialMod.MOD_ID, "test_tab"),
            FabricItemGroup.builder()
                    .icon(() -> new ItemStack(ModItems.TEST_ITEM))
                    .displayName(Text.translatable("itemgroup.tutorialmod.test_tab"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.TEST_ITEM);
                        entries.add(ModItems.PUZZLE_PIECE);
                        entries.add(ModBlocks.PUZZLE_BLOCK);
                        entries.add(ModBlocks.NEW_BLOCK);
                        entries.add(ModBlocks.ORE);
                    }).build());

    public static void registerItemGroups(){
        TutorialMod.LOGGER.info("Registring Item Group for " + TutorialMod.MOD_ID);
    }
}
