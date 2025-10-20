package tcmodern.common.library;

import cpw.mods.fml.common.registry.GameRegistry;
import tcmodern.common.TCModern;
import train.common.items.ItemAbstractRollingStock;

public class TCModernItems {
    /**
     * Setup all items
     */
    public TCModernItems() { loadRollingStockItems(); }

    private void loadRollingStockItems() {
        for (final TCModernRollingStockItems item : TCModernRollingStockItems.values()) {
            item.item = new ItemTCModernRollingStock(item.iconName, item.itemName);
            GameRegistry.registerItem(item.item, item.name());
        }
    }
}
