package tcmodern.common.entities.steam;

import fexcraft.fvtm.BOBRollingStockModel;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import tcmodern.client.DetailRegistry;
import tcmodern.common.library.Info;
import tcmodern.common.library.TCModernSounds;
import train.client.render.register.TrainRenderRecord;
import train.common.Traincraft;
import train.common.api.LiquidManager;
import train.common.api.SteamTrain;
import train.common.core.util.TraincraftUtil;
import train.common.library.sounds.SoundRecord;

import java.util.ArrayList;

public class EntityPRRT1 extends SteamTrain {

    public EntityPRRT1(World world) {
        super(world, Traincraft.traincraftRegistry.getTrainRecord(EntityPRRT1.class).getTankCapacity(), LiquidManager.WATER_FILTER);
        setupTextureDescription();
    }

    public void setupTextureDescription() {
        InsertTexture(0, "Brunswick Green - 6110");
    }

    @Override
    public String getInventoryName() { return "PRR T1"; }

    @Override
    public SoundRecord getSoundRecord() { return TCModernSounds.PRRT1; }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.3125F; }

    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, -1.125, 0.375); }

    @Override
    public void onRenderInsertRecord() {
        BOBRollingStockModel model = new BOBRollingStockModel(Info.modID, "models/steam/ModelPRRT1.bob", new boolean[] {false, true, true});
        model.getDetailInformation(0)
                .addModel(DetailRegistry.modelT1BogieFront, 7, null, null, null, (ResourceLocation)null)
                .addModel(DetailRegistry.modelT1BogieRear, 7, null, null, null, (ResourceLocation)null);

        Traincraft.traincraftRegistry.RegisterRollingStockModel(new TrainRenderRecord(
                Info.modID, EntityPRRT1.class, model, "PRR_T1_",
                new float[]{-3.25f, 0.1875f, 0}, new float[]{0, 180, 180}, null,
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
