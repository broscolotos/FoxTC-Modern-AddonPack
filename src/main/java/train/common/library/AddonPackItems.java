package train.common.library;

import train.common.items.ItemRollingStock;

public class AddonPackItems
{
    /**
     * Setup all items
     */
    public AddonPackItems()
    {
        loadRollingStockItems();
    }

    private void loadRollingStockItems()
    {
        for (AddonRollingStockItems item : AddonRollingStockItems.values())
        {
            item.item = new ItemRollingStock(item.iconName, item.TypeOfRollingStock);
        }
    }
}
