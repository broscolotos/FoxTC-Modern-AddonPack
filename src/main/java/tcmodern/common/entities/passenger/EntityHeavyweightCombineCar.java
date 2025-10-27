package tcmodern.common.entities.passenger;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.AbstractPassengerCombineCar;
import train.common.core.util.TraincraftUtil;

public class EntityHeavyweightCombineCar extends AbstractPassengerCombineCar {

    public EntityHeavyweightCombineCar(World world) { super(world); }

    public EntityHeavyweightCombineCar(World world, double d, double d1, double d2) { super(world, d, d1, d2); }

    @Override
    public void setupTextureDescription() {}


    @Override
    public String getInventoryName() { return "Heavyweight Combine Car"; }

    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 0, 0.17); }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 5.5625F; }
}
