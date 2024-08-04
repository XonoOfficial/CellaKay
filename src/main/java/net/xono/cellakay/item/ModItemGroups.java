package net.xono.cellakay.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.xono.cellakay.CellaKay;
import net.xono.cellakay.block.ModBlocks;

public class ModItemGroups {
    public static final ItemGroup CELLA_ITEM_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(CellaKay.MOD_ID, "ruby"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.cellakay.items"))
                    .icon(() -> new ItemStack(ModItems.RUBY)).entries((displayContext, entries) -> {
                        entries.add(ModItems.RUBY);
                        entries.add(ModItems.RAW_RUBY);
                        entries.add(ModBlocks.RUBY_BLOCK);
                        entries.add(ModBlocks.RUBY_ORE_BLOCK);
                    }).build());

    public static void registerItemGroups() {
        CellaKay.LOGGER.info("Registering Item Groups for " + CellaKay.MOD_ID);
    }
}
