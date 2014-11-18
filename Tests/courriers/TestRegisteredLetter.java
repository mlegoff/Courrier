package courriers;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestRegisteredLetter<T extends TestLetter<?>> extends
		TestAbstractLetterDecorator<T> {

	private int numberOfLetterSent = 0;

	@Test
	public void receiverSendsAknowledgement() throws Exception {
		assertEquals(0, receiver.numberOfLetterSent);
		createLetter().action();
		assertEquals(0, receiver.numberOfLetterSent);
	}

	@Override
	public Letter<T> createLetter() {
		// TODO Stub de la méthode généré automatiquement
		return null;
	}

	@Override
	public void TestGetSender() {
		// TODO Stub de la méthode généré automatiquement

	}

	@Override
	public void TestGetReceiver() {
		// TODO Stub de la méthode généré automatiquement

	}

	@Override
	public void TestGetContent() {
		// TODO Stub de la méthode généré automatiquement

	}

	@Override
	public void TestAction() {
		// TODO Stub de la méthode généré automatiquement

	}

	@Override
	public void TestGetCost() {
		// TODO Stub de la méthode généré automatiquement

	}

}
