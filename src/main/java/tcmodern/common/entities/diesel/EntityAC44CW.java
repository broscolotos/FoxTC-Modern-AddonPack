package tcmodern.common.entities.diesel;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import tcmodern.common.library.TCModernSounds;
import train.common.Traincraft;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.core.util.TraincraftUtil;
import train.common.library.EnumSounds;
import train.common.library.sounds.SoundRecord;

public class EntityAC44CW extends DieselTrain {

    public EntityAC44CW(World world) {
        super(world, Traincraft.traincraftRegistry.getTrainRecord(EntityAC44CW.class).getTankCapacity(), LiquidManager.dieselFilter());
        setupTextureDescription();
    }


    public void setupTextureDescription() {
        InsertTexture(0, "Kansas City Southern");
        InsertTexture(1, "Florida East Coast - Grupo Mexico");
        InsertTexture(2, "Central Maine & Quebec");
        InsertTexture(3, "Southern Pacific");
        InsertTexture(4, "CSX (YN3)");
        InsertTexture(5, "CSX (YN2)");
        InsertTexture(6, "Ferromex");
    }

    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this,6.75, 0.4, -0.45); }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.74F; }

    @Override
    public String getInventoryName() { return "AC44CW"; }

    @Override
    public SoundRecord getSoundRecord() { return TCModernSounds.AC4400CW; }
}
