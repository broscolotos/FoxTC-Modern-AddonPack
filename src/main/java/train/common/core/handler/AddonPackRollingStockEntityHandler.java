package train.common.core.handler;

import train.client.render.register.TrainRenderRecord;
import train.common.FoxTCAddonPack;
import train.common.FoxTCAddonPack.*;
import train.common.Traincraft;
import train.common.library.AddonPackItems;
import train.common.library.AddonRollingStockItems;
import train.common.library.Info;
import train.common.library.register.TrainRecord;

public class AddonPackRollingStockEntityHandler
{
    private Object Instance()
    {
        return FoxTCAddonPack.instance;
    }

    public AddonPackRollingStockEntityHandler()
    {
        // Template
        Traincraft.traincraftRegistry
                  .RegisterRollingStock
                          (AddonRollingStockItems.minecraftTemplate,
                            new TrainRecord("This is a test internal name", ),
                            new TrainRenderRecord(Info.modID, ),
                            Instance());
    }
}
