package tcmodern.common.entities.steam;

import fexcraft.fvtm.BOBRollingStockModel;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import tcmodern.client.DetailRegistry;
import tcmodern.common.library.Info;
import tcmodern.common.library.TCMLockoutGroups;
import tcmodern.common.library.TCModernSounds;
import tmt.Vec3f;
import train.client.render.register.TrainRenderRecord;
import train.common.Traincraft;
import train.common.api.LiquidManager;
import train.common.api.SteamTrain;
import train.common.api.locomotive.AbstractLiquidFiredSteamEngine;
import train.common.core.util.TraincraftUtil;
import train.common.library.sounds.SoundRecord;

import java.util.ArrayList;

public class EntityCNU1f extends AbstractLiquidFiredSteamEngine {

    public EntityCNU1f(World world) {
        super(world, LiquidManager.WATER_FILTER);
        setupTextureDescription();
    }


    public void setupTextureDescription() {
        InsertTexture(0, "Canadian National");
    }

    @Override
    public String getInventoryName() { return "CN U-1-f"; }

    @Override
    public SoundRecord getSoundRecord() { return TCModernSounds.L3AMohawk; }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1F; }

    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, -0.5, 0.1875, -0.5); }


    @Override
    public void onRenderInsertRecord() {
        BOBRollingStockModel model = new BOBRollingStockModel(Info.modID, "models/steam/ModelCNU1f.bob", new boolean[] {false, true, true});
        model.getDetailInformation(0)
                .addModel(DetailRegistry.modelCNU1fFrontBogie, 0, null, null, null, (ResourceLocation)null)
                .addModel(DetailRegistry.modelCNU1fRearBogie, 0, null, null, null, (ResourceLocation)null);


        Traincraft.traincraftRegistry.RegisterRollingStockModel(new TrainRenderRecord(
            Info.modID, EntityCNU1f.class, model,"CNU1f_",
            new float[] {-2.5f, 0.1875f, 0}, new float[] {0, 180, 180},null,
            "largesmoke", new ArrayList<double[]>() {
                    {
                        add(new double[] { 4.875D, 1.3875D, 0.0D });
                    }
                },
            "explode", new ArrayList<double[]>() {
                    {
                        add(new double[] { 4.5, -0.1875D, 0.6875D });
                    }
                },
            10, 2)
        );
    }

    /**/
}
