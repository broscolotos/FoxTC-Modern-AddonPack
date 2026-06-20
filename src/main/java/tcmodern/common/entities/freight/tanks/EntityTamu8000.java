package tcmodern.common.entities.freight.tanks;

import fexcraft.fvtm.BOBRollingStockModel;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import tcmodern.client.DetailRegistry;
import tcmodern.common.entities.tender.EntityCnOTender;
import tcmodern.common.library.Info;
import train.client.render.register.TrainRenderRecord;
import train.common.Traincraft;
import train.common.api.AbstractStandardTankerCar;

public class EntityTamu8000 extends AbstractStandardTankerCar {


    public EntityTamu8000(World world) {
        super(world, Traincraft.traincraftRegistry.getTrainRecord(EntityTamu8000.class).getTankCapacity());
    }

    @Override
    public void setupTextureDescription() {
        InsertTexture(0, "White");
    }

    @Override
    public String getInventoryName() { return "Tamu 8000"; }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.95F; }


    @Override
    public void onRenderInsertRecord() {
        BOBRollingStockModel model = new BOBRollingStockModel(Info.modID, "models/freight/ModelTamu8000.bob", new boolean[] {false, true, true});

        Traincraft.traincraftRegistry.RegisterRollingStockModel(
                new TrainRenderRecord(Info.modID, EntityTamu8000.class, model,
                        "Tamu_8000_", new float[] {0, 0.1875f, 0}, new float[] {0, 0, 180}, null)
        );
    }

}
