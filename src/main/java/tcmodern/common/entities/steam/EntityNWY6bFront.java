package tcmodern.common.entities.steam;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.Traincraft;
import train.common.api.LiquidManager;
import train.common.api.SteamTrain;
import train.common.core.util.TraincraftUtil;
import train.common.library.EnumSounds;
import train.common.library.sounds.SoundRecord;

public class EntityNWY6bFront extends SteamTrain {

    public EntityNWY6bFront(World world) {
        super(world, Traincraft.traincraftRegistry.getTrainRecord(EntityNWY6bFront.class).getTankCapacity(), LiquidManager.WATER_FILTER);
        setupTextureDescription();
    }

    public void setupTextureDescription() {
        InsertTexture(0, "Norfolk & Western - 2171");
    }

    @Override
    public String getInventoryName() { return "N&W Y6b Front"; }

    @Override
    public SoundRecord getSoundRecord() { return EnumSounds.locoSteamC41; }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.0625F; }

    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 3, 0.625); }

}
