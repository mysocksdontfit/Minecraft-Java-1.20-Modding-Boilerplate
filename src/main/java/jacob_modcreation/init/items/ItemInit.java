package jacob_modcreation.init.items;

import jacob_modcreation.TutorialMod;
//import jacob_modcreation.entity.ModEntities;
import jacob_modcreation.init.blocks.BlockInit;
import jacob_modcreation.init.items.advanced_tools.AdvancedCharioteSword;
import jacob_modcreation.init.items.food.CharioteApple;
import net.minecraft.world.item.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static jacob_modcreation.init.CreativeTabInit.*;


public class ItemInit {



    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MODID);

    public static final RegistryObject<Item> CHARIOTE_IGNOT
            = simpleItem("chariote_ignot", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CHARIOTE_APPLE =
            simpleItem("chariote_apple", () -> new Item(new Item.Properties().food(CharioteApple.CHARIOTE_APPLE)));

    public static final RegistryObject<Item> CHARIOTE_SHARD
            = simpleItem("chariote_shard", () -> new Item(new Item.Properties()));

    public static final RegistryObject<BlockItem> DEEPSLATE_CHARIOTE_ORE
            = blockItem("deepslate_chariote_ore", () -> new BlockItem(BlockInit.DEEPSLATE_CHARIOTE_ORE.get(), new Item.Properties()));

    public static final RegistryObject<BlockItem> CHARIOTE_BLOCK
            = blockItem("chariote_block", () -> new BlockItem(BlockInit.CHARIOTE_BLOCK.get(), new Item.Properties()));

    public static final RegistryObject<SwordItem> CHARIOTE_SWORD =
            swordItem("chariote_sword",() -> new AdvancedCharioteSword(Tiers.DIAMOND, 3, -2.4F, new Item.Properties()));

}
