package tcmodern.common.entities.passenger;

import fexcraft.fvtm.BOBRollingStockModel;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import tcmodern.client.DetailRegistry;
import tcmodern.common.library.Info;
import tcmodern.common.library.TCMLockoutGroups;
import tmt.Vec3f;
import train.client.render.register.TrainRenderRecord;
import train.common.Traincraft;
import train.common.api.AbstractWorkCart;

public class EntityHeavyweightDinerCar extends AbstractWorkCart {

    public EntityHeavyweightDinerCar(World world) {
        super(world);
        setupTextureDescription();
    }

    public void setupTextureDescription() {
        InsertTexture(0, "Pullman");
        InsertTexture(1, "Spawnline Express - CWL", TCMLockoutGroups.SPAWNLINEEXPRESS);
        InsertTexture(2, "Spawnline Express - MRKDM", TCMLockoutGroups.SPAWNLINEEXPRESS);
    }

    @Override
    public double getAdditionalYOffset() { return 0.17F; }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 5.5F; }

    @Override
    public void onRenderInsertRecord() {
        BOBRollingStockModel model = new BOBRollingStockModel(Info.modID, "models/passenger/ModelCN73Diner_Body.bob", new boolean[] {false, true, true});
        model.getDetailInformation(0)
                .addModel(DetailRegistry.modelPullmanPalaceBogie, 7, new Vec3f(3.875f,0,0), null, null, DetailRegistry.pullmanPalaceBogieBlack)
                .addModel(DetailRegistry.modelPullmanPalaceBogie, 7, new Vec3f(-3.875f,0,0), null, null, DetailRegistry.pullmanPalaceBogieBlack)
                .addModel(DetailRegistry.modelHeavyweightDinerInterior, 1, null, null, null, (ResourceLocation)null)
                .addModel(DetailRegistry.modelHeavyweightDinerInteriorLP, 7, null, null, null, (ResourceLocation)null);

        Traincraft.traincraftRegistry.RegisterRollingStockModel(new TrainRenderRecord(
                Info.modID, EntityHeavyweightDinerCar.class, model, "Heavyweight_Diner_",
                new float[] {0, 0.1875f, 0}, new float[] {0, 0, 180}, null)
        );
    }
}
