package class01;

import org.testng.annotations.Test;

public class enableDisable {
    @Test (enabled = false)
    public void Atest() {
        System.out.println("i'm testA");
    }

    @Test
    public void Btest() {
        System.out.println("i'm testB");
    }
}
