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
import train.common.overlaytexture.EnumOverlayFonts;
import train.common.overlaytexture.OTSpecificationDynamic;

import java.awt.*;
import java.util.ArrayList;

public class EntityGEU10B extends DieselTrain {

    public EntityGEU10B(World world) {
        super(world, Traincraft.traincraftRegistry.getTrainRecord(EntityGEU10B.class).getTankCapacity(), LiquidManager.dieselFilter());
        setupTextureDescription();
    }


    public void setupTextureDescription() {
        InsertTexture(0, "South African Railways");
    }

    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this,3.25, 0.25, -0.45); }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.3F; }

    @Override
    public String getInventoryName() { return "GE U10B"; }

    @Override
    public SoundRecord getSoundRecord() { return EnumSounds.DieselU18B; }

    @Override
    public void onRenderInsertRecord() {
        BOBRollingStockModel model = new BOBRollingStockModel(Info.modID, "models/diesel/ModelGEU10B.bob", new boolean[] {false, true, true});
        model.getDetailInformation(0)
            .addModel(DetailRegistry.modelGEU10BBogie, new Vec3f(-1.4328125, 0, 0), null, null, DetailRegistry.textureGEU10BBogie)
            .addModel(DetailRegistry.modelGEU10BBogie, new Vec3f(1.4796875, 0, 0), null, null, DetailRegistry.textureGEU10BBogie);

        Traincraft.traincraftRegistry.RegisterRollingStockModel( new TrainRenderRecord(Info.modID, EntityGEU10B.class,
                        model,"GEU10B_", new float[] {-1.4796875f, 0.1875f, 0},
                        new float[] {0, 180, 180},null,"smoke",
                        new ArrayList<double[]>() { { add(new double[]{1.13D, 1.38D, 0.0D}); } },
                        null, null, 5, 0)
                );
    }
}
