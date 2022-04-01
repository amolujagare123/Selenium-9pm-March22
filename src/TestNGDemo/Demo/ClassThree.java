package TestNGDemo.Demo;

import org.testng.annotations.*;

public class ClassThree {

    @BeforeSuite
    public void beforeMySuite()
    {
        System.out.println("beforeMySuite");
    }
    @AfterSuite
    public void afterMySuite()
    {
        System.out.println("afterMySuite");
    }

    @Test
    public void classThreeTest1()
    {
        System.out.println("classThree Test1");
    }

    @Test
    public void classThreeTest2()
    {
        System.out.println("classThreeTest2");
    }

    @Test
    public void classThreeTest3()
    {
        System.out.println("classThreeTest3");
    }
}
