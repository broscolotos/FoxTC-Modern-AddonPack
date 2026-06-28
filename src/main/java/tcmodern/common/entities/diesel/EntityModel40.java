package tcmodern.common.entities.diesel;

import fexcraft.fvtm.BOBRollingStockModel;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import tcmodern.client.DetailRegistry;
import tcmodern.common.library.Info;
import tmt.Vec3f;
import train.client.render.register.TrainRenderRecord;
import train.common.Traincraft;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.core.util.TraincraftUtil;
import train.common.library.EnumSounds;
import train.common.library.sounds.SoundRecord;

import java.util.ArrayList;

public class EntityModel40 extends DieselTrain {

    public EntityModel40(World world) {
        super(world, Traincraft.traincraftRegistry.getTrainRecord(EntityModel40.class).getTankCapacity(), LiquidManager.dieselFilter());
        setupTextureDescription();
    }


    public void setupTextureDescription() {
        InsertTexture(0, "West Pennsylvania Power - 10");
    }

    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this,0.75, 0.125, -0.25); }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 0.625F; }

    @Override
    public String getInventoryName() { return "EMD Model 40"; }

    @Override
    public SoundRecord getSoundRecord() { return EnumSounds.Diesel44Ton; }

    @Override
    public void onRenderInsertRecord() {
        BOBRollingStockModel model = new BOBRollingStockModel(Info.modID, "models/diesel/ModelEMDModel40.bob", new boolean[] {false, true, true});

        Traincraft.traincraftRegistry.RegisterRollingStockModel(new TrainRenderRecord(
            Info.modID, EntityModel40.class, model,"Model40_",
            new float[]{-0.81215f, 0.1875f, 0}, new float[]{0, 180, 180}, null,
            "smoke", new ArrayList<double[]>() {
                {
                    add(new double[]{0.23D, 1.3D, 0.06D});
                    add(new double[]{1.35D, 1.3D, -0.06D});
                }
            },
            null, null, 5, 0)
        );
    }

}
