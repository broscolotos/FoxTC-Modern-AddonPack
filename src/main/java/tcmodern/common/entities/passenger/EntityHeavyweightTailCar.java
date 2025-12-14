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
        InsertTexture(0, "Pullman");
        InsertTexture(1, "Spawnline Express - DXL", TCMLockoutGroups.SpawnlineExpress);
    }

    @Override
    public double getAdditionalYOffset() { return 0.17F; }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 5.5F; }

}
