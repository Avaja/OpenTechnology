package ot.item;

import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.registry.GameRegistry;
import ic2.api.item.IC2Items;
import net.minecraft.item.Item;
import ot.Config;

/**
 * Created by Avaja on 07.05.2016.
 */
public class Items {

    public static Item tesla, radar, scanner, nr, uranCell;

    public static void init(){

        tesla = new ItemTeslaUpgrade();
        radar = new ItemRadarUpgrade();
        scanner = new ItemScanner();
        nr = new ItemNRUpgrade();

        if(Loader.isModLoaded("IC2"))
            uranCell = IC2Items.getItem("reactorUraniumSimple").getItem();

        if(Config.registerTeslaUpgrade)
            GameRegistry.registerItem(tesla, "ot_teslaUpgrade");
        if(Config.registerRadarUpgrade)
            GameRegistry.registerItem(radar, "ot_radarUpgrade");
        if(Config.registerScanner)
            GameRegistry.registerItem(scanner, "ot_scanner");
        if(Config.registerNR && Loader.isModLoaded("IC2"))
            GameRegistry.registerItem(nr, "ot_nrUpgrade");
    }
}
