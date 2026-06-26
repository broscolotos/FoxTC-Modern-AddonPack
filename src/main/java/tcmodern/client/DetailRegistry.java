package tcmodern.client;

import fexcraft.fvtm.BEOModelLoader;
import net.minecraft.util.ResourceLocation;
import tcmodern.client.render.locomotive.bogies.*;
import tcmodern.client.render.locomotive.parts.ModelAC44CWCompressor;
import tcmodern.client.render.rollingstock.bogies.*;
import tcmodern.common.library.Info;
import tmt.FVTMFormatBase;
import tmt.ModelRendererTurbo;

public class DetailRegistry {

    //Generic Freight Trucks
    public static final FVTMFormatBase modelGenericFreightBogie = new ModelGenericFreightBogie();
    public static final ResourceLocation textureGenericFreightBogieGray = new ResourceLocation(Info.modID, "textures/trains/bogies/generic/gray.png");
    public static final ResourceLocation textureGenericFreightBogieBlack = new ResourceLocation(Info.modID, "textures/trains/bogies/generic/black.png");

    //Blomberg B
    public static final FVTMFormatBase modelBlombergB = new ModelBlombergB();
    public static final ResourceLocation textureBlombergB_black = new ResourceLocation(Info.modID, "textures/trains/bogies/BlombergB_bogie.png");

    //Blomberg 3a
    public static final FVTMFormatBase modelBlomberg3a = new Model3aBlomberg();
    public static final ResourceLocation textureBlomberg3a_black = new ResourceLocation(Info.modID,"textures/trains/bogies/3a_blomberg_bogie.png");

    //40 ton hopper trucks
    public static final Model40TonWoodenHopperBogie modelBogie40Ton = new Model40TonWoodenHopperBogie();
    public static final ResourceLocation textureBogie40TonRed = new ResourceLocation(Info.modID, "textures/trains/bogies/40_ton_hopper_bogie.png");
    public static final ResourceLocation textureBogie40TonGrey = new ResourceLocation(Info.modID, "textures/trains/bogies/40_ton_hopper_bogie_grey.png");

    //GE Hi-AD
    public static final FVTMFormatBase modelGEHiAD = BEOModelLoader.loadModel(Info.modID + ":models/diesel/bogies/ModelGEHi-AD.bob");
    public static final ResourceLocation textureGEHiADBlack = new ResourceLocation(Info.modID, "textures/trains/bogies/ge_hi-ad_black.png");

    //PT2 Bogie
    public static final FVTMFormatBase modelPT2TenderBogie = BEOModelLoader.loadModel(Info.modID + ":models/tender/bogies/ModelPT2TenderBogie.bob");

    //40ft3in Bogie
    public static final FVTMFormatBase modelNYC3AxleBogie = BEOModelLoader.loadModel(Info.modID + ":models/tender/bogies/ModelNYC3AxleTenderBogie.bob");
    public static ResourceLocation textureNYC3AxleBogie = new ResourceLocation(Info.modID, "textures/trains/bogies/nyc_3axle_tender_bogie.png");

    //AC4400CW air compressor
    public static final FVTMFormatBase modelAC4400CWCompressor = new ModelAC44CWCompressor();
    public static final ResourceLocation textureAC4400CWCompressor = new ResourceLocation(Info.modID, "textures/trains/parts/ac44cw_compressor.png");

    //Shinkansen Passenger details
    public static final FVTMFormatBase modelShinkansenPowerShroud = BEOModelLoader.loadModel(Info.modID + ":models/passenger/addons/ModelShinkansen500-0_Passenger_Power.bob");
    public static final FVTMFormatBase modelShinkansenPantoU = BEOModelLoader.loadModel(Info.modID + ":models/passenger/addons/ModelShinkansen500-0_Passenger_PantoU.bob");
    public static final FVTMFormatBase modelShinkansenPantoD = BEOModelLoader.loadModel(Info.modID + ":models/passenger/addons/ModelShinkansen500-0_Passenger_PantoD.bob");

    //Heavyweight details
    public static final ModelPullmanPalaceBogie modelPullmanPalaceBogie = new ModelPullmanPalaceBogie();
    public static final ResourceLocation pullmanPalaceBogieBlack = new ResourceLocation(Info.modID, "textures/trains/bogies/pullman_palace_bogie.png");

    public static final FVTMFormatBase modelHeavyweightDinerInterior = BEOModelLoader.loadModel(Info.modID + ":models/passenger/CN diner/ModelCN73Diner_Interior.bob");
    public static final FVTMFormatBase modelHeavyweightDinerInteriorLP = BEOModelLoader.loadModel(Info.modID + ":models/passenger/CN diner/ModelCN73Diner_InteriorLP.bob");

    public static final FVTMFormatBase modelHeavyweightCombineInterior = BEOModelLoader.loadModel(Info.modID + ":models/passenger/CN combine/ModelCN73Combine_Interior.bob");
    public static final FVTMFormatBase modelHeavyweightCombineInteriorLP = BEOModelLoader.loadModel(Info.modID + ":models/passenger/CN combine/ModelCN73Combine_InteriorLP.bob");

    public static final FVTMFormatBase modelHeavyweightColonistInterior = BEOModelLoader.loadModel(Info.modID + ":models/passenger/CN colonist/ModelCN73Colonist_Interior.bob");
    public static final FVTMFormatBase modelHeavyweightColonistInteriorLP = BEOModelLoader.loadModel(Info.modID + ":models/passenger/CN colonist/ModelCN73Colonist_InteriorLP.bob");

