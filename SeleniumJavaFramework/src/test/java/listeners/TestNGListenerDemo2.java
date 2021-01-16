package listeners;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//import com.aventstack.extentreports.util.Assert;

@Listeners(listeners.TestNGListener.class)
public class TestNGListenerDemo2 {
	@Test
	public void test4()
	{
		System.out.println("I am inside test4");
	}
	@Test
	public void test5()
	{
		System.out.println("I am inside test5");
	   // Assert.assertTrue(false)
	}
	@Test
	public void test6()
	{
		System.out.println("I am inside test6");
	}


}
