package tcmodern.common.core.handler;

import tcmodern.client.render.locomotive.steam.ModelL3aMohawk;
import tcmodern.common.entities.steam.EntityL3aMohawk;
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
    }
}
