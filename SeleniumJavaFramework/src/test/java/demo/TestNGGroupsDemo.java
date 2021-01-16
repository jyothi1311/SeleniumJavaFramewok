package demo;

import org.testng.annotations.Test;

@Test(groups= {"AllclassTests"})
public class TestNGGroupsDemo {
	
	@Test(groups={"windows.regression"})
	public void Test1()
	{
		System.out.println("This is test1");
	}
	
	@Test(groups={"sanity","regression"})
	public void Test2()
	{
		System.out.println("This is test2");
	}
	@Test(groups={"linux.regression"})
	public void Test3()
	{
		System.out.println("This is test3");
	}
	@Test(groups={"sanity","smoke"})
	public void Test4()
	{
		System.out.println("This is test4");
	}

}
