package courriers;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestMoney extends TestAbstractContent<Integer> {

	@Override
	public AbstractContent<Integer> createContent() {
		return new Money(100);
	}

	@Override
	@Test
	public void TestGetValue() {
		Integer i = new Integer(100);
		Money abc = new Money(i);
		assertNotNull(abc.getValue());
		assertEquals(i, abc.getValue());
	}

}
