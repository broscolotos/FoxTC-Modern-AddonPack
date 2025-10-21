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

public class EntityNYCPT2Tender extends Tender implements IInventory {
    public int freightInventorySize;

    public EntityNYCPT2Tender(World world) {
        super(world, FluidRegistry.WATER, 0, Traincraft.traincraftRegistry.getTrainRecord(EntityNYCPT2Tender.class).getTankCapacity(), LiquidManager.WATER_FILTER);
        initFreightTender();
    }

    public EntityNYCPT2Tender(World world, double d, double d1, double d2) {
        this(world);
        setPosition(d, d1 + yOffset, d2);
        motionX = 0.0D;
        motionY = 0.0D;
        motionZ = 0.0D;
        prevPosX = d;
        prevPosY = d1;
        prevPosZ = d2;
    }

    @Override
    public String getInventoryName() { return "New York Central Tender"; }

    @Override
    public float getOptimalDistance(EntityMinecart cart) {
        return 3.5F;
    }




    /** Things you probably don't need to touch **/


    @Override
    protected void writeEntityToNBT(NBTTagCompound nbttagcompound) {
        super.writeEntityToNBT(nbttagcompound);

        NBTTagList nbttaglist = new NBTTagList();
        for (int i = 0; i < tenderItems.length; i++) {
            if (tenderItems[i] != null) {
                NBTTagCompound nbttagcompound1 = new NBTTagCompound();
                nbttagcompound1.setByte("Slot", (byte) i);
                tenderItems[i].writeToNBT(nbttagcompound1);
                nbttaglist.appendTag(nbttagcompound1);
            }
        }
        nbttagcompound.setTag("Items", nbttaglist);
    }

    @Override
    protected void readEntityFromNBT(NBTTagCompound nbttagcompound) {
        super.readEntityFromNBT(nbttagcompound);

        NBTTagList nbttaglist = nbttagcompound.getTagList("Items", Constants.NBT.TAG_COMPOUND);
        tenderItems = new ItemStack[getSizeInventory()];
        for (int i = 0; i < nbttaglist.tagCount(); i++) {
            NBTTagCompound nbttagcompound1 = nbttaglist.getCompoundTagAt(i);
            int j = nbttagcompound1.getByte("Slot") & 0xff;
            if (j >= 0 && j < tenderItems.length) {
                tenderItems[j] = ItemStack.loadItemStackFromNBT(nbttagcompound1);
            }
        }
    }

    public void initFreightTender() {
        freightInventorySize = 16;

        tenderItems = new ItemStack[freightInventorySize];
        this.setDefaultMass(0.2);
    }

    @Override
    public void onUpdate() {
        super.onUpdate();
        checkInvent(tenderItems[0], this);
    }

    @Override
    public int getSizeInventory() {
        return freightInventorySize;
    }

    @Override
    public boolean isItemValidForSlot(int i, ItemStack itemstack) {
        return true;
    }
}
