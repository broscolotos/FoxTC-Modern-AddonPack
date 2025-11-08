package tcmodern.common.entities.tender;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.world.World;
import net.minecraftforge.common.util.Constants;
import net.minecraftforge.fluids.FluidRegistry;
import train.common.Traincraft;
import train.common.api.LiquidManager;
import train.common.api.Tender;

public class EntityNYC40ft3inTender extends Tender {

    public EntityNYC40ft3inTender(World world) {
        super(world, FluidRegistry.WATER, 0, Traincraft.traincraftRegistry.getTrainRecord(EntityNYC40ft3inTender.class).getTankCapacity(), LiquidManager.WATER_FILTER);
        setupTextureDescription();
    }

    public void setupTextureDescription() {

    }

    @Override
    public String getInventoryName() { return "New York Central Tender"; }

    @Override
    public float getOptimalDistance(EntityMinecart cart) {
        return 3.1F;
    }


}
