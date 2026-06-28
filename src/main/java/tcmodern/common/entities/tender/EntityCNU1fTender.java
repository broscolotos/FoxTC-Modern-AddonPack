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
import train.common.enums.LockoutGroup;

public class EntityCNU1fTender extends Tender {

    public EntityCNU1fTender(World world) {
        super(world,  LiquidManager.WATER_FILTER);

        InsertTexture(0, "Canadian National");
    }


    @Override
    public String getInventoryName() { return "Canadian National Tender"; }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 2.1875F; }

    @Override
    public void onRenderInsertRecord() {
        BOBRollingStockModel model = new BOBRollingStockModel(Info.modID, "models/tender/ModelCNU1fTender.bob", new boolean[] {false, true, true});

        model.getDetailInformation(0)
                .addModel(DetailRegistry.modelCNU1fTenderBogie, 7, new Vec3f(-0.84375f,0,0), null, null, (ResourceLocation) null)
                .addModel(DetailRegistry.modelCNU1fTenderBogie, 7, new Vec3f(1.3046875f,0,0), null, null, (ResourceLocation) null);

        Traincraft.traincraftRegistry.RegisterRollingStockModel(
                new TrainRenderRecord(Info.modID, EntityCNU1fTender.class, model,
                "CNU1fTender_", new float[] {0.125f, 0.1875f, 0}, new float[] {0, 0, 180}, null)
        );
    }
}
