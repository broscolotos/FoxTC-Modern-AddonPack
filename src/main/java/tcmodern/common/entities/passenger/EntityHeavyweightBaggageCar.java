package tcmodern.common.entities.passenger;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.AbstractPassengerCombineCar;
import train.common.api.AbstractStandardFixedFreightCar;

public class EntityHeavyweightBaggageCar extends AbstractStandardFixedFreightCar {

    public EntityHeavyweightBaggageCar(World world) { super(world); }

    public EntityHeavyweightBaggageCar(World world, double d, double d1, double d2) {
        this(world);
        setPosition(d, d1 + yOffset, d2);
        motionX = 0.0D;
        motionY = 0.0D;
        motionZ = 0.0D;
        prevPosX = d;
        prevPosY = d1;
        prevPosZ = d2;
    }

    @Override
    public void setupTextureDescription() {}


    @Override
    public String getInventoryName() { return "Heavyweight Baggage Car"; }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 5.5625F; }
}
