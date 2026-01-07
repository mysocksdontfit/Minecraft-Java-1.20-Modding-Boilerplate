package jacob_modcreation;



import jacob_modcreation.init.CreativeTabInit;
import jacob_modcreation.init.blocks.BlockInit;
import jacob_modcreation.init.items.ItemInit;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.ForgeRegistries;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



//Entry point!

@Mod(TutorialMod.MODID)
public class TutorialMod {

    public static final Logger LOGGER = LogManager.getLogger();

    public static final String MODID = "tutorialmod";

    public TutorialMod(){

        // Bus goes to each bus stop, collects passengers (`events`) takes passenger to destination
        // We need to tell it to stop here and do this
        //bus essentially listens for events

        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        ItemInit.ITEMS.register(bus);
        BlockInit.BLOCKS.register(bus);
        CreativeTabInit.TABS.register(bus);
        LOGGER.debug("\n\n\n\n\n\n\n\n\n\n" + CreativeTabInit.BLOCK_REGISTRY_COLLECTION);
         // may come back to haunt me
    }
//    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
//    public static class ClientModEvents {
//        @SubscribeEvent
//        public static void onClientSetupEvent(FMLClientSetupEvent event){
//            EntityRenderers.register(ModEntities.TOBY.get(), TobyRenderer::new);
//            EntityRenderers.register(ModEntities.RISHI.get(), RishiRenderer::new);
//
//        }
//    }

}
