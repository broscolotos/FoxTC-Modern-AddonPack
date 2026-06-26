package tcmodern.common.entities.steam;

import fexcraft.fvtm.BOBRollingStockModel;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import tcmodern.client.DetailRegistry;
import tcmodern.common.library.Info;
import tcmodern.common.library.TCMLockoutGroups;
import tcmodern.common.library.TCModernSounds;
import tmt.Vec3f;
import train.client.render.register.TrainRenderRecord;
import train.common.Traincraft;
import train.common.api.LiquidManager;
import train.common.api.SteamTrain;
import train.common.core.util.TraincraftUtil;
import train.common.library.sounds.SoundRecord;

import java.util.ArrayList;

public class EntityL3aMohawk  extends SteamTrain {

    public EntityL3aMohawk(World world) {
        super(world, Traincraft.traincraftRegistry.getTrainRecord(EntityL3aMohawk.class).getTankCapacity(), LiquidManager.WATER_FILTER);
        setupTextureDescription();
    }


    public void setupTextureDescription() {
        InsertTexture(0, "NYC 3001 (White Gear)");
        InsertTexture(1, "NYC 3000 (White Gear)");
        InsertTexture(2, "NYC 3001 (Black Gear)");
        InsertTexture(3, "NYC 3000 (Black Gear)");
        InsertTexture(4, "Spawnline Express 2012", TCMLockoutGroups.SPAWNLINEEXPRESS);
        InsertTexture(5, "Splawnline Express 2013", TCMLockoutGroups.SPAWNLINEEXPRESS);
    }

    @Override
    public String getInventoryName() { return "L3a Mohawk"; }

    @Override
    public SoundRecord getSoundRecord() { return TCModernSounds.L3AMohawk; }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.15F; }

    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, -1, 0.1875, -0.5); }


    @Override
    public void onRenderInsertRecord() {
        BOBRollingStockModel model = new BOBRollingStockModel(Info.modID, "models/steam/ModelL3aMohawk.bob", new boolean[] {false, true, true});
        model.getDetailInformation(0)
                .addModel(DetailRegistry.modelL3aFrontBogie, 0, new Vec3f(2.478515625f,0,0), null, null, (ResourceLocation)null)
                .addModel(DetailRegistry.modelL3aRearBogie, 0, new Vec3f(-1.30859375f,0,0), null, null, (ResourceLocation)null);


        Traincraft.traincraftRegistry.RegisterRollingStockModel(new TrainRenderRecord(
            Info.modID, EntityL3aMohawk.class, model,"l3a_mohawk_",
            new float[] {-2.5f, 0.1875f, 0}, new float[] {0, 0, 180},null,
            "largesmoke", new ArrayList<double[]>() {
                    {
                        add(new double[] { 4.875D, 1.3875D, 0.0D });
                    }
                },
            "explode", new ArrayList<double[]>() {
                    {
                        add(new double[] { 4.5, -0.1875D, 0.6875D });
                    }
                },
            10, 2)
        );
    }

    /**/
}
