package tcmodern.common;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import tcmodern.common.core.handler.TCModernRollingStockEntityHandler;
import tcmodern.common.library.Info;


@Mod(modid = Info.modID, name = Info.modName, version = Info.modVersion, dependencies = "required-after:tc")
public class TCModernFoxTC {
    /* TCModern instance */
    @Instance(Info.modID)
    public static TCModernFoxTC instance;

    /* TCModern Logger */
    public static Logger addonLog = LogManager.getLogger(Info.modName);

    public static CreativeTabs tcModernTab;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        addonLog.info("preInit Addon Pack -" + Info.modName);
        tcModernTab = new tcmodern.common.creativetabs.CreativeTabTCModern(CreativeTabs.getNextID(), "TC Modern", Items.apple); //TODO: change item

        tcmodern.common.library.TCModernItems tcModernItems = new tcmodern.common.library.TCModernItems();
        TCModernRollingStockEntityHandler entityHandler = new TCModernRollingStockEntityHandler();

        if (FMLCommonHandler.instance().getEffectiveSide().isClient()) {
            new tcmodern.common.core.handler.TCModernRollingStockModelHandler();
        }
    }

    @EventHandler
    public void load(FMLInitializationEvent event) { addonLog.info("load Addon Pack -" + Info.modName); }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) { addonLog.info("postInit Addon Pack -" + Info.modName); }
}
