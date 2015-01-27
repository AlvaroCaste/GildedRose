public class CommonItem extends Item {
    
    protected final static int QUALITY_DEGRADES = 1;
    protected final static int QUALITY_DEGRADES_SELLIN_ZERO = 2;
    protected final static int MAX_QUALITY = 50;

    public CommonItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
        checkMaxQuality();
    }

    public void updateQuality() {
        refreshQuality();
        decreaseSellIn();
    }

    protected void refreshQuality() {     
        if (getSellIn() <= 0)
            setQuality(getQuality() - 
                    QUALITY_DEGRADES * QUALITY_DEGRADES_SELLIN_ZERO);
        else
            setQuality(getQuality() - QUALITY_DEGRADES);
        qualityNeverLessZero();
    }

    protected void qualityNeverLessZero() {
        if (getQuality() < 0)
            setQuality(0);
    }
    
    protected void checkMaxQuality(){
        if (getQuality() > MAX_QUALITY)
            setQuality(MAX_QUALITY);
    }

    protected void decreaseSellIn(){
        setSellIn(getSellIn() - 1);
    }
}
