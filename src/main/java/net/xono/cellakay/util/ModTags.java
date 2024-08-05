package net.xono.cellakay.util;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.xono.cellakay.CellaKay;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> METAL_BLOCK =
                createTag("metal_block");

        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, new Identifier(CellaKay.MOD_ID, name));
        }
    }

    public static class Items {

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, new Identifier(CellaKay.MOD_ID, name));
        }
    }
}
