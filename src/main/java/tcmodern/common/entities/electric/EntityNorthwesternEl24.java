package tcmodern.common.entities.electric;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.ElectricTrain;
import train.common.core.util.TraincraftUtil;
import train.common.library.EnumSounds;
import train.common.library.sounds.SoundRecord;

public class EntityNorthwesternEl24 extends ElectricTrain {

    public EntityNorthwesternEl24(World world) {
        super(world);
        setupTextureDescription();
    }

    public void setupTextureDescription() {
        InsertTexture(0, "Northwestern Elevated Railroad - 24");
    }

    @Override
    public SoundRecord getSoundRecord() { return EnumSounds.locoElectricVL10; }

    @Override
    public String getInventoryName() { return "Northwestern El24"; }

    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 5.25, 0.15, 0.375); }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return (1.2F); }
}
