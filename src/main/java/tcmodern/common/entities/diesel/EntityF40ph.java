package tcmodern.common.entities.diesel;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.Traincraft;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.core.util.TraincraftUtil;
import train.common.library.EnumSounds;
import train.common.library.sounds.SoundRecord;

public class EntityF40ph extends DieselTrain {

    public EntityF40ph(World world) {
        super(world, Traincraft.traincraftRegistry.getTrainRecord(EntityF40ph.class).getTankCapacity(), LiquidManager.dieselFilter());
        setupTextureDescription();
    }


    public void setupTextureDescription() {
        InsertTexture(0, "Amtrak Phase IV");
        InsertTexture(1, "Amtrak Phase III");
    }

    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this,4.7, 0.3, -0.45); }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.5F; }

    @Override
    public String getInventoryName() { return "Entity F40ph"; }

    @Override
    public SoundRecord getSoundRecord() { return EnumSounds.DieselF40PH; }
}
