package tcmodern.common.entities.diesel;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import tcmodern.common.library.TCMLockoutGroups;
import train.common.Traincraft;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.core.util.TraincraftUtil;
import train.common.enums.LockoutGroup;
import train.common.library.EnumSounds;
import train.common.library.sounds.SoundRecord;

public class EntityGEU18B extends DieselTrain {

    public EntityGEU18B(World world) {
        super(world, Traincraft.traincraftRegistry.getTrainRecord(EntityGEU18B.class).getTankCapacity(), LiquidManager.dieselFilter());
        setupTextureDescription();
    }


    public void setupTextureDescription() {
        InsertTexture(0, "Seaboard Coast Line");
        InsertTexture(1, "Drexel Co", TCMLockoutGroups.DrexelCo);
        InsertTexture(2, "Carbondale & Pine Valley", LockoutGroup.CPV);
    }

    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this,4.25, 0.4, -0.45); }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.7F; }

    @Override
    public String getInventoryName() { return "GE U18B"; }

    @Override
    public SoundRecord getSoundRecord() { return EnumSounds.DieselU18B; }
}
