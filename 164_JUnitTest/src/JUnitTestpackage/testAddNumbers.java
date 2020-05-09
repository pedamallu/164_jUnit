package JUnitTestpackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddNumbers {

	@Test
	public void test() {
		jUnitTesting ob=new jUnitTesting();
		int ans=ob.addNumbers(10, 15);
		assertEquals(25, ans);
	}

}
