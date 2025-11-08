package tcmodern.common.entities.diesel;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.Traincraft;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.core.util.TraincraftUtil;
import train.common.library.EnumSounds;
import train.common.library.sounds.SoundRecord;

public class EntityEMDF3B extends DieselTrain {

    public EntityEMDF3B(World world) {
        super(world, Traincraft.traincraftRegistry.getTrainRecord(EntityEMDF3B.class).getTankCapacity(), LiquidManager.dieselFilter());
        setupTextureDescription();
    }


    public void setupTextureDescription() {
        InsertTexture(0, "Seaboard Air Line Railroad");
        InsertTexture(1, "New York Central 2406");
        InsertTexture(2, "CNJ Scheme 4C");
        InsertTexture(3, "CNJ Scheme 4D");
        InsertTexture(4, "CNJ Scheme 3B");
    }

    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this,0, 0.33); }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.5F; }

    @Override
    public String getInventoryName() { return "EMD F3B"; }

    @Override
    public SoundRecord getSoundRecord() { return EnumSounds.DieselF3B; }

}
