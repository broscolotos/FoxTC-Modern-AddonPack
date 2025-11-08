package tcmodern.common.entities.tender;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import net.minecraftforge.fluids.FluidRegistry;
import train.common.Traincraft;
import train.common.api.LiquidManager;
import train.common.api.Tender;

public class EntityCnOTender extends Tender {

    public EntityCnOTender(World world) {
        super(world, FluidRegistry.WATER, 0, Traincraft.traincraftRegistry.getTrainRecord(EntityCnOTender.class).getTankCapacity(), LiquidManager.WATER_FILTER);
        setupTextureDescription();
    }

    public void setupTextureDescription() {
        InsertTexture(0, "C&O 1601");
    }

    @Override
    public String getInventoryName() { return "Chesapeake & Ohio Tender"; }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 3.17F; }
}
