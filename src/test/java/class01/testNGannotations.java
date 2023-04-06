package class01;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testNGannotations {
    @BeforeMethod
    public void beforeMethods(){
        System.out.println("I'm before Method");
    }
    @AfterMethod
    public void afterMethods(){
        System.out.println("I'm after Method");
    }
    @Test (groups = "regression")
    public void aFirstTestCase(){
        System.out.println("I'm the first test case");
    }
    @Test
    public void bSecondTestCase(){
        System.out.println("I'm the second test case");
    }
    @Test
    public void cThirdTestCase(){
        System.out.println("I'm the third test case");
    }
}
