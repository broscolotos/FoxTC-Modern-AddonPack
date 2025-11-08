package tcmodern.common.entities.tender;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.world.World;
import net.minecraftforge.common.util.Constants;
import net.minecraftforge.fluids.FluidRegistry;
import tcmodern.common.library.TCMLockoutGroups;
import train.common.Traincraft;
import train.common.api.LiquidManager;
import train.common.api.Tender;
import train.common.library.GuiIDs;

public class EntityNYCPT2Tender extends Tender {

    public EntityNYCPT2Tender(World world) {
        super(world, FluidRegistry.WATER, 0, Traincraft.traincraftRegistry.getTrainRecord(EntityNYCPT2Tender.class).getTankCapacity(), LiquidManager.WATER_FILTER);
        setupTextureDescription();
    }

    public void setupTextureDescription() {
        InsertTexture(1, "Spawnline Express", TCMLockoutGroups.SpawnlineExpress);
    }

    @Override
    public String getInventoryName() { return "New York Central Tender"; }

    @Override
    public float getOptimalDistance(EntityMinecart cart) {
        return 3.5F;
    }

}
