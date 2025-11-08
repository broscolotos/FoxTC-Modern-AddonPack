package tcmodern.common.entities.steam;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import tcmodern.common.library.TCMLockoutGroups;
import tcmodern.common.library.TCModernSounds;
import train.common.Traincraft;
import train.common.api.LiquidManager;
import train.common.api.SteamTrain;
import train.common.core.util.TraincraftUtil;
import train.common.library.EnumSounds;
import train.common.library.EnumTrains;
import train.common.library.GuiIDs;
import train.common.library.Info;
import train.common.library.sounds.SoundRecord;

public class EntityL3aMohawk  extends SteamTrain {

    public EntityL3aMohawk(World world) {
        super(world, Traincraft.traincraftRegistry.getTrainRecord(EntityL3aMohawk.class).getTankCapacity(), LiquidManager.WATER_FILTER);
        setupTextureDescription();
    }


    public void setupTextureDescription() {
        InsertTexture(0, "NYC 3001 (White Gear)");
        InsertTexture(1, "NYC 3000 (White Gear)");
        InsertTexture(2, "NYC 3001 (Black Gear)");
        InsertTexture(3, "NYC 3000 (Black Gear)");
        InsertTexture(4, "Spawnline Express 2012", TCMLockoutGroups.SpawnlineExpress);
        InsertTexture(5, "Splawnline Express 2013", TCMLockoutGroups.SpawnlineExpress);
    }

    @Override
    public String getInventoryName() { return "L3a Mohawk"; }

    @Override
    public SoundRecord getSoundRecord() { return TCModernSounds.L3AMohawk; }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.15F; }

    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, -1, 0.375); }

}
