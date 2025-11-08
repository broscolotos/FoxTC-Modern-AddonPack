package tcmodern.common.entities.diesel;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.Traincraft;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.core.util.TraincraftUtil;
import train.common.library.EnumSounds;
import train.common.library.sounds.SoundRecord;

public class EntityEMDF3A extends DieselTrain {

    public EntityEMDF3A(World world) {
        super(world, Traincraft.traincraftRegistry.getTrainRecord(EntityEMDF3A.class).getTankCapacity(), LiquidManager.dieselFilter());
        setupTextureDescription();
    }


    public void setupTextureDescription() {
        InsertTexture(0, "Seaboard Air Line Railroad 4010");
        InsertTexture(1, "New York Central 3502");
        InsertTexture(2, "CNJ Scheme 4C - 51");
        InsertTexture(3, "CNJ Scheme 4C - 56");
        InsertTexture(4, "CNJ Scheme 4C - 51/56");
        InsertTexture(5, "CNJ Scheme 4D - 52");
        InsertTexture(6, "CNJ Scheme 4D - 57");
        InsertTexture(7, "CNJ Scheme 4D - 52/57");
        InsertTexture(8, "CNJ Scheme 3B - 50");
        InsertTexture(9, "CNJ Scheme 3B - 55");
        InsertTexture(10, "CNJ Scheme 3B - 50/55");
    }

    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this,4.625, 0.35, -0.45); }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.5F; }

    @Override
    public String getInventoryName() { return "EMD F3A"; }

    @Override
    public SoundRecord getSoundRecord() { return EnumSounds.DieselF3A; }

}
