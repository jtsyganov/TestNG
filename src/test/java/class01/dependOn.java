package class01;

import org.testng.annotations.Test;

public class dependOn {
    @Test
    public void Login(){
        System.out.println("i'm here");
    }
    @Test (dependsOnMethods = {"Login"})
    public void DashBoardVerifacation(){
        System.out.println("after login I'm verifying the dashboard");
    }
}
