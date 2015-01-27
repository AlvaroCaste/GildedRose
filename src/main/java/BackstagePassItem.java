
public class BackstagePassItem extends CommonItem {

    public BackstagePassItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    protected void refreshQuality() {
        if (getSellIn() > 10)
            setQuality(getQuality() + 1);
        else if (getSellIn() > 5)
            setQuality(getQuality() + 2);
        else
            setQuality(getQuality() + 3);
        
        if (getSellIn() <= 0)
            setQuality(0);
    }
    
    
}
