package tcmodern.common.entities.steam;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.Traincraft;
import train.common.api.LiquidManager;
import train.common.api.SteamTrain;
import train.common.core.util.TraincraftUtil;
import train.common.library.EnumSounds;
import train.common.library.sounds.SoundRecord;

public class EntityAllegheny extends SteamTrain {

    public EntityAllegheny(World world) {
        super(world, Traincraft.traincraftRegistry.getTrainRecord(EntityAllegheny.class).getTankCapacity(), LiquidManager.WATER_FILTER);
        setupTextureDescription();
    }

    public void setupTextureDescription() {
        InsertTexture(0, "C&O 1601");
    }

    @Override
    public String getInventoryName() { return "C&O Allegheny"; }

    @Override
    public SoundRecord getSoundRecord() { return EnumSounds.locoSteamC41; }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.15F; }

    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 5, 0.625, 0.5); }

}
