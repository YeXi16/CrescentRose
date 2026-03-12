package org.yexi_16.crescentrose.init;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.yexi_16.crescentrose.Crescentrose;
import org.yexi_16.crescentrose.init.animated.AnimatedItem;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Crescentrose.MODID);

    public static final RegistryObject<Item> CRESCENTROSE = ITEMS.register("crescentrose",
            () -> new AnimatedItem(new Item.Properties()));


    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
