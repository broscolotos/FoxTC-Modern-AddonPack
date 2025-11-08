package tcmodern.common.entities.electric;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.ElectricTrain;
import train.common.core.util.TraincraftUtil;
import train.common.library.EnumSounds;
import train.common.library.sounds.SoundRecord;

public class EntityRadioFlyer extends ElectricTrain {

    public EntityRadioFlyer(World world) {
        super(world);
        setupTextureDescription();
    }

    public void setupTextureDescription() {
        InsertTexture(0, "Radio Flyer");
    }

    @Override
    public SoundRecord getSoundRecord() { return EnumSounds.ElectricCEESlug; }

    @Override
    public String getInventoryName() { return "Radio Flyer"; }

    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, -0.25, 0, 0); }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return (0.425F); }

}
