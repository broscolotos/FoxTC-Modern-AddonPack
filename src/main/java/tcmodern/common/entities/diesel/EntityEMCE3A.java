package tcmodern.common.entities.diesel;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import tcmodern.client.render.locomotive.diesel.ModelEMCE3A;
import tcmodern.common.library.Info;
import train.client.render.register.ITrainRenderRecord;
import train.client.render.register.TrainRenderRecord;
import train.common.Traincraft;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.core.util.TraincraftUtil;
import train.common.library.EnumSounds;
import train.common.library.sounds.SoundRecord;

import java.util.ArrayList;

public class EntityEMCE3A extends DieselTrain {

    public EntityEMCE3A(World world) {
        super(world, Traincraft.traincraftRegistry.getTrainRecord(EntityEMCE3A.class).getTankCapacity(), LiquidManager.dieselFilter());
        setupTextureDescription();
    }


    public void setupTextureDescription() {
        InsertTexture(0, "Seaboard Air Line - 3030");
    }

    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this,6.45, 0.3, -0.45); }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.95F; }

    @Override
    public String getInventoryName() { return "EMC E3A"; }

    @Override
    public SoundRecord getSoundRecord() { return EnumSounds.DieselEMDE7A; }
}
