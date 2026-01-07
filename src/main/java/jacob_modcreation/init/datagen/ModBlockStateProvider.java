package jacob_modcreation.init.datagen;

import jacob_modcreation.TutorialMod;
import jacob_modcreation.init.CreativeTabInit;
import jacob_modcreation.init.blocks.BlockInit;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import org.apache.logging.log4j.LogManager;
import org.codehaus.plexus.util.DirectoryWalkListener;

import java.util.function.Supplier;

import static jacob_modcreation.init.CreativeTabInit.BLOCK_REGISTRY_COLLECTION; // Needs to be more util tool!

public class ModBlockStateProvider extends BlockStateProvider {

    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, TutorialMod.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        BLOCK_REGISTRY_COLLECTION.forEach(this::blockWithItem);
    }

    private void blockWithItem(RegistryObject<? extends Block> blockRegistryObject){
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }


}

