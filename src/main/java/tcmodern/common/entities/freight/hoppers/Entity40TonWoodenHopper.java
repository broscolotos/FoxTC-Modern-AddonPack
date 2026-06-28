package tcmodern.common.entities.freight.hoppers;

import com.jcirmodelsquad.tcjcir.models.loads.ModelAAR50TonHopperLoad;
import fexcraft.fvtm.BOBRollingStockModel;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import tcmodern.client.DetailRegistry;
import tcmodern.common.library.Info;
import tmt.Vec3f;
import train.client.render.register.TrainRenderRecord;
import train.common.Traincraft;
import train.common.api.AbstractStandardFreightCar;
import train.common.entity.CargoManager;
import train.common.entity.CargoSpecification;
import train.common.entity.cargoManagerProvider.CargoModelInstanceProvider;

public class Entity40TonWoodenHopper extends AbstractStandardFreightCar {

    public Entity40TonWoodenHopper(World world) {
        super(world);
    }

    @Override
    public CargoManager setupCargoManager() {
        return new CargoManager(new CargoSpecification[][] {
            {
                new CargoSpecification(new CargoModelInstanceProvider(DetailRegistry.model40TonLoad),
                    Info.modID,
                    "trains/40_Ton_Wooden_Hopper_/load/iron_ore",
                    "Iron",
                    new CargoSpecification.RenderParameters().setOffset(0, 3, 0)
                )
            }
        });
    }

    @Override
    public void setupTextureDescription() {
        InsertTexture(0, "Brown (Red Trucks)");
        InsertTexture(1, "Brown (Grey Trucks)");
        InsertTexture(2, "Green");
        InsertTexture(3, "Red");
        InsertTexture(4, "Black");
        InsertTexture(5, "Grey");
    }

    @Override
    public String getInventoryName() { return "40 Ton Wooden Hopper"; }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.65F; }


    @Override
    public void onRenderInsertRecord() {
        BOBRollingStockModel model = new BOBRollingStockModel(Info.modID, "models/freight/Model40TonWoodenHopper.bob", new boolean[] {false, true, true});
        model.getDetailInformation(0)
                .addModel(DetailRegistry.modelBogie40Ton, new Vec3f(-0.8125f,0,0), null, null, DetailRegistry.textureBogie40TonGray)
                .addModel(DetailRegistry.modelBogie40Ton, new Vec3f(0.8125f,0,0), null, null, DetailRegistry.textureBogie40TonGray);
        model.getDetailInformation(3)
                .addModel(DetailRegistry.modelBogie40Ton, new Vec3f(-0.8125f,0,0), null, null, DetailRegistry.textureBogie40TonRed)
                .addModel(DetailRegistry.modelBogie40Ton, new Vec3f(0.8125f,0,0), null, null, DetailRegistry.textureBogie40TonRed);

        Traincraft.traincraftRegistry.RegisterRollingStockModel(new TrainRenderRecord(
                Info.modID, Entity40TonWoodenHopper.class, model,
                "40_Ton_Wooden_Hopper_", new float[] {0, 0.1875f, 0}, new float[] {0, 0, 180}, null)
        );
    }
}
