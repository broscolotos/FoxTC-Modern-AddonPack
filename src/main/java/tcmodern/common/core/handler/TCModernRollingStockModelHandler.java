package tcmodern.common.core.handler;

import tcmodern.client.render.locomotive.diesel.*;
import tcmodern.client.render.locomotive.electric.ModelHandCar;
import tcmodern.client.render.locomotive.electric.ModelNorthwesternEl24;
import tcmodern.client.render.locomotive.electric.ModelRadioFlyerHandcar;
import tcmodern.client.render.locomotive.steam.*;
import tcmodern.client.render.rollingstock.freight.hopper.*;
import tcmodern.client.render.rollingstock.freight.tanks.*;
import tcmodern.client.render.rollingstock.passenger.*;
import tcmodern.client.render.rollingstock.tender.*;

import tcmodern.common.entities.diesel.*;
import tcmodern.common.entities.electric.EntityHandcar;
import tcmodern.common.entities.electric.EntityNorthwesternEl24;
import tcmodern.common.entities.electric.EntityRadioFlyer;
import tcmodern.common.entities.freight.hoppers.*;
import tcmodern.common.entities.freight.tanks.*;
import tcmodern.common.entities.passenger.*;
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
                                "largesmoke", new ArrayList<double[]>() { { add(new double[] { 4.875D, 1.3875D, 0.0D }); } }, "explode", new ArrayList<double[]>() { { add(new double[] { 4.5, -0.1875D, 0.6875D }); } }, 10, 2)
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
                        new TrainRenderRecord(modID, EntityHeavyweightCombineCar.class, new ModelHeavyweightCombineCar(),
                                "Heavyweight_Combine_",
                                new float[] {0, 0.1875f, 0}, new float[] {0, 0, 180}, null)
                );
        Traincraft.traincraftRegistry
                .RegisterRollingStockModel(
                        new TrainRenderRecord(modID, EntityHeavyweightBaggageCar.class, new ModelHeavyweightBaggageCar(),
                                "Heavyweight_Baggage_",
                                new float[] {0, 0.1875f, 0}, new float[] {0, 0, 180}, null)
                );
        Traincraft.traincraftRegistry
                .RegisterRollingStockModel(
                        new TrainRenderRecord(modID, EntityAC44CW.class, new ModelAC44CW(),
                                "AC44CW_",
                                new float[] {-3.3125f, 0.1875f, 0}, new float[] {0, 0, 180},null, "smoke",
                                new ArrayList<double[]>() { { add(new double[]{1.59375D, 1.4D, 0.0D}); } },
                                null, null, 5, 0)
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
        Traincraft.traincraftRegistry
                .RegisterRollingStockModel(
                        new TrainRenderRecord(modID, EntityAllegheny.class, new ModelAlleghenyMain(),
                                "Allegheny_",
                                new float[] {1, 0.1875f, 0}, new float[] {0, 180, 180},null,
                                "largesmoke", new ArrayList<double[]>() { { add(new double[] { -3.96875D, 1.8125D, 0.0D }); add(new double[] { -3.6875D, 1.8125D, 0.0D }); } }, "explode", new ArrayList<double[]>() { { add(new double[] { -0.5, -0.1875D, 0.6875D }); } }, 10, 2)
                );
        Traincraft.traincraftRegistry
                .RegisterRollingStockModel(
                        new TrainRenderRecord(modID, EntityAlleghenyFront.class, new ModelAlleghenyFront(),
                                "Allegheny_",
                                new float[] {1f, 0.1875f, 0}, new float[] {0, 0, 180},null,
                                null, null, "explode", new ArrayList<double[]>() { { add(new double[] { 2.0625D, -0.1875D, 0.6875D }); } }, 0, 2)
                );
        Traincraft.traincraftRegistry
                .RegisterRollingStockModel(
                        new TrainRenderRecord(modID, EntityCnOTender.class, new ModelCnOTender(),
                                "CnOTender_", new float[] {0, 0.1875f, 0}, new float[] {0, 0, 180}, null)
                );
        Traincraft.traincraftRegistry
                .RegisterRollingStockModel(
                        new TrainRenderRecord(modID, Entity100TonHopper.class, new Model100TonHopper(),
                                "100_Ton_Hopper_", new float[] {0, 0.28125f, 0}, new float[] {0, 0, 180}, null)
                );
        Traincraft.traincraftRegistry
                .RegisterRollingStockModel(
                        new TrainRenderRecord(modID, EntityPRRT1.class, new ModelPRRT1(),
                            "PRR_T1_",
                            new float[] {-3.25f, 0.1875f, 0}, new float[] {0, 180, 180},null,
                            "largesmoke", new ArrayList<double[]>() { {
                                add(new double[] { 5.75D, 1.7D, 0.0D }); }
                            },
                            "explode", new ArrayList<double[]>() { {
                                add(new double[] { 6D, -0.1875D, 0.6875D });
                                add(new double[] { 3.25D, -0.1875D, 0.6875D }); }
                            },
                            10, 2)
                );
        Traincraft.traincraftRegistry
                .RegisterRollingStockModel(
                        new TrainRenderRecord(modID, EntityPRRCoastToCoastTender.class, new ModelPRRCoastToCoastTender(),
                                "PRRCoastToCoast_", new float[] {0, 0.1875f, 0}, new float[] {0, 180, 180}, null)
                );
        Traincraft.traincraftRegistry
                .RegisterRollingStockModel(
                        new TrainRenderRecord(modID, EntityNorthwesternEl24.class, new ModelNorthwesternEl24(),
                                "NorthwesternEI24_",
                                new float[] {-2.625f, 0.1875f, 0}, new float[] {0, 0, 180},null,
                                null, null, null, null, 0, 0)
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
                                new float[] {1.25f, 0.1875f, 0.25f}, new float[] {0, 0, 180},null,
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
                                new float[] {1.25f, 0.1875f, -0.25f}, new float[] {0, 180, 180},null,
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
        Traincraft.traincraftRegistry
                .RegisterRollingStockModel(
                        new TrainRenderRecord(modID, EntityRadioFlyer.class, new ModelRadioFlyerHandcar(),
                                "RadioFlyer_",
                                new float[] {-0.2f, 0.1875f, 0}, new float[] {0, 180, 180},null,
                                null, null, null, null, 0, 0)
                );
        //edit
        Traincraft.traincraftRegistry
                .RegisterRollingStockModel(
                        new TrainRenderRecord(modID, EntityEMCE3A.class, new ModelEMCE3A(),
                            "EMCE3A_",
                            new float[] {-2.965625f, 0.1875f, 0}, new float[] {0, 180, 180},null,
                            "smoke", new ArrayList<double[]>() {
                            {
                                add(new double[]{0.48D, 1.42D, 0.0D}); add(new double[]{0.73D, 1.42D, 0.0D});
                                add(new double[]{1.08D, 1.42D, 0.0D}); add(new double[]{1.33D, 1.42D, 0.0D});
                                add(new double[]{3.3D, 1.42D, 0.0D}); add(new double[]{3.55D, 1.42D, 0.0D});
                                add(new double[]{3.9D, 1.42D, 0.0D}); add(new double[]{4.15D, 1.42D, 0.0D});
                            }

                        },
                        null, null, 5, 0)
                );
        Traincraft.traincraftRegistry
                .RegisterRollingStockModel(
                        new TrainRenderRecord(modID, EntityEMCE3B.class, new ModelEMCE3B(),
                            "EMCE3B_",
                            new float[] {-2.96875f, 0.1875f, 0}, new float[] {0, 0, 180},null,
                            "smoke", new ArrayList<double[]>() {
                            {
                                add(new double[]{1.53D, 1.42D, 0.0D}); add(new double[]{1.78D, 1.42D, 0.0D});
                                add(new double[]{2.16D, 1.42D, 0.0D}); add(new double[]{2.43D, 1.42D, 0.0D});
                                add(new double[]{4.35D, 1.42D, 0.0D}); add(new double[]{4.6D, 1.42D, 0.0D});
                                add(new double[]{4.95D, 1.42D, 0.0D}); add(new double[]{5.2D, 1.42D, 0.0D});
                            }

                        },
                        null, null, 5, 0)
                );
        Traincraft.traincraftRegistry
                .RegisterRollingStockModel(
                        new TrainRenderRecord(modID, EntityEMDF3A.class, new ModelEMDF3A(),
                                "EMDF3A_",
                                new float[] {-2.121875f, 0.1875f, 0}, new float[] {0, 180, 180},null,
                                "smoke", new ArrayList<double[]>() { { add(new double[]{1.77D, 1.42D, 0.0D}); add(new double[]{0.7D, 1.42D, 0.0D}); } },
                                null, null, 5, 0)
                );
        Traincraft.traincraftRegistry
                .RegisterRollingStockModel(
                        new TrainRenderRecord(modID, EntityEMDF3B.class, new ModelEMDF3B(),
                                "EMDF3B_",
                                new float[] {-2.15625f, 0.1875f, 0}, new float[] {0, 0, 180},null,
                                "smoke", new ArrayList<double[]>() { { add(new double[]{3.5D, 1.42D, 0.0D}); add(new double[]{2.45D, 1.42D, 0.0D}); } },
                                null, null, 5, 0)
                );
        Traincraft.traincraftRegistry
                .RegisterRollingStockModel(
                        new TrainRenderRecord(modID, EntityF40ph.class, new ModelF40ph(),
                                "F40ph_",
                                new float[] {-2.1484375f, 0.1875f, 0}, new float[] {0, 180, 180},null,
                                "smoke", new ArrayList<double[]>() { { add(new double[]{2.8D, 1.38D, 0.0D}); } },
                                null, null, 5, 0)
                );
        Traincraft.traincraftRegistry
                .RegisterRollingStockModel(
                    new TrainRenderRecord(modID, EntityGEU18B.class, new ModelGEU18B(),
                            "GEU18B_",
                            new float[] {-2.0390625f, 0.1875f, 0}, new float[] {0, 180, 180},null,
                            "smoke", new ArrayList<double[]>() { { add(new double[]{1.13D, 1.38D, 0.0D}); } },
                            null, null, 5, 0)
                );

    }
}
