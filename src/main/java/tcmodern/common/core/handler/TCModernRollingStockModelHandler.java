package tcmodern.common.core.handler;

import tcmodern.client.render.locomotive.diesel.*;
import tcmodern.client.render.locomotive.steam.*;
import tcmodern.client.render.rollingstock.freight.hopper.Model40TonWoodenHopper;
import tcmodern.client.render.rollingstock.freight.tanks.ModelTamu8000;
import tcmodern.client.render.rollingstock.passenger.*;
import tcmodern.client.render.rollingstock.tender.*;

import tcmodern.common.entities.diesel.*;
import tcmodern.common.entities.freight.hoppers.Entity40TonWoodenHopper;
import tcmodern.common.entities.freight.tanks.EntityTamu8000;
import tcmodern.common.entities.passenger.*;
import tcmodern.common.entities.steam.*;
import tcmodern.common.entities.tender.*;
import tcmodern.common.library.Info;
import train.client.render.register.TrainRenderRecord;
import train.common.Traincraft;

public class TCModernRollingStockModelHandler {
    /**
     * Only setup Model Register calls from here or you will crash the server.
     */
    public TCModernRollingStockModelHandler() {
        final String modID = Info.modID;
        /* SAMPLE
        Traincraft.traincraftRegistry
                  .RegisterRollingStockModel
                          (new TrainRenderRecord(modID,
                          EntityPassengerBlue.class, new ModelPassenger6(),
                          "passenger", -- This is what the texture folder is called and what a texture must start with
                          new float[] { 0.0F, -0.47F, 0.0F },
                          null,
                          null)
         */
        // Put Calls to RegisterRollingStockModel below this.
        Traincraft.traincraftRegistry
                .RegisterRollingStockModel(
                        new TrainRenderRecord(modID, EntityL3aMohawk.class, new ModelL3aMohawk(),
                                "l3a_mohawk_",
                                new float[] {-2.5f, 0.1875f, 0}, new float[] {0, 0, 180},null,
                                null, null, null, null, 0, 0)
                );
        Traincraft.traincraftRegistry
                .RegisterRollingStockModel(
                        new TrainRenderRecord(modID, EntityNYC46ft4inTender.class, new ModelNYC46ft4inTender(),
                                "NYC46ft4inTender_",
                                new float[] {0, 0.1875f, 0}, new float[] {0, 0, 180}, null)
                );
        Traincraft.traincraftRegistry
                .RegisterRollingStockModel(
                        new TrainRenderRecord(modID, EntityNYC40ft3inTender.class, new ModelNYC40ft3inTender(),
                                "NYC40ft3inTender_",
                                new float[] {0.125f, 0.1875f, 0}, new float[] {0, 0, 180}, null)
                );
        Traincraft.traincraftRegistry
                .RegisterRollingStockModel(
                        new TrainRenderRecord(modID, EntityNYCPT2Tender.class, new ModelNYCPT2Tender(),
                                "NYCPT2Tender_",
                                new float[] {0, 0.1875f, 0}, new float[] {0, 0, 180}, null)
                );
        Traincraft.traincraftRegistry
                .RegisterRollingStockModel(
                        new TrainRenderRecord(modID, EntityHeavyweightTailCar.class, new ModelHeavyweightTailCar(),
                                "Heavyweight_Tail_",
                                new float[] {0, 0.1875f, 0}, new float[] {0, 0, 180}, null)
                );
        Traincraft.traincraftRegistry
                .RegisterRollingStockModel(
                        new TrainRenderRecord(modID, EntityHeavyweightColonistCar.class, new ModelHeavyweightColonistCar(),
                                "Heavyweight_Colonist_",
                                new float[] {0, 0.1875f, 0}, new float[] {0, 0, 180}, null)
                );
        Traincraft.traincraftRegistry
                .RegisterRollingStockModel(
                        new TrainRenderRecord(modID, EntityHeavyweightDinerCar.class, new ModelHeavyweightDinerCar(),
                                "Heavyweight_Diner_",
                                new float[] {0, 0.1875f, 0}, new float[] {0, 0, 180}, null)
                );
        Traincraft.traincraftRegistry
                .RegisterRollingStockModel(
                        new TrainRenderRecord(modID, EntityAC44CW.class, new ModelAC44CW(),
                                "AC44CW_",
                                new float[] {-3.3125f, 0.1875f, 0}, new float[] {0, 0, 180},null,
                                null, null, null, null, 0, 0)
                );
        Traincraft.traincraftRegistry
                .RegisterRollingStockModel(
                        new TrainRenderRecord(modID, EntityTamu8000.class, new ModelTamu8000(),
                                "Tamu_8000_",
                                new float[] {0, 0.1875f, 0}, new float[] {0, 0, 180}, null)
                );
        Traincraft.traincraftRegistry
                .RegisterRollingStockModel(
                        new TrainRenderRecord(modID, Entity40TonWoodenHopper.class, new Model40TonWoodenHopper(),
                                "40_Ton_Wooden_Hopper_",
                                new float[] {0, 0.1875f, 0}, new float[] {0, 0, 180}, null)
                );
    }
}
