
public class ConjuredItem extends CommonItem {
    
    protected final static int CONJURED_QUALITY_DEGRADES = 2;

    public ConjuredItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    protected int currentQuality() {     
        return super.currentQuality() * CONJURED_QUALITY_DEGRADES;
    }
}
