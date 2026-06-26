package tcmodern.common.core.handler;

import tcmodern.client.render.locomotive.diesel.*;
import tcmodern.client.render.locomotive.electric.*;
import tcmodern.client.render.locomotive.steam.*;
import tcmodern.client.render.rollingstock.freight.hopper.*;
import tcmodern.client.render.rollingstock.tender.*;

import tcmodern.common.entities.diesel.*;
import tcmodern.common.entities.electric.*;
import tcmodern.common.entities.freight.hoppers.*;
import tcmodern.common.entities.steam.*;
import tcmodern.common.entities.tender.*;
import tcmodern.common.library.Info;

import train.client.render.register.TrainRenderRecord;
import train.common.Traincraft;

import java.util.ArrayList;

public class TCModernRollingStockModelHandler {
    /**
     * Only setup Model Register calls from here or you will crash the server.
     */
    public TCModernRollingStockModelHandler() throws Exception {
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
                        new TrainRenderRecord(modID, Entity40TonWoodenHopper.class, new Model40TonWoodenHopper(),
                                "40_Ton_Wooden_Hopper_",
                                new float[] {0, 0.1875f, 0}, new float[] {0, 0, 180}, null)
                );
        Traincraft.traincraftRegistry
                .RegisterRollingStockModel(
                        new TrainRenderRecord(modID, EntityNWClassAMain.class, new ModelNWClassAMain(),
                                "NWClassA_",
                                new float[] {1f, 0.1875f, 0}, new float[] {0, 0, 180},null,
                                "largesmoke",
                                new ArrayList<double[]>() { {
                                    add(new double[] { -3.6D, 1.875D, 0.0D }); }
                                },
                                "explode",
                                new ArrayList<double[]>() { {
                                    add(new double[] { -0.625D, -0.1875D, 0.625D }); }
                                },
                                10, 2)
                );
        Traincraft.traincraftRegistry
                .RegisterRollingStockModel(
                        new TrainRenderRecord(modID, EntityNWClassAFront.class, new ModelNWClassAFrontEngine(),
                        "NWClassA_",
                        new float[] {1.25f, 0.1875f, 0}, new float[] {0, 180, 180},null,
                        null, null, "explode",
                        new ArrayList<double[]>() { {
                            add(new double[] { 1.75D, -0.1875D, 0.625D }); }
                        },
                        0, 2)
                );
        Traincraft.traincraftRegistry
                .RegisterRollingStockModel(
                        new TrainRenderRecord(Info.modID, EntityNWY6bMain.class, new ModelNWY6bMain(),
                                "NWY6b_",
                                new float[] {1f, 0.1875f, 0.25f}, new float[] {0, 0, 180},null,
                                "largesmoke",
                                new ArrayList<double[]>() { {
                                    add(new double[] { -4.125D, 1.875D, 0.0D }); }
                                },
                                "explode",
                                new ArrayList<double[]>() { {
                                    add(new double[] { -0.625D, -0.1875D, 0.625D }); }
                                },
                                10, 2)
                );
        Traincraft.traincraftRegistry
                .RegisterRollingStockModel(
                        new TrainRenderRecord(modID, EntityNWY6bFront.class, new ModelNWY6bFront(),
                                "NWY6b_",
                                new float[] {0.75f, 0.1875f, -0.25f}, new float[] {0, 180, 180},null,
                                null, null, "explode",
                                new ArrayList<double[]>() { { add(new double[] { 1.9375D, -0.1875D, 0.625D }); } },
                                0, 2)
                );
        Traincraft.traincraftRegistry
                .RegisterRollingStockModel(
                        new TrainRenderRecord(modID, EntityNWTender.class, new ModelNWTender(),
                                "NWTender_",
                                new float[] {0f, 0.1875f, 0}, new float[] {0, 180, 180},null,
                                null, null, null, null, 0, 0)
                );
        Traincraft.traincraftRegistry
                .RegisterRollingStockModel(
                        new TrainRenderRecord(modID, EntityModel40.class, new ModelEMDModel40(),
                                "Model40_",
                                new float[] {-1.75f, -0.5625f, -0.00625f}, new float[] {0, 180, 180},null,
                                "smoke", new ArrayList<double[]>() { {
                                    add(new double[]{0.23D, 1.3D, 0.06D});
                                    add(new double[]{1.35D, 1.3D, -0.06D}); }
                                },
                                null, null, 5, 0)
                );
        Traincraft.traincraftRegistry
                .RegisterRollingStockModel(
                        new TrainRenderRecord(modID, EntityHandcar.class, new ModelHandCar(),
                                "HandCar_",
                                new float[] {-0.2f, 0.1875f, 0}, new float[] {0, 180, 180},null,
                                null, null, null, null, 0, 0)
                );
    }
}
