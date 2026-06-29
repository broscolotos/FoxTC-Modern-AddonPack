package tcmodern.client;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fexcraft.fvtm.BEOModelLoader;
import net.minecraft.util.ResourceLocation;
import tcmodern.common.library.Info;
import tmt.FVTMFormatBase;
import tmt.ModelRendererTurbo;

@SideOnly(Side.CLIENT)
public class DetailRegistry {

    //Generic Freight Trucks
    public static final FVTMFormatBase modelGenericFreightBogie = BEOModelLoader.load(Info.modID + ":models/freight/bogies/ModelGenericFreightBogie.bob");
    public static final ResourceLocation textureGenericFreightBogieGray = new ResourceLocation(Info.modID, "textures/trains/bogies/generic/gray.png");
    public static final ResourceLocation textureGenericFreightBogieBlack = new ResourceLocation(Info.modID, "textures/trains/bogies/generic/black.png");

    //Blomberg B
    public static final FVTMFormatBase modelBlombergB = BEOModelLoader.load(Info.modID + ":models/diesel/bogies/ModelBlombergB.bob");
    public static final ResourceLocation textureBlombergB_black = new ResourceLocation(Info.modID, "textures/trains/bogies/BlombergB_bogie.png");

    //Blomberg 3a
    public static final FVTMFormatBase modelBlomberg3a = BEOModelLoader.load(Info.modID + ":models/diesel/bogies/Model3aBlomberg.bob");
    public static final ResourceLocation textureBlomberg3a_black = new ResourceLocation(Info.modID,"textures/trains/bogies/3a_blomberg_bogie.png");

    //40 ton hopper trucks
    public static final FVTMFormatBase modelBogie40Ton = BEOModelLoader.load(Info.modID + ":models/freight/bogies/Model40TonWoodenHopperBogie.bob");
    public static final FVTMFormatBase model40TonLoad = BEOModelLoader.load(Info.modID + ":models/freight/addons/Model40TonWoodenHopperLoad.bob");
    public static final ResourceLocation textureBogie40TonRed = new ResourceLocation(Info.modID, "textures/trains/bogies/40_ton_hopper_bogie.png");
    public static final ResourceLocation textureBogie40TonGray = new ResourceLocation(Info.modID, "textures/trains/bogies/40_ton_hopper_bogie_gray.png");

    //GE Hi-AD
    public static final FVTMFormatBase modelGEHiAD = BEOModelLoader.loadModel(Info.modID + ":models/diesel/bogies/ModelGEHi-AD.bob");
    public static final ResourceLocation textureGEHiADBlack = new ResourceLocation(Info.modID, "textures/trains/bogies/ge_hi-ad_black.png");

    //PT2 Bogie
    public static final FVTMFormatBase modelPT2TenderBogie = BEOModelLoader.loadModel(Info.modID + ":models/tender/bogies/ModelPT2TenderBogie.bob");

    //40ft3in Bogie
    public static final FVTMFormatBase modelNYC3AxleBogie = BEOModelLoader.loadModel(Info.modID + ":models/tender/bogies/ModelNYC3AxleTenderBogie.bob");
    public static ResourceLocation textureNYC3AxleBogie = new ResourceLocation(Info.modID, "textures/trains/bogies/nyc_3axle_tender_bogie.png");

    //AC4400CW air compressor
    public static final FVTMFormatBase modelAC4400CWCompressor = BEOModelLoader.loadModel(Info.modID + ":models/diesel/parts/ModelAC44CWCompressor.bob");
    public static final ResourceLocation textureAC4400CWCompressor = new ResourceLocation(Info.modID, "textures/trains/parts/ac44cw_compressor.png");

    //Shinkansen Passenger details
    public static final FVTMFormatBase modelShinkansenPowerShroud = BEOModelLoader.loadModel(Info.modID + ":models/passenger/addons/ModelShinkansen500-0_Passenger_Power.bob");
    public static final FVTMFormatBase modelShinkansenPantoU = BEOModelLoader.loadModel(Info.modID + ":models/passenger/addons/ModelShinkansen500-0_Passenger_PantoU.bob");
    public static final FVTMFormatBase modelShinkansenPantoD = BEOModelLoader.loadModel(Info.modID + ":models/passenger/addons/ModelShinkansen500-0_Passenger_PantoD.bob");

    //Heavyweight details
    public static final FVTMFormatBase modelPullmanPalaceBogie = BEOModelLoader.loadModel(Info.modID + ":models/passenger/bogies/ModelPullmanPalaceBogie.bob");
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
    public static final FVTMFormatBase modelEl24Bogie = BEOModelLoader.loadModel(Info.modID + ":models/electric/bogies/ModelNorthwesternEl24Bogie.bob");

    //PRR T1 details
    public static final FVTMFormatBase modelT1BogieFront = BEOModelLoader.loadModel(Info.modID + ":models/steam/bogies/ModelPRRT1FrontBogie.bob");
    public static final FVTMFormatBase modelT1BogieRear = BEOModelLoader.loadModel(Info.modID + ":models/steam/bogies/ModelPRRT1RearBogie.bob");

    //PRR I1sa details
    public static final FVTMFormatBase modelI1saBogieFront = BEOModelLoader.loadModel(Info.modID + ":models/steam/bogies/ModelPRRI1saFrontBogie.bob");

