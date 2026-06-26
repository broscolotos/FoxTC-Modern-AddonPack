package tcmodern.common.entities.tender;

import fexcraft.fvtm.BOBRollingStockModel;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import net.minecraftforge.fluids.FluidRegistry;
import tcmodern.client.DetailRegistry;
import tcmodern.common.library.Info;
import tmt.Vec3f;
import train.client.render.register.TrainRenderRecord;
import train.common.Traincraft;
import train.common.api.LiquidManager;
import train.common.api.Tender;

public class EntityNYC46ft4inTender extends Tender {

    public EntityNYC46ft4inTender(World world) {
        super(world, FluidRegistry.WATER, 0, Traincraft.traincraftRegistry.getTrainRecord(EntityNYC46ft4inTender.class).getTankCapacity(), LiquidManager.WATER_FILTER);
        setupTextureDescription();
    }

    public void setupTextureDescription() {

    }

    @Override
    public String getInventoryName() { return "New York Central Tender"; }

    @Override
    public float getOptimalDistance(EntityMinecart cart) {
        return 3.2F;
    }

    @Override
    public void onRenderInsertRecord() {
        BOBRollingStockModel model = new BOBRollingStockModel(Info.modID, "models/tender/ModelNYC46ft4inTender.bob", new boolean[] {false, true, true});

        model.getDetailInformation(0)
                .addModel(DetailRegistry.modelNYC3AxleBogie, 7, new Vec3f(-1.875f,0,0), null, null, DetailRegistry.textureNYC3AxleBogie)
                .addModel(DetailRegistry.modelNYC3AxleBogie, 7, new Vec3f(1.75f,0,0), null, null, DetailRegistry.textureNYC3AxleBogie);

        Traincraft.traincraftRegistry.RegisterRollingStockModel(
                new TrainRenderRecord(Info.modID, EntityNYC46ft4inTender.class, model,
                        "NYC46ft4inTender_", new float[] {0, 0.1875f, 0}, new float[] {0, 0, 180}, null)
        );
    }
}
