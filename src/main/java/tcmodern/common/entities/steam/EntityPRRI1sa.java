package tcmodern.common.entities.steam;

import fexcraft.fvtm.BOBRollingStockModel;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import tcmodern.client.DetailRegistry;
import tcmodern.common.library.Info;
import tcmodern.common.library.TCModernSounds;
import tmt.Vec3f;
import train.client.render.register.TrainRenderRecord;
import train.common.Traincraft;
import train.common.api.LiquidManager;
import train.common.api.SteamTrain;
import train.common.core.util.TraincraftUtil;
import train.common.library.sounds.SoundRecord;

import java.util.ArrayList;

public class EntityPRRI1sa extends SteamTrain {

    public EntityPRRI1sa(World world) {
        super(world, Traincraft.traincraftRegistry.getTrainRecord(EntityPRRI1sa.class).getTankCapacity(), LiquidManager.WATER_FILTER);
        setupTextureDescription();
    }

    public void setupTextureDescription() {
        InsertTexture(0, "Black - 4245");
    }

    @Override
    public String getInventoryName() { return "PRR I1sa"; }

    @Override
    public SoundRecord getSoundRecord() { return TCModernSounds.PRRT1; }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 0.625F; }

    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, -0.25, 0.25, -0.375); }

    @Override
    public void onRenderInsertRecord() {
        BOBRollingStockModel model = new BOBRollingStockModel(Info.modID, "models/steam/ModelPRRI1sa.bob", new boolean[] {false, true, true});
        model.getDetailInformation(0)
            .addModel(DetailRegistry.modelI1saBogieFront, 7, new Vec3f(-2.0390625, 0, 0), null, null, (ResourceLocation)null);

        Traincraft.traincraftRegistry.RegisterRollingStockModel(new TrainRenderRecord(
                Info.modID, EntityPRRI1sa.class, model, "PRRI1sa_",
                new float[]{-2.75f, 0.1875f, 0}, new float[]{0, 180, 180}, null,
                "largesmoke", new ArrayList<double[]>() {
                    {
                        add(new double[]{5.75D, 1.7D, 0.0D});
                    }
                },
                "explode", new ArrayList<double[]>() {
                    {
                        add(new double[]{6D, -0.1875D, 0.6875D});
                        add(new double[]{3.25D, -0.1875D, 0.6875D});
                    }
                },
                10, 2));
    }

}
