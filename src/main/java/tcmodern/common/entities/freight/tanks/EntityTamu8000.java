package tcmodern.common.entities.freight.tanks;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.Traincraft;
import train.common.api.AbstractStandardTankerCar;

public class EntityTamu8000 extends AbstractStandardTankerCar {


    public EntityTamu8000(World world) {
        super(world, Traincraft.traincraftRegistry.getTrainRecord(EntityTamu8000.class).getTankCapacity());
    }

    @Override
    public void setupTextureDescription() {
        InsertTexture(0, "White");
    }

    @Override
    public String getInventoryName() { return "Tamu 8000"; }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.95F; }
}
