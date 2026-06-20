package tcmodern.common.entities.electric;

import fexcraft.fvtm.BOBRollingStockModel;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import tcmodern.client.DetailRegistry;
import tcmodern.common.library.Info;
import tmt.Vec3f;
import train.client.render.register.TrainRenderRecord;
import train.common.Traincraft;
import train.common.api.ElectricTrain;
import train.common.core.util.TraincraftUtil;
import train.common.library.EnumSounds;
import train.common.library.sounds.SoundRecord;

public class EntityNorthwesternEl24 extends ElectricTrain {

    public EntityNorthwesternEl24(World world) {
        super(world);
        setupTextureDescription();
    }

    public void setupTextureDescription() {
        InsertTexture(0, "Northwestern Elevated Railroad - 24");
    }

    @Override
    public SoundRecord getSoundRecord() { return EnumSounds.locoElectricVL10; }

    @Override
    public String getInventoryName() { return "Northwestern El24"; }

    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 5.25, 0.15, 0.375); }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return (1.2F); }

    @Override
    public void onRenderInsertRecord() {
        BOBRollingStockModel model = new BOBRollingStockModel(Info.modID, "models/electric/ModelNorthwesternEl24.bob", new boolean[] {false, true, true});
        model.getDetailInformation(0)
                .addModel(DetailRegistry.modelEl24Bogie, 7, new Vec3f(2.65625f,0,0), null, null, DetailRegistry.el24BogieTexture)
                .addModel(DetailRegistry.modelEl24Bogie, 7, new Vec3f(-2.65625f,0,0), null, null, DetailRegistry.el24BogieTexture);

        Traincraft.traincraftRegistry.RegisterRollingStockModel(new TrainRenderRecord(
                Info.modID, EntityNorthwesternEl24.class, model,"NorthwesternEl24_",
                new float[] {-2.625f, 0.1875f, 0}, new float[] {0, 0, 180},null)
        );
    }
}
