package courriers;

public abstract class AbstractLetterDecorator<T extends Letter<?>> extends
		Letter<T> {

	public AbstractLetterDecorator(T letter) {
		super(letter, letter.getReceiver(), letter.getSender());
	}

	public abstract void action();

	public abstract String toString();

}
