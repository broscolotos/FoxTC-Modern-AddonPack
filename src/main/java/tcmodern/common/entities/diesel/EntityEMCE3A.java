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


public class EntityEMCE3A extends DieselTrain {

    public EntityEMCE3A(World world) {
        super(world, Traincraft.traincraftRegistry.getTrainRecord(EntityEMCE3A.class).getTankCapacity(), LiquidManager.dieselFilter());
        setupTextureDescription();
    }


    public void setupTextureDescription() {
        InsertTexture(0, "Seaboard Air Line - 3030");
    }

    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this,6.45, 0.3, -0.45); }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.95F; }

    @Override
    public String getInventoryName() { return "EMC E3A"; }

    @Override
    public SoundRecord getSoundRecord() { return EnumSounds.DieselEMDE7A; }

    @Override
    public void onRenderInsertRecord() {
        BOBRollingStockModel model = new BOBRollingStockModel(Info.modID, "models/diesel/ModelEMCE3A.bob", new boolean[] {false, true, true});
        model.getDetailInformation(0).addModel(DetailRegistry.modelBlomberg3a, new Vec3f(-2.965625, 0, 0), null, null, DetailRegistry.textureBlomberg3a_black)
            .addModel(DetailRegistry.modelBlomberg3a, new Vec3f(3.096875, 0, 0), null, null, DetailRegistry.textureBlomberg3a_black);

        Traincraft.traincraftRegistry.RegisterRollingStockModel(new TrainRenderRecord(Info.modID, EntityEMCE3A.class, model,
            "EMCE3A_", new float[] {-2.965625f, 0.1875f, 0}, new float[] {0, 180, 180},null,
            "smoke", new ArrayList<double[]>() { {
                add(new double[]{0.48D, 1.42D, 0.0D}); add(new double[]{0.73D, 1.42D, 0.0D});
                add(new double[]{1.08D, 1.42D, 0.0D}); add(new double[]{1.33D, 1.42D, 0.0D});
                add(new double[]{3.3D, 1.42D, 0.0D}); add(new double[]{3.55D, 1.42D, 0.0D});
                add(new double[]{3.9D, 1.42D, 0.0D}); add(new double[]{4.15D, 1.42D, 0.0D});
            } },
            null, null, 5, 0)
        );
    }
}
