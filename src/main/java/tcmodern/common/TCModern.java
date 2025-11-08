package tcmodern.common;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.creativetab.CreativeTabs;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import tcmodern.common.core.handler.TCModernRollingStockEntityHandler;
import tcmodern.common.creativetabs.CreativeTabTCModern;
import tcmodern.common.library.*;
import train.common.Traincraft;


@Mod(modid = Info.modID, name = Info.modName, version = Info.modVersion, dependencies = "required-after:tc")
public class TCModern {
    /* TCModern instance */
    @Instance(Info.modID)
    public static TCModern instance;

    /* TCModern Logger */
    public static Logger addonLog = LogManager.getLogger(Info.modName);

    public static CreativeTabTCModern tcModernTab;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        addonLog.info("preInit Addon Pack -" + Info.modName);
        tcModernTab = new tcmodern.common.creativetabs.CreativeTabTCModern(CreativeTabs.getNextID(), "TC Modern");

        TCModernItems tcModernItems = new TCModernItems();
        TCModernRollingStockEntityHandler entityHandler = new TCModernRollingStockEntityHandler();
        tcModernTab.setIconItemStack(TCModernRollingStockItems.L3aMohawk.item);

        if (FMLCommonHandler.instance().getEffectiveSide().isClient()) {
            new tcmodern.common.core.handler.TCModernRollingStockModelHandler();
        }

        new TCModernTableRecipeRegistry();
    }

    @EventHandler
    public void load(FMLInitializationEvent event) { addonLog.info("load Addon Pack -" + Info.modName); }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        addonLog.info("postInit Addon Pack -" + Info.modName);
        for (TCMLockoutGroups group : TCMLockoutGroups.values()) {
            Traincraft.lockoutPermissionsUtil.AddLockGroup(group);
        }
    }
}
