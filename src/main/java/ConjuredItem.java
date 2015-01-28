
public class ConjuredItem extends CommonItem {
    
    protected final static int CONJURED_QUALITY_DEGRADES = 2;

    public ConjuredItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    protected void refreshQuality() {     
        if (getSellIn() <= 0)
            setQuality(getQuality() - 
                    QUALITY_DEGRADES * QUALITY_DEGRADES_SELLIN_ZERO * 
                    CONJURED_QUALITY_DEGRADES);
        else
            setQuality(getQuality() - QUALITY_DEGRADES * CONJURED_QUALITY_DEGRADES);
        qualityNeverLessZero();
    }
}
