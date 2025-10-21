package tcmodern.common.library;

import cpw.mods.fml.common.registry.GameRegistry;
import tcmodern.common.items.ItemTCModernRollingStock;

public class TCModernItems {
    /**
     * Setup all items
     */
    public TCModernItems() {
        loadRollingStockItems();
    }

    private void loadRollingStockItems() {
        for (final TCModernRollingStockItems item : TCModernRollingStockItems.values()) {
            item.item = new ItemTCModernRollingStock(item.iconName);
            item.item.setUnlocalizedName(Info.modID + ":" + item.itemName);
            GameRegistry.registerItem(item.item, item.itemName);
        }
    }
}
