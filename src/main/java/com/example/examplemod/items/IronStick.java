package com.example.examplemod.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class IronStick extends Item {
    public IronStick() {
        super(new Item.Properties()
        .group(ItemGroup.MATERIALS)
        .maxStackSize(64));
    }
}
