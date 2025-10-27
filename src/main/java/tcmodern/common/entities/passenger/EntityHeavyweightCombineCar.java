package tcmodern.common.entities.passenger;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.AbstractPassengerCombineCar;

public class EntityHeavyweightCombineCar extends AbstractPassengerCombineCar {

    public EntityHeavyweightCombineCar(World world) { super(world); }

    public EntityHeavyweightCombineCar(World world, double d, double d1, double d2) {
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
    public String getInventoryName() { return "Heavyweight Combine Car"; }

    @Override
    public void updateRiderPosition() {
        if(riddenByEntity!=null) {
            riddenByEntity.setPosition(posX, posY + getMountedYOffset() + riddenByEntity.getYOffset() + 0.17, posZ);
        }
    }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 5.5625F; }
}
