package TestTask1.TestEquipments;

import Task1.Equipments.Fridge;
import org.junit.Assert;
import org.junit.Test;

public class FridgeTest {
    @Test 
    public void Fridge()
    {
        Fridge someFridge = new Fridge();
        Assert.assertNotNull(someFridge);
    }
    

}