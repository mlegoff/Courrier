package courriers;

public abstract class TestAbstractLetterDecorator<T extends Letter<?>> extends Letter<T> {

	public TestAbstractLetterDecorator(T content, Inhabitant receiver,
			Inhabitant sender) {
		super(content, receiver, sender);
	}

}
