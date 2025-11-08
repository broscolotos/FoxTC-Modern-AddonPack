package tcmodern.common.entities.freight.hoppers;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.AbstractStandardFixedFreightCar;

public class Entity100TonHopper extends AbstractStandardFixedFreightCar {

    public Entity100TonHopper(World world) { super(world); }

    @Override
    public void setupTextureDescription() {
        InsertTexture(0, "Black");
        InsertTexture(1, "Peabody short line");
    }

    @Override
    public String getInventoryName() { return "100 Ton Hopper"; }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 4.375f; }

}
