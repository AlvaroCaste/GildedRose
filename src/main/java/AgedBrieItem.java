
public class AgedBrieItem extends CommonItem {

    public AgedBrieItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    protected void refreshQuality() {
        setQuality(getQuality() + currentQuality());
    }

   


}
