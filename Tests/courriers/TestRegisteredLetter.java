package courriers;

public class TestRegisteredLetter<T extends TestLetter<?>> extends
		TestAbstractLetterDecorator<T> {

	public TestRegisteredLetter(T content, Inhabitant receiver,
			Inhabitant sender) {
		super(content, receiver, sender);
		// TODO Stub du constructeur généré automatiquement
	}

}
