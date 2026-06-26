package tcmodern.common.entities.passenger;

import com.jcirmodelsquad.tcjcir.models.loads.*;
import fexcraft.fvtm.BOBRollingStockModel;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import tcmodern.client.DetailRegistry;
import tcmodern.common.library.Info;
import train.client.render.register.TrainRenderRecord;
import train.common.Traincraft;
import train.common.api.AbstractPassengerCar;
import train.common.core.util.TraincraftUtil;
import train.common.entity.CargoManager;
import train.common.entity.CargoSpecification;
import train.common.entity.cargoManagerProvider.CargoModelInstanceProvider;

public class EntityShinkansenPassengerPowerCar extends AbstractPassengerCar {

    public EntityShinkansenPassengerPowerCar(World world) {
        super(world);
        setupTextureDescription();
        setCargoManager(
                new CargoManager(new CargoSpecification[][] {
                        {
                                new CargoSpecification(
                                        new CargoModelInstanceProvider(DetailRegistry.modelShinkansenPantoU),
                                        Info.modID,
                                        "trains/Shinkansen500-0_Passenger_Power_/Shinkansen500-0_Passenger_Power_White",
                                        "Pantograph Up",
                                        new CargoSpecification.RenderParameters().setOffset(0, 3, 0)
                                ) },
                        {
                            new CargoSpecification(
                                        new CargoModelInstanceProvider(DetailRegistry.modelShinkansenPantoD),
                                        Info.modID,
                                        "trains/Shinkansen500-0_Passenger_Power_/Shinkansen500-0_Passenger_Power_White",
                                        "Pantograph Down",
                                        new CargoSpecification.RenderParameters().setOffset(0, 3, 0)
                                )
                        },
                }).setDefaultOverride(1)
        );
    }

    public void setupTextureDescription() {
        InsertTexture(0, "500-0 Series Power Car");
    }


    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 4.4375, -0.25, -0.375); }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.53125F; }

    @Override
    public void onRenderInsertRecord() {
        BOBRollingStockModel model = new BOBRollingStockModel(Info.modID, "models/passenger/ModelShinkansen500-0_Passenger.bob", new boolean[] {false, true, true});
        model.getDetailInformation(0).addModel(DetailRegistry.modelShinkansenPowerShroud, null, null, null, (ResourceLocation)null);
        Traincraft.traincraftRegistry.RegisterRollingStockModel(new TrainRenderRecord(
                Info.modID, EntityShinkansenPassengerPowerCar.class, model, "Shinkansen500-0_Passenger_Power_",
                new float[] {-3.25f, 0.15625f, 0}, new float[] {0, 0, 180}, null
        ));
    }
}
