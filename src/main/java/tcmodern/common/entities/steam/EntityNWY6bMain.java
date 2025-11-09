package tcmodern.common.entities.steam;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.Traincraft;
import train.common.api.LiquidManager;
import train.common.api.SteamTrain;
import train.common.core.util.TraincraftUtil;
import train.common.library.EnumSounds;
import train.common.library.sounds.SoundRecord;

public class EntityNWY6bMain extends SteamTrain {

    public EntityNWY6bMain(World world) {
        super(world, Traincraft.traincraftRegistry.getTrainRecord(EntityNWY6bMain.class).getTankCapacity(), LiquidManager.WATER_FILTER);
        setupTextureDescription();
    }

    public void setupTextureDescription() {
        InsertTexture(0, "Norfolk & Western - 2171");
    }

    @Override
    public String getInventoryName() { return "N&W Y6b"; }

    @Override
    public SoundRecord getSoundRecord() { return EnumSounds.locoSteamBerk1225; }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 0.75F; }

    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 3.5, 0.625, 0.5); }

}
