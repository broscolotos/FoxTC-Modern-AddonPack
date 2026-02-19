package tcmodern.common.entities.passenger;

import com.jcirmodelsquad.tcjcir.models.detailkits.ModelRotaryPlowCoupler;
import fexcraft.fvtm.BOBRollingStockModel;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import tcmodern.client.DetailRegistry;
import tcmodern.common.library.Info;
import tmt.Vec3f;
import train.client.render.register.TrainRenderRecord;
import train.common.Traincraft;
import train.common.api.AbstractPassengerCar;
import train.common.core.util.TraincraftUtil;
import train.common.entity.CargoManager;
import train.common.entity.CargoSpecification;

public class EntityShinkansenPassengerPowerCar extends AbstractPassengerCar {

    public EntityShinkansenPassengerPowerCar(World world) {
        super(world);
        setupTextureDescription();
        //TODO: convert panto's to be done via cargo manager instead of skins.
    }

    public void setupTextureDescription() {
        InsertTexture(0, "500-0 Series Power (Default, Up)");
        InsertTexture(1, "500-0 Series Power (Default, Down)");
    }

    @Override
    public double getAdditionalYOffset() { return -0.15F; }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 5.1875F; }

    @Override
    public void onRenderInsertRecord() {
        BOBRollingStockModel model = new BOBRollingStockModel(Info.modID, "models/passenger/ModelShinkansen500-0_Passenger.bob", new boolean[] {false, true, true});
        model.getDetailInformation(TraincraftUtil.getByteFromColor("White"))
                .addModel(DetailRegistry.modelShinkansenPowerShroud, null, null, null, (ResourceLocation) null)
                .addModel(DetailRegistry.modelShinkansenPantoU, null, null, null, (ResourceLocation) null);
        model.getDetailInformation(TraincraftUtil.getByteFromColor("LightGray"))
                .addModel(DetailRegistry.modelShinkansenPowerShroud, null, null, null, (ResourceLocation) null)
                .addModel(DetailRegistry.modelShinkansenPantoD, null, null, null, (ResourceLocation) null);
        Traincraft.traincraftRegistry.RegisterRollingStockModel(new TrainRenderRecord(
                Info.modID, EntityShinkansenPassengerPowerCar.class, model, "Shinkansen500-0_Passenger_Power_",
                new float[] {-0.4328125f, 0.15625f, 0}, new float[] {0, 180, 180}, null
        ));
    }
}
