package tcmodern.common.entities.diesel;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.Traincraft;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.core.util.TraincraftUtil;
import train.common.library.EnumSounds;
import train.common.library.sounds.SoundRecord;

public class EntityAC44CW extends DieselTrain {

    public EntityAC44CW(World world) {
        super(world, Traincraft.traincraftRegistry.getTrainRecord(EntityAC44CW.class).getTankCapacity(), LiquidManager.dieselFilter());

    }

    public EntityAC44CW(World world, double d, double d1, double d2){
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
    public void updateRiderPosition() { TraincraftUtil.updateRider(this,6.75, 0.4, -0.45); }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.74F; }

    @Override
    public String getInventoryName() { return "AC44CW"; }



    @Override
    public SoundRecord getSoundRecord() { return EnumSounds.DieselAC4400CW; }
}
