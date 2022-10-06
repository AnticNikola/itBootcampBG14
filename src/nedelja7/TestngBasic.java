package nedelja7;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestngBasic {
    @Test
    public void test1(){
        String testExpected="cao";
        //dohvatanje elementa
        //izvrsavanje neke akcije
        String testActual="cao";
        Assert.assertEquals(testActual,testExpected,"Poruke treba da budu jednake");
    }
}
