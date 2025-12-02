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

public class EntityEMCE3B extends DieselTrain {

    public EntityEMCE3B(World world) {
        super(world, Traincraft.traincraftRegistry.getTrainRecord(EntityEMCE3B.class).getTankCapacity(), LiquidManager.dieselFilter());
        setupTextureDescription();
    }


    public void setupTextureDescription() {
        InsertTexture(0, "Seaboard Air Line");
    }

    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this,0, 0.3); }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.75F; }

    @Override
    public String getInventoryName() { return "EMC E3B"; }

    @Override
    public SoundRecord getSoundRecord() { return EnumSounds.DieselEMDE7B; }

    @Override
    public void onRenderInsertRecord() {
        BOBRollingStockModel model = new BOBRollingStockModel(Info.modID, "models/diesel/ModelEMCE3B.bob", new boolean[] {false, true, true});
        model.getDetailInformation(0).addModel(DetailRegistry.modelBlombergB, new Vec3f(-2.96875,0,0), null, null, DetailRegistry.textureBlombergB_black)
            .addModel(DetailRegistry.modelBlombergB, new Vec3f(2.96875, 0, 0), null, null, DetailRegistry.textureBlombergB_black);

        Traincraft.traincraftRegistry.RegisterRollingStockModel(new TrainRenderRecord(Info.modID, EntityEMCE3B.class,
            model,"EMCE3B_", new float[] {-2.96875f, 0.1875f, 0}, new float[] {0, 0, 180},null,
            "smoke", new ArrayList<double[]>() { {
            add(new double[]{1.53D, 1.42D, 0.0D}); add(new double[]{1.78D, 1.42D, 0.0D});
            add(new double[]{2.16D, 1.42D, 0.0D}); add(new double[]{2.43D, 1.42D, 0.0D});
            add(new double[]{4.35D, 1.42D, 0.0D}); add(new double[]{4.6D, 1.42D, 0.0D});
            add(new double[]{4.95D, 1.42D, 0.0D}); add(new double[]{5.2D, 1.42D, 0.0D});
            } },
            null, null, 5, 0)
        );
    }
}
