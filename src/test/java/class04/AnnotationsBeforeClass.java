package class04;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AnnotationsBeforeClass {
    @BeforeClass
    public void hello(){
        System.out.println("I'm before class");
    }
    @Test
    public void testB(){
        System.out.println("I'm TestB");
    }

}
