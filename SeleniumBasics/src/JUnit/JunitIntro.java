package JUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

// Please change the extension of the files to .java before running them
// Udemy has stopped supporting .java file and I have to change the extension before uploading them to udemy
public class JunitIntro {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Executed before class...");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("Executed after class...");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("Executed before...");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Executed after...");
	}

	@Test
	public void test1() {
		System.out.println("Executed Test1...");
	}

	@Test
	public void test2() {
		System.out.println("Executed Test2...");
	}
}
