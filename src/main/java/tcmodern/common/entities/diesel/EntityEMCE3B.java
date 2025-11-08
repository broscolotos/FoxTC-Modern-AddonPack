package tcmodern.common.entities.diesel;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.Traincraft;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.core.util.TraincraftUtil;
import train.common.library.EnumSounds;
import train.common.library.sounds.SoundRecord;

public class EntityEMCE3B extends DieselTrain {

    public EntityEMCE3B(World world) {
        super(world, Traincraft.traincraftRegistry.getTrainRecord(EntityEMCE3B.class).getTankCapacity(), LiquidManager.dieselFilter());
        setupTextureDescription();
    }


    public void setupTextureDescription() {
        InsertTexture(0, "Seaboard Air Line");
    }

    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this,0, 0.3); }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.75F; }

    @Override
    public String getInventoryName() { return "EMC E3B"; }

    @Override
    public SoundRecord getSoundRecord() { return EnumSounds.DieselEMDE7B; }
}
