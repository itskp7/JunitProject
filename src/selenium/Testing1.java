package selenium;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Testing1 {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("before class");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("after class");	
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("before");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("after");
	}

	@Test
	public void test1() {
		//System.out.println("login");
		System.out.println("test1");     // if this test in this line fails then the next line will fail
		//System.out.println("logout");  // which will fail the test, but will also fail the rest of tests bcz its logged in
	}                                    // so we will have to keep login in @before and logout in @after so that other will 
	                                     // not fail bcz its logged in (THE WEBSITE IS SAME FOR THE COMPANY we are working, NO DIFF WEBSITES)
	@Test
	public void test2() {
		//System.out.println("login");
		System.out.println("test2");
		//System.out.println("logout");
	}
	
	@Test
	public void test3() {
		//System.out.println("login");
		System.out.println("test3");
		//System.out.println("logout");
	}

}
