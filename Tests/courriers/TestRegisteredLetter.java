package courriers;

import static org.junit.Assert.*;


import org.junit.Test;

public class TestRegisteredLetter<T extends TestLetter<?>> extends
		TestAbstractLetterDecorator<T> {

	private int numberOfLetterSent = 0;

	@Test
	public void receiverSendsAknowledgement() throws Exception {
		assertEquals(0, receiver.numberOfLetterSent);
		createLetter().action() ;
		assertEquals(0, receiver.numberOfLetterSent);

	}

}
