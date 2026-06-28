package tcmodern.common.entities.tender;

import fexcraft.fvtm.BOBRollingStockModel;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.fluids.FluidRegistry;
import tcmodern.client.DetailRegistry;
import tcmodern.common.library.Info;
import train.client.render.register.TrainRenderRecord;
import train.common.Traincraft;
import train.common.api.LiquidManager;
import train.common.api.Tender;

public class EntityNWTender extends Tender {

    public EntityNWTender(World world) {
        super(world, FluidRegistry.WATER, 0, Traincraft.traincraftRegistry.getTrainRecord(EntityNWTender.class).getTankCapacity(), LiquidManager.WATER_FILTER);
        setupTextureDescription();
    }

    public void setupTextureDescription() {
        InsertTexture(0, "Norfolk & Western");
    }

    @Override
    public String getInventoryName() { return "Norfolk & Western Tender"; }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 3.25F; }

    @Override
    public void onRenderInsertRecord() {
        BOBRollingStockModel model = new BOBRollingStockModel(Info.modID, "models/tender/ModelNWTender.bob", new boolean[] {false, true, true});
        model.getDetailInformation(0)
                .addModel(DetailRegistry.modelNWTenderFrontBogie, null, null, null, (ResourceLocation) null)
                .addModel(DetailRegistry.modelNWTenderRearBogie, null, null, null, (ResourceLocation) null);

        Traincraft.traincraftRegistry.RegisterRollingStockModel(
                new TrainRenderRecord(Info.modID, EntityNWTender.class, model,
                "NWTender_", new float[] {0f, 0.1875f, 0}, new float[] {0, 180, 180},null)
                );
    }
}
