package tcmodern.common.library;

import train.common.items.ItemRollingStock;

public class TCModernItems {
    /**
     * Setup all items
     */
    public TCModernItems() { loadRollingStockItems(); }

    private void loadRollingStockItems() {
        for (TCModernRollingStockItems item : TCModernRollingStockItems.values()) {
            item.item = new ItemRollingStock(item.iconName, item.TypeOfRollingStock);
        }
    }
}
