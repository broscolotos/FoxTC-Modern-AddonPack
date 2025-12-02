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
import train.common.enums.LockoutGroup;
import train.common.library.EnumSounds;
import train.common.library.sounds.SoundRecord;

import java.util.ArrayList;

public class EntityGEU18B extends DieselTrain {

    public EntityGEU18B(World world) {
        super(world, Traincraft.traincraftRegistry.getTrainRecord(EntityGEU18B.class).getTankCapacity(), LiquidManager.dieselFilter());
        setupTextureDescription();
    }


    public void setupTextureDescription() {
        InsertTexture(0, "Seaboard Coast Line");
        InsertTexture(1, "Drexel Co", LockoutGroup.DRXL);
        InsertTexture(2, "Carbondale & Pine Valley", LockoutGroup.CPV);
    }

    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this,4.25, 0.4, -0.45); }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.7F; }

    @Override
    public String getInventoryName() { return "GE U18B"; }

    @Override
    public SoundRecord getSoundRecord() { return EnumSounds.DieselU18B; }

    @Override
    public void onRenderInsertRecord() {
        BOBRollingStockModel model = new BOBRollingStockModel(Info.modID, "models/diesel/ModelGEU18B.bob", new boolean[] {false, true, true});
        model.getDetailInformation(0).addModel(DetailRegistry.modelBlombergB, new Vec3f(-2.0234375, 0, 0), null, null, DetailRegistry.textureBlombergB_black)
            .addModel(DetailRegistry.modelBlombergB, new Vec3f(2.0390625, 0, 0), null, null, DetailRegistry.textureBlombergB_black);

        Traincraft.traincraftRegistry.RegisterRollingStockModel( new TrainRenderRecord(Info.modID, EntityGEU18B.class,
                        model,"GEU18B_", new float[] {-2.0234375f, 0.1875f, 0},
                        new float[] {0, 180, 180},null,"smoke",
                        new ArrayList<double[]>() { { add(new double[]{1.13D, 1.38D, 0.0D}); } },
                        null, null, 5, 0)
                );
    }
}
