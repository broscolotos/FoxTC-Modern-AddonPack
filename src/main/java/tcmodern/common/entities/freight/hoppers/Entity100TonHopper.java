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

public class Entity100TonHopper extends AbstractStandardFixedFreightCar {

    public Entity100TonHopper(World world) {
        super(world);
        setCargoManager(
            new CargoManager(new CargoSpecification[][] {
                {
                    new CargoSpecification(
                            new CargoModelInstanceProvider(DetailRegistry.model100TonLoad2),
                            Info.modID,
                            "trains/100_Ton_Hopper_/100_Ton_Hopper_Black",
                            "Filled",
                            new CargoSpecification.RenderParameters().setOffset(0, 3, 0)
                    )
                },
                {
                    new CargoSpecification(
                            new CargoModelInstanceProvider(DetailRegistry.model100TonLoad),
                            Info.modID,
                            "trains/100_Ton_Hopper_/100_Ton_Hopper_Black",
                            "Overfilled 1",
                            new CargoSpecification.RenderParameters().setOffset(0, 3, 0)
                    )
                }
            })
        );
    }

    @Override
    public void setupTextureDescription() {
        InsertTexture(0, "Black");
        InsertTexture(1, "Peabody short line");
    }

    @Override
    public String getInventoryName() { return "100 Ton Hopper"; }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 4.375f; }


    @Override
    public void onRenderInsertRecord() {
        BOBRollingStockModel model = new BOBRollingStockModel(Info.modID, "models/freight/Model100TonHopper.bob", new boolean[] {false, true, true});
        model.getDetailInformation(0)
                .addModel(DetailRegistry.modelGenericFreightBogie, new Vec3f(-3.21875f,0.09375f,0f), null, null, DetailRegistry.textureGenericFreightBogieGray)
                .addModel(DetailRegistry.modelGenericFreightBogie, new Vec3f(3.21875f,0.09375f,0f), null, null, DetailRegistry.textureGenericFreightBogieGray);


        Traincraft.traincraftRegistry.RegisterRollingStockModel(
                        new TrainRenderRecord(Info.modID, Entity100TonHopper.class, model,
                        "100_Ton_Hopper_", new float[] {0, 0.28125f, 0}, new float[] {0, 0, 180}, null)
                );
    }

}
