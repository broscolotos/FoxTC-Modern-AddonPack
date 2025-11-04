package tcmodern.common.items;

import tcmodern.common.TCModern;
import tcmodern.common.library.Info;
import train.common.items.ItemAbstractRollingStock;

public class ItemTCModernRollingStock extends ItemAbstractRollingStock {

    public ItemTCModernRollingStock(String iconName) {
        super(iconName);
        setCreativeTab(TCModern.tcModernTab);
    }

    @Override
    public String GetContentPackName() {
        return "Traincraft Modern";
    }

    @Override
    public String GetTexturePath() {
        return Info.modID.toLowerCase() + ":trains/" + this.iconName;
    }
}
