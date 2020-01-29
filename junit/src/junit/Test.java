package junit;

import static org.junit.Assert.*;

public class Test {

	@org.junit.Test
	public void test() {
		First f=new First();
		boolean x= f.primenum(9);
		assertEquals(x,true);
	}

}
