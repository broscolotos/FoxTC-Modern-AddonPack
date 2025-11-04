package tcmodern.common.entities.steam;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.Traincraft;
import train.common.api.LiquidManager;
import train.common.api.SteamTrain;
import train.common.core.util.TraincraftUtil;
import train.common.library.EnumSounds;
import train.common.library.sounds.SoundRecord;

public class EntityAlleghenyFront extends SteamTrain {

    public EntityAlleghenyFront(World world) {
        super(world, Traincraft.traincraftRegistry.getTrainRecord(EntityAlleghenyFront.class).getTankCapacity(), LiquidManager.WATER_FILTER);
    }

    @Override
    public String getInventoryName() { return "C&O Allegheny Front"; }

    @Override
    public SoundRecord getSoundRecord() { return EnumSounds.locoSteamC41; }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 0.875F; }

    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, -1.125, 0.375); }

}
