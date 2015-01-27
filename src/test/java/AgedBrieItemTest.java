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
}
