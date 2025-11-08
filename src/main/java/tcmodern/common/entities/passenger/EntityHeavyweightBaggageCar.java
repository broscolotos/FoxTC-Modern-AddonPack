package tcmodern.common.entities.passenger;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import tcmodern.common.library.TCMLockoutGroups;
import train.common.api.AbstractStandardFixedFreightCar;

public class EntityHeavyweightBaggageCar extends AbstractStandardFixedFreightCar {

    public EntityHeavyweightBaggageCar(World world) {
        super(world);
        setupTextureDescription();
    }

    @Override
    public void setupTextureDescription() {
        InsertTexture(0, "Spawnline Express - BM&S", TCMLockoutGroups.SpawnlineExpress);
    }


    @Override
    public String getInventoryName() { return "Heavyweight Baggage Car"; }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 5.5625F; }
}
