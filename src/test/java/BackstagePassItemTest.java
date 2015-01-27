import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class BackstagePassItemTest {

    CommonItem backstagePassesItem;
    
    @Test
    public void qualityIncreaseTwoWhenSellInTenOrLessTest(){
        backstagePassesItem = new BackstagePassItem("BackstagePassItem",8, 2);
        backstagePassesItem.updateQuality();
        assertTrue(backstagePassesItem.getQuality() == 4);
        backstagePassesItem.updateQuality();
        assertTrue(backstagePassesItem.getQuality() == 6);
    }
}