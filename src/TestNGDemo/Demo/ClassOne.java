package TestNGDemo.Demo;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ClassOne {

    @BeforeTest
    public void beforeMyTest()
    {
        System.out.println("beforeMyTest");
    }
    @AfterTest
    public void afterMyTest()
    {
        System.out.println("afterMyTest");
    }

    @Parameters({"myUrl","username","password"})
    @Test
    public void classOneTest1(String s1,String s2,String s3)
    {
        System.out.println("url="+s1);
        System.out.println("username="+s2);
        System.out.println("password="+s3);
        System.out.println("classOneTest1");

    }

    @Test (groups = "email") /*(enabled = false)*/
    public void classOneTest2()
    {
        System.out.println("classOneTest2");
    }

    @Test
    public void classOneTest3()
    {
        System.out.println("classOneTest3");
    }
}
