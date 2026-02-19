package tcmodern.common.entities.passenger;

import fexcraft.fvtm.BOBRollingStockModel;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import tcmodern.client.DetailRegistry;
import tcmodern.common.entities.diesel.EntityF40ph;
import tcmodern.common.library.Info;
import tcmodern.common.library.TCMLockoutGroups;
import tmt.Vec3f;
import train.client.render.register.TrainRenderRecord;
import train.common.Traincraft;
import train.common.api.AbstractPassengerCar;
import train.common.entity.CargoManager;
import train.common.entity.CargoSpecification;

import java.util.ArrayList;

public class EntityShinkansenPassengerCar extends AbstractPassengerCar {

    public EntityShinkansenPassengerCar(World world) {
        super(world);
        setupTextureDescription();
    }

    public void setupTextureDescription() {
        InsertTexture(0, "500-0 Series Passenger (Default)");
    }

    @Override
    public double getAdditionalYOffset() { return -0.15F; }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 5.1875F; }

    @Override
    public void onRenderInsertRecord() {
        BOBRollingStockModel model = new BOBRollingStockModel(Info.modID, "models/passenger/ModelShinkansen500-0_Passenger.bob", new boolean[] {false, true, true});
        Traincraft.traincraftRegistry.RegisterRollingStockModel(new TrainRenderRecord(
                Info.modID, EntityShinkansenPassengerCar.class, model, "Shinkansen500-0_Passenger_",
                new float[] {-0.4328125f, 0.15625f, 0}, new float[] {0, 180, 180}, null
        ));
    }
}
