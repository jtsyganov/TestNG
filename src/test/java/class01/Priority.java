package class01;

import org.testng.annotations.Test;

public class Priority {
    @Test(priority = 3)
    public void Atest(){
        System.out.println("i'm testA");
    }
    @Test(priority = 1)
    public void Btest(){
        System.out.println("i'm testB");
    }
    @Test
    public void Ctest(){
        System.out.println("i'm testC");
    }
}
