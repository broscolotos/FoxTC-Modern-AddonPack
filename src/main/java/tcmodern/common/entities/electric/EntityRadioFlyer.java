package tcmodern.common.entities.electric;

import fexcraft.fvtm.BOBRollingStockModel;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import tcmodern.common.library.Info;
import train.client.render.register.TrainRenderRecord;
import train.common.Traincraft;
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
    public float getOptimalDistance(EntityMinecart cart) { return (0.65F); }

    @Override
    public void onRenderInsertRecord() {
        BOBRollingStockModel model = new BOBRollingStockModel(Info.modID, "models/electric/ModelRadioFlyerHandcar.bob", new boolean[] {false, true, true});

        Traincraft.traincraftRegistry
                .RegisterRollingStockModel(new TrainRenderRecord(
                        Info.modID, EntityRadioFlyer.class, model,"RadioFlyer_",
                        new float[] {-0.2f, 0.1875f, 0}, new float[] {0, 180, 180},null)
                );
    }

}
