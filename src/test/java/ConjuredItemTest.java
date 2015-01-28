import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class ConjuredItemTest {
   
    CommonItem conjuredItem;
    
    @Test
    public void conjuredDegradesQualityTwiceFastCommonItemTest(){
        conjuredItem = new ConjuredItem("ConjuredItem",3, 6);
        conjuredItem.updateQuality();
        assertTrue(conjuredItem.getQuality() == 4);
        conjuredItem.updateQuality();
        assertTrue(conjuredItem.getQuality() == 2);
    }
    
    @Test
    public void conjuredDegradesQualityTwiceFastSellInZeroTest(){
        conjuredItem = new ConjuredItem("ConjuredItem", 0, 10);
        conjuredItem.updateQuality();
        assertTrue(conjuredItem.getQuality() == 6);
        conjuredItem.updateQuality();
        assertTrue(conjuredItem.getQuality() == 2);
    }
}
