package tcmodern.common.entities.steam;

import fexcraft.fvtm.BOBRollingStockModel;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import tcmodern.client.DetailRegistry;
import tcmodern.common.library.Info;
import train.client.render.register.TrainRenderRecord;
import train.common.Traincraft;
import train.common.api.LiquidManager;
import train.common.api.SteamTrain;
import train.common.core.util.TraincraftUtil;
import train.common.library.EnumSounds;
import train.common.library.sounds.SoundRecord;

import java.util.ArrayList;

public class EntityAllegheny extends SteamTrain {

    public EntityAllegheny(World world) {
        super(world, Traincraft.traincraftRegistry.getTrainRecord(EntityAllegheny.class).getTankCapacity(), LiquidManager.WATER_FILTER);
        setupTextureDescription();
    }

    public void setupTextureDescription() {
        InsertTexture(0, "C&O 1601");
    }

    @Override
    public String getInventoryName() { return "C&O Allegheny"; }

    @Override
    public SoundRecord getSoundRecord() { return EnumSounds.locoSteamC41; }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.15F; }

    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 5, 0.625, 0.5); }


    @Override
    public void onRenderInsertRecord() {
        BOBRollingStockModel model = new BOBRollingStockModel(Info.modID, "models/steam/ModelAlleghenyMain.bob", new boolean[] {false, true, true});
        model.getDetailInformation(0)
                .addModel(DetailRegistry.modelAlleghenyRearBogie, 7, null, null, null, (ResourceLocation)null);

        Traincraft.traincraftRegistry.RegisterRollingStockModel(new TrainRenderRecord(
                Info.modID, EntityAllegheny.class, model,"Allegheny_",
                new float[] {1, 0.1875f, 0}, new float[] {0, 180, 180},null,
                "largesmoke", new ArrayList<double[]>() {
                    {
                        add(new double[] { -3.96875D, 1.8125D, 0.0D });
                        add(new double[] { -3.6875D, 1.8125D, 0.0D });
                    }
                },
                "explode", new ArrayList<double[]>() {
                    {
                        add(new double[] { -0.5, -0.1875D, 0.6875D });
                    }
                }, 10, 2));
    }



}
