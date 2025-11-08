package tcmodern.common.entities.diesel;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.Traincraft;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.core.util.TraincraftUtil;
import train.common.library.EnumSounds;
import train.common.library.sounds.SoundRecord;

public class EntityModel40 extends DieselTrain {

    public EntityModel40(World world) {
        super(world, Traincraft.traincraftRegistry.getTrainRecord(EntityModel40.class).getTankCapacity(), LiquidManager.dieselFilter());
        setupTextureDescription();
    }


    public void setupTextureDescription() {
        InsertTexture(0, "West Pennsylvania Power - 10");
    }

    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this,0.75, 0.2); }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 0.625F; }

    @Override
    public String getInventoryName() { return "EMD Model 40"; }

    @Override
    public SoundRecord getSoundRecord() { return EnumSounds.Diesel44Ton; }

}