    //PRR Coast to Coast details
    public static final ResourceLocation coastToCoastBogieTexture = new ResourceLocation(Info.modID, "textures/trains/bogies/CoastToCoastTruck.png");
    public static final FVTMFormatBase modelCoastToCoastBogie = BEOModelLoader.loadModel(Info.modID + ":models/tender/bogies/ModelCoastToCoastTenderBogie.bob");

    //100 ton coal details
    public static final FVTMFormatBase model100TonLoad = BEOModelLoader.loadModel(Info.modID + ":models/freight/addons/Model100TonHopperCoal.bob");
    public static final FVTMFormatBase model100TonLoad2 = BEOModelLoader.loadModel(Info.modID + ":models/freight/addons/Model100TonHopperCoal2.bob");

    //C&O Tender details
    public static final FVTMFormatBase modelCnOTenderFrontBogie = BEOModelLoader.loadModel(Info.modID + ":models/tender/bogies/ModelCnOTenderFrontBogie.bob");
    public static final FVTMFormatBase modelCnOTenderRearBogie = BEOModelLoader.loadModel(Info.modID + ":models/tender/bogies/ModelCnOTenderRearBogie.bob");

    //Allegheny details
    public static final FVTMFormatBase modelAlleghenyFrontBogie = BEOModelLoader.loadModel(Info.modID + ":models/steam/bogies/ModelAlleghenyFrontBogie.bob");
    public static final FVTMFormatBase modelAlleghenyRearBogie = BEOModelLoader.loadModel(Info.modID + ":models/steam/bogies/ModelAlleghenyRearBogie.bob");

    //Mohawk details
    public static final FVTMFormatBase modelL3aFrontBogie = BEOModelLoader.loadModel(Info.modID + ":models/steam/bogies/ModelL3aFrontBogie.bob");
    public static final FVTMFormatBase modelL3aRearBogie = BEOModelLoader.loadModel(Info.modID + ":models/steam/bogies/ModelL3aRearBogie.bob");

    //U1f details
    public static final FVTMFormatBase modelCNU1fFrontBogie = BEOModelLoader.loadModel(Info.modID + ":models/steam/bogies/ModelCNU1fFrontBogie.bob");
    public static final FVTMFormatBase modelCNU1fRearBogie = BEOModelLoader.loadModel(Info.modID + ":models/steam/bogies/ModelCNU1fRearBogie.bob");
    public static final FVTMFormatBase modelCNU1fTenderBogie = BEOModelLoader.loadModel(Info.modID + ":models/tender/bogies/ModelCNU1fTenderBogie.bob");

    //NW Tender details
    public static final FVTMFormatBase modelNWTenderFrontBogie = BEOModelLoader.loadModel(Info.modID + ":models/tender/bogies/ModelNWTenderFrontBogie.bob");
    public static final FVTMFormatBase modelNWTenderRearBogie = BEOModelLoader.loadModel(Info.modID + ":models/tender/bogies/ModelNWTenderRearBogie.bob");

    //NW Y6b details
    public static final FVTMFormatBase modelNWY6bRearBogie = BEOModelLoader.loadModel(Info.modID + ":models/steam/bogies/ModelNWY6bRearBogie.bob");
    public static final FVTMFormatBase modelNWY6bFrontBogie = BEOModelLoader.loadModel(Info.modID + ":models/steam/bogies/ModelNWY6bFrontBogie.bob");

    //NW Class A details
    public static final FVTMFormatBase modelNWClassARearBogie = BEOModelLoader.loadModel(Info.modID + ":models/steam/bogies/ModelNWClassARearBogie.bob");
    public static final FVTMFormatBase modelNWClassAFrontBogie = BEOModelLoader.loadModel(Info.modID + ":models/steam/bogies/ModelNWClassAFrontBogie.bob");

    //Hoki 10000 details
    public static final FVTMFormatBase modelHoki10000Coal = BEOModelLoader.loadModel(Info.modID + ":models/freight/addons/ModelHoki10000Coal.bob");
    public static final FVTMFormatBase modelJNRFreightBogie = BEOModelLoader.loadModel(Info.modID + ":models/freight/bogies/ModelJNRFreightBogie.bob");
    public static final ResourceLocation textureJNRFreightBogie = new ResourceLocation(Info.modID, "textures/trains/bogies/JNRFreightBogieBlack.png");

    //GE U10B details
    public static final FVTMFormatBase modelGEU10BBogie = BEOModelLoader.loadModel(Info.modID + ":models/diesel/bogies/ModelU10BBogie.bob");
    public static final ResourceLocation textureGEU10BBogie = new ResourceLocation(Info.modID, "textures/trains/bogies/GEU10BBogie.png");

    //Superliner details
    public static final FVTMFormatBase modelSuperlinerBogie = BEOModelLoader.loadModel(Info.modID + ":models/passenger/bogies/ModelSuperlinerBogie.bob");
    public static final ResourceLocation textureSuperlinerBogie = new ResourceLocation(Info.modID, "textures/trains/bogies/superliner_bogie.png");

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

        for (FVTMFormatBase.TurboList l : modelCNU1fTenderBogie.groups) {
            ModelRendererTurbo[] arr = new ModelRendererTurbo[l.size()];
            l.toArray(arr);
            modelCNU1fTenderBogie.fixRotation(arr, false, true, true);

        }
    }
}
