package tcmodern.common.entities.tender;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import net.minecraftforge.fluids.FluidRegistry;
import train.common.Traincraft;
import train.common.api.LiquidManager;
import train.common.api.Tender;

public class EntityPRRCoastToCoastTender extends Tender {

    public EntityPRRCoastToCoastTender(World world) {
        super(world, FluidRegistry.WATER, 0, Traincraft.traincraftRegistry.getTrainRecord(EntityPRRCoastToCoastTender.class).getTankCapacity(), LiquidManager.WATER_FILTER);
    }

    @Override
    public String getInventoryName() { return "PRR Coast To Coast Tender"; }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 3.875F; }
}
