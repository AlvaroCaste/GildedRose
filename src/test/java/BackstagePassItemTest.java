import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class BackstagePassItemTest {

    CommonItem backstagePassesItem;
    
    @Test
    public void qualityIncreases2WhenSellInTenOrLessTest(){
        backstagePassesItem = new BackstagePassItem("BackstagePassItem",10, 2);
        backstagePassesItem.updateQuality();
        assertTrue(backstagePassesItem.getQuality() == 4);
        backstagePassesItem.updateQuality();
        assertTrue(backstagePassesItem.getQuality() == 6);
    }
    
    @Test
    public void qualityIncreases3WhenSellIn5OrLessTest(){
        backstagePassesItem = new BackstagePassItem("BackstagePassItem", 5, 2);
        backstagePassesItem.updateQuality();
        assertTrue(backstagePassesItem.getQuality() == 5);
        backstagePassesItem.updateQuality();
        assertTrue(backstagePassesItem.getQuality() == 8);
    }
    
    @Test
    public void qualityDecreasesZeroWhenSellInZeroTest(){
        backstagePassesItem = new BackstagePassItem("BackstagePassItem", 0, 10);
        backstagePassesItem.updateQuality();
        assertTrue(backstagePassesItem.getQuality() == 0);
        backstagePassesItem.updateQuality();
        assertTrue(backstagePassesItem.getQuality() == 0);
    }
}