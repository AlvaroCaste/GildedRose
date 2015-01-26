public class CommonItem extends Item {

    public CommonItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    public void updateQuality() {
        degradeQuality();
    }

    protected void degradeQuality() {
        setQuality(getQuality() - 1);       
        if (getSellIn() <= 0)
            setQuality(getQuality() - 1);
    }

}
