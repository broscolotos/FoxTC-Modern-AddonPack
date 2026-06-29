package tcmodern.common.entities.passenger;

import fexcraft.fvtm.BOBRollingStockModel;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import tcmodern.client.DetailRegistry;
import tcmodern.common.library.Info;
import tmt.Vec3f;
import train.client.render.register.TrainRenderRecord;
import train.common.Traincraft;
import train.common.api.AbstractPassengerCar;
import train.common.core.util.TraincraftUtil;

public class EntitySkytopSuperliner extends AbstractPassengerCar {

    public EntitySkytopSuperliner(World world) {
        super(world);
        setupTextureDescription();
    }

    public void setupTextureDescription() {
        InsertTexture(0, "Amtrak - Phase IV");
    }

    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 6.0625f, 0.4375f, -0.33f); }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.46875f; }

    @Override
    public void onRenderInsertRecord() {
        BOBRollingStockModel model = new BOBRollingStockModel(Info.modID, "models/passenger/ModelSkytopSuperliner.bob", new boolean[] {false, true, true});
        model.getDetailInformation(0)
                .addModel(DetailRegistry.modelSuperlinerBogie, 7, new Vec3f(4.228515625f,0,0), null, null, DetailRegistry.textureSuperlinerBogie)
                .addModel(DetailRegistry.modelSuperlinerBogie, 7, new Vec3f(-4.228515625f,0,0), null, null, DetailRegistry.textureSuperlinerBogie);

        Traincraft.traincraftRegistry.RegisterRollingStockModel(new TrainRenderRecord(
                Info.modID, EntitySkytopSuperliner.class, model, "Skytop_Superliner_",
                new float[] {-4.228515625f, 0.1875f, 0}, new float[] {0, 0, 180}, null)
        );

    }
}
