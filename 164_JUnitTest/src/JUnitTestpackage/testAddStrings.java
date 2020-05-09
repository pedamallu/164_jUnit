package JUnitTestpackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddStrings {

	@Test
	public void test() {
		
		jUnitTesting ob=new jUnitTesting();
		String ans=ob.addStrings("EB", "05");
		assertEquals("EB05", ans);
	}

}
