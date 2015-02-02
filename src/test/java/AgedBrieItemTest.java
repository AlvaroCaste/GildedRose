import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class AgedBrieItemTest {

    CommonItem agedBrieItem;
    
    @Test
    public void qualityIncreasesTest(){
        agedBrieItem = new AgedBrieItem("AgedBrieItem", 5, 5);
        agedBrieItem.updateQuality();
        assertTrue(agedBrieItem.getQuality() == 6);
        agedBrieItem.updateQuality();
        assertTrue(agedBrieItem.getQuality() == 7);
    }
    
    @Test
    public void qualityIncreasesX2SellInZeroTest(){
        agedBrieItem = new AgedBrieItem("AgedBrieItem", 0, 10);
        agedBrieItem.updateQuality();
        assertTrue(agedBrieItem.getQuality() == 12);
        agedBrieItem.updateQuality();
        assertTrue(agedBrieItem.getQuality() == 14);
    }
    
    @Test
    public void qualityCantBeMoreMaxQuality(){
        int quality = CommonItem.MAX_QUALITY + 5;
        agedBrieItem = new AgedBrieItem("AgedBrieItem", 5, quality);
        agedBrieItem.updateQuality();
        assertTrue(agedBrieItem.getQuality() == CommonItem.MAX_QUALITY);
    }
}
