package tcmodern.common.entities.steam;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import tcmodern.common.library.TCModernSounds;
import train.common.Traincraft;
import train.common.api.LiquidManager;
import train.common.api.SteamTrain;
import train.common.core.util.TraincraftUtil;
import train.common.library.sounds.SoundRecord;

public class EntityPRRT1 extends SteamTrain {

    public EntityPRRT1(World world) {
        super(world, Traincraft.traincraftRegistry.getTrainRecord(EntityPRRT1.class).getTankCapacity(), LiquidManager.WATER_FILTER);
        setupTextureDescription();
    }

    public void setupTextureDescription() {
        InsertTexture(0, "Brunswick Green - 6110");
    }

    @Override
    public String getInventoryName() { return "PRR T1"; }

    @Override
    public SoundRecord getSoundRecord() { return TCModernSounds.PRRT1; }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.3125F; }

    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, -1.125, 0.375); }

}
