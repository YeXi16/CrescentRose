package org.yexi_16.crescentrose;

import com.mojang.logging.LogUtils;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;
import org.yexi_16.crescentrose.init.ModCreativeTabs;
import org.yexi_16.crescentrose.init.ModItems;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(Crescentrose.MODID)
public class Crescentrose {

    // Define mod id in a common place for everything to reference
    public static final String MODID = "crescentrose";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();

    public Crescentrose() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        //region ModEventBus
        ModCreativeTabs.register(modEventBus);
        ModItems.register(modEventBus);


        // end region

        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);
        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);

    }

    private void commonSetup(final FMLCommonSetupEvent event) {}

}
