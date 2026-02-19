package tcmodern.client;

import fexcraft.fvtm.BEOModelLoader;
import net.minecraft.util.ResourceLocation;
import tcmodern.client.render.locomotive.bogies.Model3aBlomberg;
import tcmodern.client.render.locomotive.bogies.ModelBlombergB;
import tcmodern.client.render.locomotive.parts.ModelAC44CWCompressor;
import tcmodern.client.render.rollingstock.bogies.Model40TonWoodenHopperBogie;
import tcmodern.common.library.Info;
import tmt.FVTMFormatBase;
import tmt.ModelRendererTurbo;

public class DetailRegistry {
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

    //AC4400CW air compressor
    public static final FVTMFormatBase modelAC4400CWCompressor = new ModelAC44CWCompressor();
    public static final ResourceLocation textureAC4400CWCompressor = new ResourceLocation(Info.modID, "textures/trains/parts/ac44cw_compressor.png");

    //Shinkansen Passenger details
    public static final FVTMFormatBase modelShinkansenPowerShroud = BEOModelLoader.loadModel(Info.modID + ":models/passenger/addons/ModelShinkansen500-0_Passenger_Power.bob");
    public static final FVTMFormatBase modelShinkansenPantoU = BEOModelLoader.loadModel(Info.modID + ":models/passenger/addons/ModelShinkansen500-0_Passenger_PantoU.bob");
    public static final FVTMFormatBase modelShinkansenPantoD = BEOModelLoader.loadModel(Info.modID + ":models/passenger/addons/ModelShinkansen500-0_Passenger_PantoD.bob");
    static {
        for (FVTMFormatBase.TurboList l : modelShinkansenPantoD.groups) {
            ModelRendererTurbo[] arr = new ModelRendererTurbo[l.size()];
            l.toArray(arr);
            modelShinkansenPantoD.fixRotation(arr, false, true, true);
        }

        for (FVTMFormatBase.TurboList l : modelShinkansenPantoU.groups) {
            ModelRendererTurbo[] arr = new ModelRendererTurbo[l.size()];
            l.toArray(arr);
            modelShinkansenPantoD.fixRotation(arr, false, true, true);
        }
    }
}
