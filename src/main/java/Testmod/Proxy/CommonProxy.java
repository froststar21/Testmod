package Testmod.Proxy;
import Testmod.ModBlocks;
import Testmod.ModItems;
import Testmod.ModRecipes;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by froststar21 on 5/20/2017.
 */
public abstract class CommonProxy {
    public void preInit(FMLPreInitializationEvent event) {
        ModBlocks.init();
        ModRecipes.init();
    }

    public void init(FMLInitializationEvent event) {

    }

    public void postInit(FMLPostInitializationEvent event) {

    }
}