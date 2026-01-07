package jacob_modcreation.init.datagen;

import jacob_modcreation.TutorialMod;
import jacob_modcreation.init.CreativeTabInit;
import jacob_modcreation.init.items.ItemInit;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.TieredItem;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

import static jacob_modcreation.init.CreativeTabInit.*;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, TutorialMod.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        ITEM_REGISTRY_COLLECTION.forEach(this::simpleItemBuilder);
        TIERED_ITEM_REGISTRY_COLLECTION.forEach(this::tieredItemBuilder);

    }

    private ItemModelBuilder simpleItemBuilder(RegistryObject<? extends Item> item){
        return withExistingParent(item.getId()
                .getPath()
                , ResourceLocation.tryParse("item/generated")).texture("layer0",
                 ResourceLocation.tryBuild(TutorialMod.MODID, "item/" + item.getId().getPath()));
    }

    private ItemModelBuilder tieredItemBuilder(RegistryObject<? extends TieredItem> blockItem){
        return withExistingParent(blockItem.getId()
                        .getPath()
                , ResourceLocation.tryParse("item/handheld")).texture("layer0",
                ResourceLocation.tryBuild(TutorialMod.MODID, "item/" + blockItem.getId().getPath()));
    }


}
