
public class AgedBrieItem extends CommonItem {

    public AgedBrieItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    protected void refreshQuality() {
        if (getSellIn() <= 0)
            setQuality(getQuality() + 
                    QUALITY_DEGRADES * QUALITY_DEGRADES_SELLIN_ZERO);
        else
            setQuality(getQuality() + QUALITY_DEGRADES);
    }
}
