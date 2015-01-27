
public class BackstagePassItem extends CommonItem {

    public BackstagePassItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    protected void refreshQuality() {
        if (getSellIn() > 5)
            setQuality(getQuality() + 2);
        else
            setQuality(getQuality() + 3);
    }
    
    
}
