package selenium;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)  // this is name ascending like a, b, c
public class Testing3 {
	
	
	@Rule                                              // TYPED AND IMPORT
	public ErrorCollector err = new ErrorCollector();  // TYPED BY HAND  // THIS is object being made and placed under @Rule

	@Test
	public void test6() {
		String actual = "abc";
		String expected = "abc1";
		/*if(actual.equals(expected)) {  // this only prints in the console (and there is no need to print in console)
			System.out.println("pass");  // that pass or fail
		}else {                          // here it will print fail but actually its green pass
			System.out.println("fail");
		}*/
		System.out.println("before 1st Assert");
		Assert.assertEquals(expected, actual);  // this is simple and instead of writing the if-else loop
		System.out.println("after 1st Assert"); // also it will be red and test will also fail ( no need to print in console)
		Assert.assertTrue(2>3);
		System.out.println("after 2nd Assert");   // bcz at line 21 it fails it wont print / run anything below in that test
	}
	
	@Test
	public void test7() {
		String actual = "abc";
		String expected = "abc";
		System.out.println("before 1st Assert");
		try {
		Assert.assertEquals(expected, actual); 
		}catch(Throwable t) {
			System.out.println("I am in first catch");
			err.addError(t);
		}
		System.out.println("after 1st Assert"); // WHILE WORKING FOR COMPANY THIS IS HOW IT SHOULD WORK if the 
		try {
		Assert.assertTrue(2>3);               // test 6 fails the code should execute the next test
		}catch(Throwable t) {
			System.out.println("I am in second catch");
			err.addError(t);
		}
		System.out.println("after 2nd Assert");
	
	}
	

}
