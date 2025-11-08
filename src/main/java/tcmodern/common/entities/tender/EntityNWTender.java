package tcmodern.common.entities.tender;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import net.minecraftforge.fluids.FluidRegistry;
import train.common.Traincraft;
import train.common.api.LiquidManager;
import train.common.api.Tender;

public class EntityNWTender extends Tender {

    public EntityNWTender(World world) {
        super(world, FluidRegistry.WATER, 0, Traincraft.traincraftRegistry.getTrainRecord(EntityNWTender.class).getTankCapacity(), LiquidManager.WATER_FILTER);
        setupTextureDescription();
    }

    public void setupTextureDescription() {
        InsertTexture(0, "Norfolk & Western");
    }

    @Override
    public String getInventoryName() { return "Norfolk & Western Tender"; }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 3.25F; }
}