    public static final FVTMFormatBase modelHeavyweightTailInterior = BEOModelLoader.loadModel(Info.modID + ":models/passenger/CN tail/ModelCN73Tail_Interior.bob");
    public static final FVTMFormatBase modelHeavyweightTailInteriorLP = BEOModelLoader.loadModel(Info.modID + ":models/passenger/CN tail/ModelCN73Tail_InteriorLP.bob");

    //Northwestern El24 details
    public static final ResourceLocation el24BogieTexture = new ResourceLocation(Info.modID, "textures/trains/bogies/NorthwesternEl24_bogie.png");
    public static final ModelNorthwesternEl24Bogie modelEl24Bogie = new ModelNorthwesternEl24Bogie();

    //PRR T1 details
    public static final ModelPRRT1FrontBogie modelT1BogieFront = new ModelPRRT1FrontBogie();
    public static final ModelPRRT1RearBogie modelT1BogieRear = new ModelPRRT1RearBogie();

    //PRR Coast to Coast details
    public static final ResourceLocation coastToCoastBogieTexture = new ResourceLocation(Info.modID, "textures/trains/bogies/CoastToCoastTruck.png");
    public static final ModelCoastToCoastTenderBogie modelCoastToCoastBogie = new ModelCoastToCoastTenderBogie();

    //100 ton coal details
    public static final FVTMFormatBase model100TonLoad = BEOModelLoader.loadModel(Info.modID + ":models/freight/addons/Model100TonHopperCoal.bob");
    public static final FVTMFormatBase model100TonLoad2 = BEOModelLoader.loadModel(Info.modID + ":models/freight/addons/Model100TonHopperCoal2.bob");

    //C&O Tender details
    public static final ModelCnOTenderFrontBogie modelCnOTenderFrontBogie = new ModelCnOTenderFrontBogie();
    public static final ModelCnOTenderRearBogie modelCnOTenderRearBogie = new ModelCnOTenderRearBogie();

    //Allegheny details
    public static final FVTMFormatBase modelAlleghenyFrontBogie = BEOModelLoader.loadModel(Info.modID + ":models/steam/bogies/ModelAlleghenyFrontBogie.bob");
    public static final FVTMFormatBase modelAlleghenyRearBogie = BEOModelLoader.loadModel(Info.modID + ":models/steam/bogies/ModelAlleghenyRearBogie.bob");

    //Mohawk details
    public static final FVTMFormatBase modelL3aFrontBogie = BEOModelLoader.loadModel(Info.modID + ":models/steam/bogies/ModelL3aFrontBogie.bob");
    public static final FVTMFormatBase modelL3aRearBogie = BEOModelLoader.loadModel(Info.modID + ":models/steam/bogies/ModelL3aRearBogie.bob");


    static {
        for (FVTMFormatBase.TurboList l : modelShinkansenPantoD.groups) {
            ModelRendererTurbo[] arr = new ModelRendererTurbo[l.size()];
            l.toArray(arr);
            modelShinkansenPantoD.fixRotation(arr, false, true, true);
        }

        for (FVTMFormatBase.TurboList l : modelShinkansenPantoU.groups) {
            ModelRendererTurbo[] arr = new ModelRendererTurbo[l.size()];
            l.toArray(arr);
            modelShinkansenPantoU.fixRotation(arr, false, true, true);
        }

        for (FVTMFormatBase.TurboList l : modelHeavyweightCombineInterior.groups) {
            ModelRendererTurbo[] arr = new ModelRendererTurbo[l.size()];
            l.toArray(arr);
            modelHeavyweightCombineInterior.fixRotation(arr, false, true, true);
        }

        for (FVTMFormatBase.TurboList l : modelHeavyweightCombineInteriorLP.groups) {
            ModelRendererTurbo[] arr = new ModelRendererTurbo[l.size()];
            l.toArray(arr);
            modelHeavyweightCombineInteriorLP.fixRotation(arr, false, true, true);
        }
        for (FVTMFormatBase.TurboList l : modelHeavyweightColonistInterior.groups) {
            ModelRendererTurbo[] arr = new ModelRendererTurbo[l.size()];
            l.toArray(arr);
            modelHeavyweightColonistInterior.fixRotation(arr, false, true, true);
        }

        for (FVTMFormatBase.TurboList l : modelHeavyweightColonistInteriorLP.groups) {
            ModelRendererTurbo[] arr = new ModelRendererTurbo[l.size()];
            l.toArray(arr);
            modelHeavyweightColonistInteriorLP.fixRotation(arr, false, true, true);
        }

        for (FVTMFormatBase.TurboList l : modelHeavyweightTailInterior.groups) {
            ModelRendererTurbo[] arr = new ModelRendererTurbo[l.size()];
            l.toArray(arr);
            modelHeavyweightTailInterior.fixRotation(arr, false, true, true);
        }

        for (FVTMFormatBase.TurboList l : modelHeavyweightTailInteriorLP.groups) {
            ModelRendererTurbo[] arr = new ModelRendererTurbo[l.size()];
            l.toArray(arr);
            modelHeavyweightTailInteriorLP.fixRotation(arr, false, true, true);
        }
    }
}
