package tcmodern.common.creativetabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public final class CreativeTabTCModern extends CreativeTabs {
	private final Item itemForIcon;

	public CreativeTabTCModern(int tabID, String tabName, Item tabIcon) {
		super(tabID, tabName);
		setBackgroundImageName("item_search.png");
		itemForIcon = tabIcon;
	}

	@Override
	public boolean hasSearchBar() { return true; }

	@Override
	public ItemStack getIconItemStack() { return new ItemStack(itemForIcon); }

	@Override
	public String getTranslatedTabLabel() { return super.getTabLabel(); }

	@Override
	public Item getTabIconItem(){ return itemForIcon; }
}
