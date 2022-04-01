package TestNGDemo.Demo;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ClassTwo {

    @Parameters({"myUrl","username","password"})
    @Test
    public void classTwoTest1(String s1,String s2,String s3)
    {
        System.out.println("url="+s1);
        System.out.println("username="+s2);
        System.out.println("password="+s3);
        System.out.println("classTwoTest1");
    }

    @Test (groups = "email")
    public void classTwoTest2()
    {
        System.out.println("classTwoTest2");
    }

    @Test
    public void classTwoTest3()
    {
        System.out.println("classTwoTest3");
    }
}
