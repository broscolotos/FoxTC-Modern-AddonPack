package tcmodern.common.entities.passenger;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import tcmodern.common.library.TCMLockoutGroups;
import train.common.api.AbstractWorkCart;
import train.common.core.util.TraincraftUtil;

public class EntityHeavyweightDinerCar extends AbstractWorkCart {

    public EntityHeavyweightDinerCar(World world) {
        super(world);
        setupTextureDescription();
    }

    public void setupTextureDescription() {
        InsertTexture(0, "Pullman");
        InsertTexture(1, "Spawnline Express - CWL", TCMLockoutGroups.SpawnlineExpress);
        InsertTexture(2, "Spawnline Express - MRKDM", TCMLockoutGroups.SpawnlineExpress);
    }

    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 0, 0.17); }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 5.5F; }
}
