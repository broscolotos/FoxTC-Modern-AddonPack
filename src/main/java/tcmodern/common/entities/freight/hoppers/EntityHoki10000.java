package tcmodern.common.entities.freight.hoppers;

import fexcraft.fvtm.BOBRollingStockModel;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import tcmodern.client.DetailRegistry;
import tcmodern.common.library.Info;
import tmt.Vec3f;
import train.client.render.register.TrainRenderRecord;
import train.common.Traincraft;
import train.common.api.AbstractStandardFixedFreightCar;
import train.common.entity.CargoManager;
import train.common.entity.CargoSpecification;
import train.common.entity.cargoManagerProvider.CargoModelInstanceProvider;

public class EntityHoki10000 extends AbstractStandardFixedFreightCar {

    public EntityHoki10000(World world) {
        super(world);
        setCargoManager(
            new CargoManager(new CargoSpecification[][] {
                {
                    new CargoSpecification(
                            new CargoModelInstanceProvider(DetailRegistry.modelHoki10000Coal),
                            Info.modID,
                            "trains/Hoki10000_/Hoki10000_Black",
                            "Coal",
                            new CargoSpecification.RenderParameters().setOffset(0, 3, 0)
                    )
                }
            })
        );
    }

    @Override
    public void setupTextureDescription() {
        InsertTexture(0, "JNR Hoki 10000");
    }

    @Override
    public String getInventoryName() { return "Hoki 10000"; }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 3.4375f; }


    @Override
    public void onRenderInsertRecord() {
        BOBRollingStockModel model = new BOBRollingStockModel(Info.modID, "models/freight/ModelHoki10000.bob", new boolean[] {false, true, true});
        model.getDetailInformation(0)
                .addModel(DetailRegistry.modelJNRFreightBogie, new Vec3f(-2.40625f,0,0f), null, null, DetailRegistry.textureJNRFreightBogie)
                .addModel(DetailRegistry.modelJNRFreightBogie, new Vec3f(2.40625f,0,0f), null, null, DetailRegistry.textureJNRFreightBogie);


        Traincraft.traincraftRegistry.RegisterRollingStockModel(
                        new TrainRenderRecord(Info.modID, EntityHoki10000.class, model,
                        "Hoki10000_", new float[] {0, 0.1875f, 0}, new float[] {0, 0, 180}, null)
                );
    }

}
