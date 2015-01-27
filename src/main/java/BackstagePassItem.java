
public class BackstagePassItem extends CommonItem {

    public BackstagePassItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    protected void refreshQuality() {
        if (getSellIn() <= 10)
            setQuality(getQuality() + 2);
            
    }
    
    
}
