package testmod.Proxy;


import testmod.ModBlocks;

/**
 * Created by froststar21 on 5/20/2017.
 */


public class ClientProxy extends CommonProxy {
    public void preInit() {
        ModBlocks.initModels();
    }

    public void init() {

}

    public void postInit() {
    }
}
