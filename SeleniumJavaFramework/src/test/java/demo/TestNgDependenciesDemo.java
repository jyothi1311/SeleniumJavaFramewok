package demo;

import org.testng.annotations.Test;

public class TestNgDependenciesDemo {
	
	@Test(dependsOnGroups= {"acceptance"}, priority =3)
	public void test1()
	{
		System.out.println("I am inside test1");
	}
	@Test(groups= {"acceptance"})
	public void test2()
	{
		System.out.println("I am inside test2");
	}
	@Test
	public void test3()
	{
		System.out.println("I am inside test3");
	}

}
