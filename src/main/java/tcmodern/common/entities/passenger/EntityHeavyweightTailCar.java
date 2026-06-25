package tcmodern.common.entities.passenger;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import tcmodern.common.library.TCMLockoutGroups;
import train.common.api.AbstractPassengerCar;

public class EntityHeavyweightTailCar extends AbstractPassengerCar {

    public EntityHeavyweightTailCar(World world) {
        super(world);
        setupTextureDescription();
    }

    public void setupTextureDescription() {
        InsertTexture(0, "Pullman");
        InsertTexture(1, "Spawnline Express - DXL", TCMLockoutGroups.SPAWNLINEEXPRESS);
    }

    @Override
    public double getAdditionalYOffset() { return 0.17F; }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 5.5F; }

}
