package class04;

import org.testng.annotations.*;

public class Annotations02 {

    @BeforeTest
    public void beforeTest() {
        System.out.println("I'm before test");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("I'm before class");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("I'm after class");
    }

    @BeforeMethod
    public void before(){
        System.out.println("I'm before method");
    }
    @AfterMethod
    public void after(){
        System.out.println("I'm after method");
    }
    @Test
    public void TestA(){
        System.out.println("I'm a test A");
    }
    @Test
    public void TestB(){
        System.out.println("I'm a test B");
    }
}
