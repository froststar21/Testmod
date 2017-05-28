package testmod.Blocks;

import testmod.ExampleMod;
import testmod.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Created by froststar21 on 5/21/2017.
 */
public class Basicblock extends Block{
    public Basicblock(){
        super(Material.CLOTH);
        this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
        setUnlocalizedName("basicblock");
        setRegistryName("basicblock");
        GameRegistry.register(this);
        GameRegistry.register(new ItemBlock(this), getRegistryName());
}
    @SideOnly(Side.CLIENT)
    public void initModel(){
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0,new ModelResourceLocation(getRegistryName(), "inventory"));
    }
    public void initCrafting() {
        GameRegistry.addRecipe(new ItemStack(ModBlocks.basicblock),
        "WWW",
                "WDW",
        "DDD", 'D', Blocks.DIRT, 'W', Blocks.WOOL);
    }
}
