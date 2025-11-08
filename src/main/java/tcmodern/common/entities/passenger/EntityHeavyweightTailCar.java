package tcmodern.common.entities.passenger;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import tcmodern.common.library.TCMLockoutGroups;
import train.common.api.AbstractPassengerCar;
import train.common.api.EntityRollingStock;
import train.common.api.IPassenger;
import train.common.core.util.TraincraftUtil;

public class EntityHeavyweightTailCar extends AbstractPassengerCar {

    public EntityHeavyweightTailCar(World world) {
        super(world);
        setupTextureDescription();
    }

    public void setupTextureDescription() {
        InsertTexture(0, "Spawnline Express - DXL", TCMLockoutGroups.SpawnlineExpress);
    }

    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 0, 0.17); }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 5.5F; }

}
