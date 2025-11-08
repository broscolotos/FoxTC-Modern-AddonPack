package tcmodern.common.entities.electric;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.ElectricTrain;
import train.common.core.util.TraincraftUtil;
import train.common.library.EnumSounds;
import train.common.library.sounds.SoundRecord;

public class EntityHandcar extends ElectricTrain {

    public EntityHandcar(World world) {
        super(world);
        setupTextureDescription();
    }


    public void setupTextureDescription() {
        InsertTexture(0, "Brown");
    }

    @Override
    public SoundRecord getSoundRecord() { return EnumSounds.ElectricCEESlug; }

    @Override
    public String getInventoryName() { return "Handcar"; }

    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, -1, 0.15); }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return (1.05F); }
}
