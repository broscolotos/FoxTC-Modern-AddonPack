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

public class EntityAlleghenyFront extends SteamTrain {

    public EntityAlleghenyFront(World world) {
        super(world, Traincraft.traincraftRegistry.getTrainRecord(EntityAlleghenyFront.class).getTankCapacity(), LiquidManager.WATER_FILTER);
        setupTextureDescription();
    }

    public void setupTextureDescription() {
        InsertTexture(0, "C&O 1601");
    }

    @Override
    public String getInventoryName() { return "C&O Allegheny Front"; }

    @Override
    public SoundRecord getSoundRecord() { return EnumSounds.locoSteamC41; }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 0.875F; }

    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 3.25, 0.5); }

    @Override
    public void onRenderInsertRecord() {
        BOBRollingStockModel model = new BOBRollingStockModel(Info.modID, "models/steam/ModelAlleghenyFront.bob", new boolean[] {false, true, true});
        model.getDetailInformation(0)
                .addModel(DetailRegistry.modelAlleghenyFrontBogie, 0, null, null, null, (ResourceLocation)null);


        Traincraft.traincraftRegistry.RegisterRollingStockModel(new TrainRenderRecord(
                Info.modID, EntityAlleghenyFront.class, model,"Allegheny_",
                new float[] {1f, 0.1875f, 0}, new float[] {0, 0, 180},null,
                null, null,
                "explode", new ArrayList<double[]>() {
                    {
                        add(new double[] { 2.0625D, -0.1875D, 0.6875D });
                    }
                }, 0, 2));
    }
}
