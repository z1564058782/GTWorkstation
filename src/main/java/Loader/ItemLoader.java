package Loader;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public class ItemLoader {
    private static void register(Item item, String name)
    {
        GameRegistry.registerItem(item, name);
    }
}
