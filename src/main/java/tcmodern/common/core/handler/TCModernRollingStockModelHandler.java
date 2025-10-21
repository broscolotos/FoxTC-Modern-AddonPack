package tcmodern.common.core.handler;

import tcmodern.client.render.locomotive.steam.ModelL3aMohawk;
import tcmodern.client.render.rollingstock.tender.ModelNYC40ft3inTender;
import tcmodern.client.render.rollingstock.tender.ModelNYC46ft4inTender;
import tcmodern.client.render.rollingstock.tender.ModelNYCPT2Tender;
import tcmodern.common.entities.steam.EntityL3aMohawk;
import tcmodern.common.entities.tender.EntityNYC40ft3inTender;
import tcmodern.common.entities.tender.EntityNYC46ft4inTender;
import tcmodern.common.entities.tender.EntityNYCPT2Tender;
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
    }
}
