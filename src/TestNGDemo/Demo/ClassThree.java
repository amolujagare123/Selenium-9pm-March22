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

    @Parameters({"myUrl","username","password"})
    @Test
    public void classThreeTest1(String s1,String s2,String s3)
    {
        System.out.println("url="+s1);
        System.out.println("username="+s2);
        System.out.println("password="+s3);
        System.out.println("classThree Test1");
    }

    @Test (groups = "email")
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
