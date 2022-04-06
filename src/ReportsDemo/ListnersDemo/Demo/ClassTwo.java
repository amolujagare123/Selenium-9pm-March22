package ReportsDemo.ListnersDemo.Demo;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ClassTwo {


    @Test
    public void classTwoTest1()
    {

        System.out.println("classTwoTest1");
    }

    @Test
    public void classTwoTest2()
    {
        System.out.println("classTwoTest2");
        Assert.assertEquals(true,false,"this test is failed");
    }

    @Test
    public void classTwoTest3()
    {
        System.out.println("classTwoTest3");
    }
}
