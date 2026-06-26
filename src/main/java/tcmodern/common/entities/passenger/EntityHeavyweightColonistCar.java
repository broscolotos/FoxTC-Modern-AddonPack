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
import train.common.api.AbstractPassengerCar;
import train.common.core.util.TraincraftUtil;

public class EntityHeavyweightColonistCar extends AbstractPassengerCar {

    public EntityHeavyweightColonistCar(World world) {
        super(world);
        setupTextureDescription();
    }

    public void setupTextureDescription() {
        InsertTexture(0, "Pullman");
        InsertTexture(1, "Spawnline Express - IRC", TCMLockoutGroups.SPAWNLINEEXPRESS);
        InsertTexture(2, "Spawnline Express - W&R", TCMLockoutGroups.SPAWNLINEEXPRESS);
        InsertTexture(3, "Spawnline Express - CCC&STL", TCMLockoutGroups.SPAWNLINEEXPRESS);
        InsertTexture(4, "Spawnline Express - CW", TCMLockoutGroups.SPAWNLINEEXPRESS);
    }

    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 4, -0., -0.375); }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.625F; }

    @Override
    public void onRenderInsertRecord() {
        BOBRollingStockModel model = new BOBRollingStockModel(Info.modID, "models/passenger/CN colonist/ModelCN73Colonist_Body.bob", new boolean[] {false, true, true});
        model.getDetailInformation(0)
                .addModel(DetailRegistry.modelPullmanPalaceBogie, 7, new Vec3f(3.875f,0.02734375f,0), null, null, DetailRegistry.pullmanPalaceBogieBlack)
                .addModel(DetailRegistry.modelPullmanPalaceBogie, 7, new Vec3f(-3.875f,0.02734375f,0), null, null, DetailRegistry.pullmanPalaceBogieBlack)
                .addModel(DetailRegistry.modelHeavyweightColonistInterior, 1, null, null, null, (ResourceLocation)null)
                .addModel(DetailRegistry.modelHeavyweightColonistInteriorLP, 7, null, null, null, (ResourceLocation)null);

        Traincraft.traincraftRegistry.RegisterRollingStockModel(new TrainRenderRecord(
                Info.modID, EntityHeavyweightColonistCar.class, model, "Heavyweight_Colonist_",
                new float[] {-3.875f, 0.21484375f, 0}, new float[] {0, 0, 180}, null)
        );

    }
}
