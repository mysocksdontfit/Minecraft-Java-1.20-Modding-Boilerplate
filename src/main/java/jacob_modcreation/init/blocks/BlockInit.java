package jacob_modcreation.init.blocks;

import jacob_modcreation.TutorialMod;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static jacob_modcreation.init.CreativeTabInit.registerBlock;

public class BlockInit {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, TutorialMod.MODID);

    public static final RegistryObject<Block> DEEPSLATE_CHARIOTE_ORE
            = registerBlock("deepslate_chariote_ore", () -> new Block(Block.Properties.of().strength(0.1f)));

    public static final RegistryObject<Block> CHARIOTE_BLOCK
            = registerBlock("chariote_block", () -> new Block(Block.Properties.of().strength(0.1f)));




}
