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
import train.common.library.EnumTrains;
import train.common.library.GuiIDs;
import train.common.library.sounds.SoundRecord;

public class EntityL3aMohawk  extends SteamTrain {

    public EntityL3aMohawk(World world) {
        super(world, Traincraft.traincraftRegistry.getTrainRecord(EntityL3aMohawk.class).getTankCapacity(), LiquidManager.WATER_FILTER);
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

}
