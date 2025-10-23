package tcmodern.common.entities.passenger;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import train.common.api.EntityRollingStock;
import train.common.api.IPassenger;

public class EntityHeavyweightColonistCar extends EntityRollingStock implements IPassenger {

    public EntityHeavyweightColonistCar(World world) {
        super(world);
    }

    public EntityHeavyweightColonistCar(World world, double d, double d1, double d2) {
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
    public void updateRiderPosition() {
        if(riddenByEntity!=null) {
            riddenByEntity.setPosition(posX, posY + getMountedYOffset() + riddenByEntity.getYOffset() + 0.17, posZ);
        }
    }

    @Override
    public boolean interactFirst(EntityPlayer entityplayer) {
        playerEntity = entityplayer;
        if ((super.interactFirst(entityplayer))) {
            return false;
        }
        if (!worldObj.isRemote) {
            ItemStack itemstack = entityplayer.inventory.getCurrentItem();
            if(lockThisCart(itemstack, entityplayer))return true;
            if (riddenByEntity != null && (riddenByEntity instanceof EntityPlayer) && riddenByEntity != entityplayer) {
                return true;
            }
            if (!worldObj.isRemote) {
                entityplayer.mountEntity(this);
            }
        }
        return true;
    }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 5.5625F; }

    @Override
    public boolean canBeRidden() { return true; }
}
