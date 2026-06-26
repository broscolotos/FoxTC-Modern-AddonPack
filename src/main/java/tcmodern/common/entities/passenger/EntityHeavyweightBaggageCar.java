package tcmodern.common.entities.passenger;

import fexcraft.fvtm.BOBRollingStockModel;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import tcmodern.client.DetailRegistry;
import tcmodern.common.library.Info;
import tcmodern.common.library.TCMLockoutGroups;
import tmt.Vec3f;
import train.client.render.register.TrainRenderRecord;
import train.common.Traincraft;
import train.common.api.AbstractStandardFixedFreightCar;

public class EntityHeavyweightBaggageCar extends AbstractStandardFixedFreightCar {

    public EntityHeavyweightBaggageCar(World world) {
        super(world);
        setupTextureDescription();
    }

    @Override
    public void setupTextureDescription() {
        InsertTexture(0, "Pullman");
        InsertTexture(1, "Spawnline Express - BM&S", TCMLockoutGroups.SPAWNLINEEXPRESS);
    }


    @Override
    public String getInventoryName() { return "Heavyweight Baggage Car"; }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.625F; }

    @Override
    public void onRenderInsertRecord() {
        BOBRollingStockModel model = new BOBRollingStockModel(Info.modID, "models/passenger/CN baggage/ModelCN73Baggage.bob", new boolean[] {false, true, true});
        model.getDetailInformation(0)
                .addModel(DetailRegistry.modelPullmanPalaceBogie, 7, new Vec3f(3.875f,0.02734375f,0), null, null, DetailRegistry.pullmanPalaceBogieBlack)
                .addModel(DetailRegistry.modelPullmanPalaceBogie, 7, new Vec3f(-3.875f,0.02734375f,0), null, null, DetailRegistry.pullmanPalaceBogieBlack);

        Traincraft.traincraftRegistry.RegisterRollingStockModel(new TrainRenderRecord(
                Info.modID, EntityHeavyweightBaggageCar.class, model, "Heavyweight_Baggage_",
                new float[] {-3.875f, 0.21484375f, 0}, new float[] {0, 0, 180}, null)
        );
    }

}
