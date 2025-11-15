package tcmodern.common.entities.freight.hoppers;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.AbstractStandardFixedFreightCar;

public class Entity40TonWoodenHopper extends AbstractStandardFixedFreightCar {

    public Entity40TonWoodenHopper(World world) { super(world); }

    @Override
    public void setupTextureDescription() {
        InsertTexture(0, "Brown (Red Trucks)");
        InsertTexture(1, "Brown (Grey Trucks");
        InsertTexture(2, "Green");
        InsertTexture(3, "Red");
        InsertTexture(4, "Black");
        InsertTexture(5, "Grey");
    }

    @Override
    public String getInventoryName() { return "40 Ton Wooden Hopper"; }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.65F; }

}
