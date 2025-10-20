package tcmodern.common.library;

import tcmodern.common.TCModern;
import train.common.items.ItemAbstractRollingStock;
import train.common.library.TypeOfRollingStock;

public class ItemTCModernRollingStock extends ItemAbstractRollingStock {

    public ItemTCModernRollingStock(String iconName, String name) {
        super(iconName);
        setCreativeTab(TCModern.tcModernTab);
        this.setUnlocalizedName(name);
    }

    @Override
    public String GetTexturePath() {
        return Info.modID.toLowerCase() + ":/trains/" + this.iconName;
    }
}
