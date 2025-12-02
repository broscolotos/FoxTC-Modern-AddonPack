package tcmodern.common.entities.diesel;

import fexcraft.fvtm.BOBRollingStockModel;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import tcmodern.client.DetailRegistry;
import tcmodern.common.library.Info;
import tcmodern.common.library.TCModernSounds;
import tmt.Vec3f;
import train.client.render.register.TrainRenderRecord;
import train.common.Traincraft;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.core.util.TraincraftUtil;
import train.common.library.sounds.SoundRecord;

import java.util.ArrayList;

public class EntityAC44CW extends DieselTrain {

    public EntityAC44CW(World world) {
        super(world, Traincraft.traincraftRegistry.getTrainRecord(EntityAC44CW.class).getTankCapacity(), LiquidManager.dieselFilter());
        setupTextureDescription();
    }


    public void setupTextureDescription() {
        InsertTexture(0, "Kansas City Southern");
        InsertTexture(1, "Florida East Coast - Grupo Mexico");
        InsertTexture(2, "Central Maine & Quebec");
        InsertTexture(3, "Southern Pacific");
        InsertTexture(4, "CSX (YN3)");
        InsertTexture(5, "CSX (YN2)");
        InsertTexture(6, "Ferromex");
    }

    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this,6.75, 0.4, -0.45); }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.74F; }

    @Override
    public String getInventoryName() { return "AC44CW"; }

    @Override
    public SoundRecord getSoundRecord() { return TCModernSounds.AC4400CW; }

    @Override
    public void onRenderInsertRecord() {
        BOBRollingStockModel model = new BOBRollingStockModel(Info.modID, "models/diesel/ModelAC4400CW.bob", new boolean[] {false, true, true});
        model.getDetailInformation(0)
            .addModel(DetailRegistry.modelGEHiAD, new Vec3f(-3.3125f,0,0), null, null, DetailRegistry.textureGEHiADBlack)
            .addModel(DetailRegistry.modelGEHiAD, new Vec3f(3.3125f, 0, 0), new Vec3f(0, 180, 0), null, DetailRegistry.textureGEHiADBlack)
            .addModel(DetailRegistry.modelAC4400CWCompressor, new Vec3f(-0.41015625f, -0.044921875f, -0.18164062f), null, new Vec3f(0.7f, 0.7f, 0.7f), DetailRegistry.textureAC4400CWCompressor);

        Traincraft.traincraftRegistry.RegisterRollingStockModel(new TrainRenderRecord(Info.modID, EntityAC44CW.class,
            model,"AC44CW_", new float[] {-3.3125f, 0.1875f, 0}, new float[] {0, 0, 180},
            null, "smoke", new ArrayList<double[]>() { { add(new double[]{1.59375D, 1.4D, 0.0D}); } },
            null, null, 5, 0)
        );
    }
}
