import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class SulfurasItemTest {

    CommonItem sulfurasItem;
    
    @Test
    public void sulfurasDoesntDegradeQualityTest(){
        sulfurasItem = new SulfurasItem("SulfurasItem",3, 5);
        sulfurasItem.updateQuality();
        assertTrue(sulfurasItem.getQuality() == 5);
        sulfurasItem.updateQuality();
        assertTrue(sulfurasItem.getQuality() == 5);
    }
}