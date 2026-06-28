package tcmodern.common.entities.steam;

import fexcraft.fvtm.BOBRollingStockModel;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import tcmodern.client.DetailRegistry;
import tcmodern.common.library.Info;
import train.client.render.register.TrainRenderRecord;
import train.common.Traincraft;
import train.common.api.LiquidManager;
import train.common.api.SteamTrain;
import train.common.core.util.TraincraftUtil;
import train.common.library.EnumSounds;
import train.common.library.sounds.SoundRecord;

import java.util.ArrayList;

public class EntityNWClassAMain extends SteamTrain {

    public EntityNWClassAMain(World world) {
        super(world, Traincraft.traincraftRegistry.getTrainRecord(EntityNWClassAMain.class).getTankCapacity(), LiquidManager.WATER_FILTER);
        setupTextureDescription();
    }

    public void setupTextureDescription() {
        InsertTexture(0, "Norfolk & Western - 1238");
    }

    @Override
    public String getInventoryName() { return "N&W Class A"; }

    @Override
    public SoundRecord getSoundRecord() { return EnumSounds.locoSteamBerk1225; }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.15F; }

    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 4.25, 0.625, 0.5); }

    @Override
    public void onRenderInsertRecord() {
        BOBRollingStockModel model = new BOBRollingStockModel(Info.modID, "models/steam/ModelNWClassAMain.bob", new boolean[] {false, true, true});
        model.getDetailInformation(0).addModel(DetailRegistry.modelNWClassARearBogie, null, null, null, (ResourceLocation)null);

        Traincraft.traincraftRegistry.RegisterRollingStockModel(new TrainRenderRecord(
            Info.modID, EntityNWClassAMain.class, model, "NWClassA_",
            new float[] {1f, 0.1875f, 0}, new float[] {0, 0, 180},null,
            "largesmoke", new ArrayList<double[]>()
            {
                {
                    add(new double[] { -3.6D, 1.875D, 0.0D }); }
                }, "explode", new ArrayList<double[]>()
            {
                {
                    add(new double[] { -0.625D, -0.1875D, 0.625D });
                }
            },10, 2)
        );
    }
}
