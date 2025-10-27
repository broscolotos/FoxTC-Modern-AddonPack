package tcmodern.common.entities.passenger;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.AbstractStandardFixedFreightCar;

public class EntityHeavyweightBaggageCar extends AbstractStandardFixedFreightCar {

    public EntityHeavyweightBaggageCar(World world) { super(world); }

    public EntityHeavyweightBaggageCar(World world, double d, double d1, double d2) { super(world, d, d1, d2); }

    @Override
    public void setupTextureDescription() {}


    @Override
    public String getInventoryName() { return "Heavyweight Baggage Car"; }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 5.5625F; }
}
