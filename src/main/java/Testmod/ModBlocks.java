package testmod;

import testmod.Blocks.Basicblock;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Created by froststar21 on 5/21/2017.
 */
public class ModBlocks {
    public static Basicblock basicblock;
    public static void init() {
        basicblock = new Basicblock();
    }

@SideOnly(Side.CLIENT)
public static void initModels() {
    basicblock.initModel();
    }
}