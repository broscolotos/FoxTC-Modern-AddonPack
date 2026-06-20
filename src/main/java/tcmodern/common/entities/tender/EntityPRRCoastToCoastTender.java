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


public class EntityPRRCoastToCoastTender extends Tender {

    public EntityPRRCoastToCoastTender(World world) {
        super(world, FluidRegistry.WATER, 0, Traincraft.traincraftRegistry.getTrainRecord(EntityPRRCoastToCoastTender.class).getTankCapacity(), LiquidManager.WATER_FILTER);
        setupTextureDescription();
    }

    public void setupTextureDescription() {
        InsertTexture(0, "Brunswick Green - Large keystone");
    }

    @Override
    public String getInventoryName() { return "PRR Coast To Coast Tender"; }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 3.875F; }

    @Override
    public void onRenderInsertRecord() {
        BOBRollingStockModel model = new BOBRollingStockModel(Info.modID, "models/tender/ModelPRRCoastToCoastTender.bob", new boolean[] {false, true, true});
        model.getDetailInformation(0)
                .addModel(DetailRegistry.modelCoastToCoastBogie, 7, new Vec3f(2, 0, 0), null, null, DetailRegistry.coastToCoastBogieTexture)
                .addModel(DetailRegistry.modelCoastToCoastBogie, 7, new Vec3f(-2, 0, 0), null, null, DetailRegistry.coastToCoastBogieTexture);

        Traincraft.traincraftRegistry.RegisterRollingStockModel(
            new TrainRenderRecord(Info.modID, EntityPRRCoastToCoastTender.class, model,
                    "PRRCoastToCoast_", new float[] {0, 0.1875f, 0}, new float[] {0, 180, 180}, null)
            );
    }
}
