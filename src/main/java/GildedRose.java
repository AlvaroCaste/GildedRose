import java.util.ArrayList;
import java.util.List;


public class GildedRose {

	private static List<CommonItem> items = null;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
        System.out.println("OMGHAI!");
		
        items = new ArrayList<CommonItem>();
        items.add(new CommonItem("+5 Dexterity Vest", 10, 20));
        items.add(new AgedBrieItem("Aged Brie", 2, 0));
        items.add(new CommonItem("Elixir of the Mongoose", 5, 7));
        items.add(new SulfurasItem("Sulfuras, Hand of Ragnaros", 0, 80));
        items.add(new BackstagePassItem("Backstage passes to a TAFKAL80ETC concert", 15, 20));
        items.add(new ConjuredItem("Conjured Mana Cake", 3, 6));

        updateQuality();
}


	
    public static void updateQuality(){
        for (CommonItem commonItem : items) {
            commonItem.updateQuality();
        }
    }       

}