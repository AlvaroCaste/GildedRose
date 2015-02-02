import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class BackstagePassItemTest {

    CommonItem backstagePassesItem;
    
    @Test
    public void qualityIncreasesTest(){
        backstagePassesItem = new BackstagePassItem("BackstagePassItem", 15, 2);
        backstagePassesItem.updateQuality();
        assertTrue(backstagePassesItem.getQuality() == 3);
        backstagePassesItem.updateQuality();
        assertTrue(backstagePassesItem.getQuality() == 4);
    }
    
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
    
    @Test
    public void qualityCantBeMoreMaxQuality(){
        int quality = CommonItem.MAX_QUALITY + 5;
        backstagePassesItem = new BackstagePassItem("BackstagePassItem", 5, quality);
        backstagePassesItem.updateQuality();
        assertTrue(backstagePassesItem.getQuality() == CommonItem.MAX_QUALITY);
    }
}