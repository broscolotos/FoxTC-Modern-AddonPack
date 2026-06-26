package tcmodern.common.entities.tender;

import fexcraft.fvtm.BOBRollingStockModel;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.fluids.FluidRegistry;
import tcmodern.client.DetailRegistry;
import tcmodern.common.library.Info;
import tcmodern.common.library.TCMLockoutGroups;
import tmt.Vec3f;
import train.client.render.register.TrainRenderRecord;
import train.common.Traincraft;
import train.common.api.LiquidManager;
import train.common.api.Tender;

public class EntityNYCPT2Tender extends Tender {

    public EntityNYCPT2Tender(World world) {
        super(world, FluidRegistry.WATER, 0, Traincraft.traincraftRegistry.getTrainRecord(EntityNYCPT2Tender.class).getTankCapacity(), LiquidManager.WATER_FILTER);
        setupTextureDescription();
    }

    public void setupTextureDescription() {
        InsertTexture(1, "Spawnline Express", TCMLockoutGroups.SPAWNLINEEXPRESS);
    }

    @Override
    public String getInventoryName() { return "New York Central Tender"; }

    @Override
    public float getOptimalDistance(EntityMinecart cart) {
        return 3.5F;
    }

    @Override
    public void onRenderInsertRecord() {
        BOBRollingStockModel model = new BOBRollingStockModel(Info.modID, "models/tender/ModelPT2Tender.bob", new boolean[] {false, true, true});

        model.getDetailInformation(0)
                .addModel(DetailRegistry.modelPT2TenderBogie, 7, new Vec3f(2.09375f,0,0), null, null, (ResourceLocation)null);

        Traincraft.traincraftRegistry.RegisterRollingStockModel(
                new TrainRenderRecord(Info.modID, EntityNYCPT2Tender.class, model,
                        "NYCPT2Tender_", new float[] {0, 0.1875f, 0}, new float[] {0, 0, 180}, null)
        );
    }
}
