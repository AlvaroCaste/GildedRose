import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class BackstagePassItemTest {

    CommonItem backstagePassesItem;
    
    @Test
    public void qualityIncrease2WhenSellIn10OrLessTest(){
        backstagePassesItem = new BackstagePassItem("BackstagePassItem",10, 2);
        backstagePassesItem.updateQuality();
        assertTrue(backstagePassesItem.getQuality() == 4);
        backstagePassesItem.updateQuality();
        assertTrue(backstagePassesItem.getQuality() == 6);
    }
    
    @Test
    public void qualityIncrease3WhenSellIn5OrLessTest(){
        backstagePassesItem = new BackstagePassItem("BackstagePassItem", 5, 2);
        backstagePassesItem.updateQuality();
        assertTrue(backstagePassesItem.getQuality() == 5);
        backstagePassesItem.updateQuality();
        assertTrue(backstagePassesItem.getQuality() == 8);
    }
}