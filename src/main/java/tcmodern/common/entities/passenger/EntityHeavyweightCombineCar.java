package tcmodern.common.entities.passenger;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import tcmodern.common.library.TCMLockoutGroups;
import train.common.api.AbstractPassengerCombineCar;
import train.common.core.util.TraincraftUtil;

public class EntityHeavyweightCombineCar extends AbstractPassengerCombineCar {

    public EntityHeavyweightCombineCar(World world) { super(world); }

    @Override
    public void setupTextureDescription() {
        InsertTexture(0, "Pullman");
        InsertTexture(1, "Spawnline Express - ASR", TCMLockoutGroups.SpawnlineExpress);
    }

    @Override
    public String getInventoryName() { return "Heavyweight Combine Car"; }

    @Override
    public double getAdditionalYOffset() { return 0.17F; }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 5.5625F; }
}
