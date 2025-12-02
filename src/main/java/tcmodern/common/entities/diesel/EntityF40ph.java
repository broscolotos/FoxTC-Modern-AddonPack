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

public class EntityF40ph extends DieselTrain {

    public EntityF40ph(World world) {
        super(world, Traincraft.traincraftRegistry.getTrainRecord(EntityF40ph.class).getTankCapacity(), LiquidManager.dieselFilter());
        setupTextureDescription();
    }


    public void setupTextureDescription() {
        InsertTexture(0, "Amtrak Phase IV");
        InsertTexture(1, "Amtrak Phase III");
    }

    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this,4.7, 0.3, -0.45); }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.5F; }

    @Override
    public String getInventoryName() { return "Entity F40ph"; }

    @Override
    public SoundRecord getSoundRecord() { return EnumSounds.DieselF40PH; }

    @Override
    public void onRenderInsertRecord() {
        BOBRollingStockModel model = new BOBRollingStockModel(Info.modID, "models/diesel/ModelEMDF40ph.bob", new boolean[] {false, true, true});
        model.getDetailInformation(0).addModel(DetailRegistry.modelBlombergB, new Vec3f(-2.1640625, 0, 0), null, null, DetailRegistry.textureBlombergB_black)
            .addModel(DetailRegistry.modelBlombergB, new Vec3f(2.1484375, 0, 0), null, null, DetailRegistry.textureBlombergB_black);

        Traincraft.traincraftRegistry.RegisterRollingStockModel(new TrainRenderRecord(Info.modID, EntityF40ph.class, model, "F40ph_",
            new float[] {-2.1484375f, 0.1875f, 0}, new float[] {0, 180, 180},null,
            "smoke", new ArrayList<double[]>() { { add(new double[]{2.8D, 1.38D, 0.0D}); } },
            null, null, 5, 0)
        );
    }
}
