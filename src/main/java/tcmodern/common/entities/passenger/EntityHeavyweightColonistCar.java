package tcmodern.common.entities.passenger;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import tcmodern.common.library.TCMLockoutGroups;
import train.common.api.AbstractPassengerCar;
import train.common.core.util.TraincraftUtil;

public class EntityHeavyweightColonistCar extends AbstractPassengerCar {

    public EntityHeavyweightColonistCar(World world) {
        super(world);
        setupTextureDescription();
    }

    public void setupTextureDescription() {
        InsertTexture(0, "Pullman");
        InsertTexture(1, "Spawnline Express - IRC", TCMLockoutGroups.SpawnlineExpress);
        InsertTexture(2, "Spawnline Express - W&R", TCMLockoutGroups.SpawnlineExpress);
        InsertTexture(3, "Spawnline Express - CCC&STL", TCMLockoutGroups.SpawnlineExpress);
        InsertTexture(4, "Spawnline Express - CW", TCMLockoutGroups.SpawnlineExpress);
    }

    @Override
    public double getAdditionalYOffset() { return 0.17F; }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 5.5625F; }

}
