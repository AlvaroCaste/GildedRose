import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CommonItemTest {
    CommonItem itemTest;

    @Test
    public void qualityDegradesOneByOneTest() {
        itemTest = new CommonItem("commonItem", 10, 10);
        itemTest.updateQuality();
        assertTrue(itemTest.getQuality() == 9);
        itemTest.updateQuality();
        assertTrue(itemTest.getQuality() == 8);
        itemTest.updateQuality();
        assertTrue(itemTest.getQuality() == 7);
    }
    
    @Test
    public void qualityDegradeX2SellInZeroTest(){
        itemTest = new CommonItem("commonItem", 0, 10);
        itemTest.updateQuality();
        assertTrue(itemTest.getQuality() == 8);
        itemTest.updateQuality();
        assertTrue(itemTest.getQuality() == 6);
    }
    
    @Test
    public void qualityNeverNegativeTest(){
        itemTest = new CommonItem("commonItem",5,0);
        itemTest.updateQuality();
        assertTrue(itemTest.getQuality() == 0);
        itemTest.updateQuality();
        assertTrue(itemTest.getQuality() == 0);
    }
    
    @Test
    public void qualityNeverMore50Test(){
        int quality = CommonItem.MAX_QUALITY + 5;
        itemTest = new CommonItem("commonItem", 10, quality);
        assertTrue(itemTest.getQuality() == CommonItem.MAX_QUALITY);
    }
    
    @Test
    public void sellInDegradesWhenUpdadeQualityTest(){
        itemTest = new CommonItem("commonItem", 5, 5);
        itemTest.updateQuality();
        assertTrue(itemTest.getSellIn() == 4);
    }
}