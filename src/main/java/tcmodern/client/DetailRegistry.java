package tcmodern.client;

import net.minecraft.util.ResourceLocation;
import tcmodern.client.render.locomotive.bogies.ModelBlombergB;
import tcmodern.common.library.Info;
import tmt.FVTMFormatBase;

public class DetailRegistry {
    //Blomberg B
    public static final FVTMFormatBase blombergB = new ModelBlombergB();
    public static final ResourceLocation blombergB_black = new ResourceLocation(Info.modID, "textures/trains/bogies/BlombergB_bogie.png");
}
