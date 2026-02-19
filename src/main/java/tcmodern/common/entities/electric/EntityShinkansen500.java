package tcmodern.common.entities.electric;

import fexcraft.fvtm.BOBRollingStockModel;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL14;
import org.lwjgl.opengl.GL30;
import tcmodern.common.entities.passenger.EntityShinkansenPassengerCar;
import tcmodern.common.library.Info;
import tcmodern.common.library.TCModernRollingStockItems;
import tmt.Tessellator;
import train.client.render.RenderRollingStock;
import train.client.render.register.TrainRenderRecord;
import train.common.Traincraft;
import train.common.api.AbstractTrains;
import train.common.api.ElectricTrain;
import train.common.core.util.TraincraftUtil;
import train.common.library.EnumSounds;
import train.common.library.register.ITrainRecord;
import train.common.library.sounds.SoundRecord;
import static org.lwjgl.opengl.GL30.*;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

public class EntityShinkansen500 extends ElectricTrain {

    public EntityShinkansen500(World world) {
        super(world);
        setupTextureDescription();
    }

    public void setupTextureDescription() {
        InsertTexture(0, "500-0 Series (Default)");
    }

    @Override
    public SoundRecord getSoundRecord() { return EnumSounds.locoElectricICE1; }

    @Override
    public String getInventoryName() { return "Shinkansen 500-0"; }

    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 6.5, -0.4, 0.26); }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return (1.525F); }

    @Override
    public void onRenderInsertRecord() {
        BOBRollingStockModel model = new BOBRollingStockModel(Info.modID, "models/electric/ModelShinkansen500-0_Engine.bob", new boolean[] {false, true, true});
        Traincraft.traincraftRegistry.RegisterRollingStockModel(new TrainRenderRecord(
                Info.modID, EntityShinkansen500.class, model, "Shinkansen500-0_Engine_",
                new float[] {-3.25f, 0.15625f, 0}, new float[] {0, 0, 180}, null
        ));
    }
}
