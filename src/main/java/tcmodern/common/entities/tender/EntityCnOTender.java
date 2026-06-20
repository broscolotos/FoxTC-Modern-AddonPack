package tcmodern.common.entities.tender;

import fexcraft.fvtm.BOBRollingStockModel;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.fluids.FluidRegistry;
import tcmodern.client.DetailRegistry;
import tcmodern.common.library.Info;
import tmt.Vec3f;
import train.client.render.register.TrainRenderRecord;
import train.common.Traincraft;
import train.common.api.LiquidManager;
import train.common.api.Tender;

public class EntityCnOTender extends Tender {

    public EntityCnOTender(World world) {
        super(world, FluidRegistry.WATER, 0, Traincraft.traincraftRegistry.getTrainRecord(EntityCnOTender.class).getTankCapacity(), LiquidManager.WATER_FILTER);
        setupTextureDescription();
    }

    public void setupTextureDescription() {
        InsertTexture(0, "C&O 1601");
    }

    @Override
    public String getInventoryName() { return "Chesapeake & Ohio Tender"; }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 3.17F; }

    @Override
    public void onRenderInsertRecord() {
        BOBRollingStockModel model = new BOBRollingStockModel(Info.modID, "models/tender/ModelCnOTender.bob", new boolean[] {false, true, true});
        model.getDetailInformation(0)
                .addModel(DetailRegistry.modelCnOTenderFrontBogie, 7, null, null, null, (ResourceLocation)null)
                .addModel(DetailRegistry.modelCnOTenderRearBogie, 7, null, null, null, (ResourceLocation)null);

        Traincraft.traincraftRegistry.RegisterRollingStockModel(
                new TrainRenderRecord(Info.modID, EntityCnOTender.class, model,
                        "CnOTender_", new float[] {0, 0.1875f, 0}, new float[] {0, 0, 180}, null)
        );
    }

}
