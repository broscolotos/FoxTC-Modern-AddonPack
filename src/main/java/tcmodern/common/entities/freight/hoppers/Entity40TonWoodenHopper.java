package tcmodern.common.entities.freight.hoppers;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.AbstractStandardFixedFreightCar;

public class Entity40TonWoodenHopper extends AbstractStandardFixedFreightCar {

    public Entity40TonWoodenHopper(World world) { super(world); }

    @Override
    public void setupTextureDescription() { }

    @Override
    public String getInventoryName() { return "40 Ton Wooden Hopper"; }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.65F; }

}
