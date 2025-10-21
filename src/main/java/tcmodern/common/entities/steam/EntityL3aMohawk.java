package tcmodern.common.entities.steam;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import train.common.Traincraft;
import train.common.api.LiquidManager;
import train.common.api.SteamTrain;
import train.common.core.util.TraincraftUtil;
import train.common.library.EnumSounds;
import train.common.library.GuiIDs;
import train.common.library.sounds.SoundRecord;

public class EntityL3aMohawk  extends SteamTrain {

    public EntityL3aMohawk(World world) {
        super(world, Traincraft.traincraftRegistry.getTrainRecord(EntityL3aMohawk.class).getTankCapacity(), LiquidManager.WATER_FILTER);
        fuelTrain = 0;
        locoInvent = new ItemStack[inventorySize];
    }

    public EntityL3aMohawk(World world, double d, double d1, double d2) {
        this(world);
        setPosition(d, d1 + (double) yOffset, d2);
        motionX = 0.0D;
        motionY = 0.0D;
        motionZ = 0.0D;
        prevPosX = d;
        prevPosY = d1;
        prevPosZ = d2;
    }

    /** Stuff you have to change **/
    //inventory name
    @Override
    public String getInventoryName() { return "L3a Mohawk"; }

    //sound it should use
    @Override
    public SoundRecord getSoundRecord() { return EnumSounds.locoSteamC41; }

    //coupling distance
    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.15F; }

    @Override
    public void updateRiderPosition() {
        TraincraftUtil.updateRider(this, -1.125, 0.375);
    }

    /** stuff you probably don't need to change **/

    @Override
    public void pressKey(int i) {
        if (i == 7 && riddenByEntity != null && riddenByEntity instanceof EntityPlayer) {
            ((EntityPlayer) riddenByEntity).openGui(Traincraft.instance, GuiIDs.LOCO, worldObj, (int) this.posX, (int) this.posY, (int) this.posZ);
        }
    }

    @Override
    public boolean interactFirst(EntityPlayer entityplayer) {
        playerEntity = entityplayer;
        if ((super.interactFirst(entityplayer))) {
            return false;
        }
        if (!worldObj.isRemote) {
            if (riddenByEntity != null && (riddenByEntity instanceof EntityPlayer) && riddenByEntity != entityplayer) {
                return true;
            }
            entityplayer.mountEntity(this);
        }
        return true;
    }

    @Override
    public void onUpdate() {
        super.onUpdate();
        if (worldObj.isRemote) {
            return;
        }
        checkInvent(locoInvent[0], locoInvent[1], this);
    }

    @Override
    public boolean canBeAdjusted(EntityMinecart cart) { return canBeAdjusted; }

    @Override
    public boolean isItemValidForSlot(int i, ItemStack itemstack) { return true; }
}
