package tcmodern.common.entities.steam;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.Traincraft;
import train.common.api.LiquidManager;
import train.common.api.SteamTrain;
import train.common.core.util.TraincraftUtil;
import train.common.library.EnumSounds;
import train.common.library.sounds.SoundRecord;

public class EntityNWClassAMain extends SteamTrain {

    public EntityNWClassAMain(World world) {
        super(world, Traincraft.traincraftRegistry.getTrainRecord(EntityNWClassAMain.class).getTankCapacity(), LiquidManager.WATER_FILTER);
        setupTextureDescription();
    }

    public void setupTextureDescription() {
        InsertTexture(0, "Norfolk & Western - 1238");
    }

    @Override
    public String getInventoryName() { return "N&W Class A"; }

    @Override
    public SoundRecord getSoundRecord() { return EnumSounds.locoSteamBerk1225; }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.15F; }

    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 4.25, 0.625, 0.5); }

}
