package tcmodern.client;

import net.minecraft.util.ResourceLocation;
import tcmodern.client.render.locomotive.bogies.Model3aBlomberg;
import tcmodern.client.render.locomotive.bogies.ModelBlombergB;
import tcmodern.client.render.rollingstock.bogies.Model40TonWoodenHopperBogie;
import tcmodern.common.library.Info;
import tmt.FVTMFormatBase;

public class DetailRegistry {
    //Blomberg B
    public static final FVTMFormatBase blombergB = new ModelBlombergB();
    public static final ResourceLocation blombergB_black = new ResourceLocation(Info.modID, "textures/trains/bogies/BlombergB_bogie.png");

    //Blomberg 3a
    public static final FVTMFormatBase blomberg3a = new Model3aBlomberg();
    public static final ResourceLocation blomberg3a_black = new ResourceLocation(Info.modID,"textures/trains/bogies/3a_blomberg_bogie.png");

    //40 ton hopper trucks
    public static final Model40TonWoodenHopperBogie bogie40Ton = new Model40TonWoodenHopperBogie();
    public static final ResourceLocation bogie40TonRed = new ResourceLocation(Info.modID, "textures/trains/bogies/40_ton_hopper_bogie.png");
    public static final ResourceLocation bogie40TonGrey = new ResourceLocation(Info.modID, "textures/trains/bogies/40_ton_hopper_bogie_grey.png");
}
