package jacob_modcreation.init;
import jacob_modcreation.TutorialMod;
import jacob_modcreation.init.items.ItemInit;
import net.minecraft.client.gui.components.tabs.Tab;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.*;
import net.minecraft.world.level.CollisionGetter;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Supplier;
import java.util.logging.Logger;

import static jacob_modcreation.init.blocks.BlockInit.BLOCKS;
import static jacob_modcreation.init.items.ItemInit.ITEMS;


@Mod.EventBusSubscriber(modid = TutorialMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class CreativeTabInit {
    public static final DeferredRegister<CreativeModeTab> TABS
            = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TutorialMod.MODID);

    public static final List<Supplier<? extends ItemLike>> EXAMPLE_TAB_ITEMS = new ArrayList<>();

    public static final List<RegistryObject<? extends Item>> ITEM_REGISTRY_COLLECTION = new ArrayList<>();
    public static final List<RegistryObject<? extends Block>> BLOCK_REGISTRY_COLLECTION = new ArrayList<>();
    public static final List<RegistryObject<? extends BlockItem>> BLOCK_ITEM_REGISTRY_COLLECTION = new ArrayList<>();
    public static final List<RegistryObject<? extends SwordItem>> TIERED_ITEM_REGISTRY_COLLECTION = new ArrayList<>();

    public static final RegistryObject<CreativeModeTab> EXAMPLE_TAB = TABS.register("example_tab",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("Chariote"))
                    .icon(ItemInit.CHARIOTE_IGNOT.get()::getDefaultInstance)
                    .displayItems(((itemDisplayParameters, output)
                            -> EXAMPLE_TAB_ITEMS.forEach(itemLike -> output.accept(itemLike.get()))))
                    .build()

    );



    public static RegistryObject<Item> simpleItem(String name, Supplier<? extends Item> supplier) {
        RegistryObject<Item> item = ITEMS.register(name, supplier);
        EXAMPLE_TAB_ITEMS.add(item);
        ITEM_REGISTRY_COLLECTION.add(item);
        return item;
    }

    public static RegistryObject<SwordItem> swordItem(String name, Supplier<? extends SwordItem> supplier) {
        RegistryObject<SwordItem> item = ITEMS.register(name, supplier);
        EXAMPLE_TAB_ITEMS.add(item);
        TIERED_ITEM_REGISTRY_COLLECTION.add(item);
        return item;
    }


    public static RegistryObject<BlockItem> blockItem(String name, Supplier<? extends BlockItem> supplier) {
        RegistryObject<BlockItem> item = ITEMS.register(name, supplier);
        EXAMPLE_TAB_ITEMS.add(item);
        return item;
    }

    public static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<? extends T> supplier) {
        RegistryObject<T> block = BLOCKS.register(name, supplier);
        BLOCK_REGISTRY_COLLECTION.add(block);
        return block;

    }





    @SubscribeEvent
    public static void buildContents(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS){
        }
//
//        if (event.getTabKey() == CreativeModeTabs.INGREDIENTS){
//            event.accept(TINK);
//        }
//
//
//

////
////        if (event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS){
////            ev
////        }
//
//    }

    //genius need to make an object into 1 and use both so awsome!


}
}
