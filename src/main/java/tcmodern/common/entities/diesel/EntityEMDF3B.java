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

public class EntityEMDF3B extends DieselTrain {

    public EntityEMDF3B(World world) {
        super(world, Traincraft.traincraftRegistry.getTrainRecord(EntityEMDF3B.class).getTankCapacity(), LiquidManager.dieselFilter());
        setupTextureDescription();
    }


    public void setupTextureDescription() {
        InsertTexture(0, "Seaboard Air Line Railroad");
        InsertTexture(1, "New York Central 2406");
        InsertTexture(2, "CNJ Scheme 4C");
        InsertTexture(3, "CNJ Scheme 4D");
        InsertTexture(4, "CNJ Scheme 3B");
    }

    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this,0, 0.33); }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.5F; }

    @Override
    public String getInventoryName() { return "EMD F3B"; }

    @Override
    public SoundRecord getSoundRecord() { return EnumSounds.DieselF3B; }

    @Override
    public void onRenderInsertRecord() {
        BOBRollingStockModel model = new BOBRollingStockModel(Info.modID, "models/diesel/ModelEMDF3B.bob", new boolean[] {false, true, true});
        model.getDetailInformation(0).addModel(DetailRegistry.modelBlombergB, new Vec3f(-2.15625,0,0), null, null, DetailRegistry.textureBlombergB_black)
            .addModel(DetailRegistry.modelBlombergB, new Vec3f(2.15625, 0, 0), null, null, DetailRegistry.textureBlombergB_black);

        Traincraft.traincraftRegistry.RegisterRollingStockModel(new TrainRenderRecord(Info.modID, EntityEMDF3B.class,
            model,"EMDF3B_", new float[] {-2.15625f, 0.1875f, 0}, new float[] {0, 0, 180},null,
            "smoke", new ArrayList<double[]>() { { add(new double[]{3.5D, 1.42D, 0.0D}); add(new double[]{2.45D, 1.42D, 0.0D}); } },
            null, null, 5, 0)
        );
    }

}
