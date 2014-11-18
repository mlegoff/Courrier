package courriers;

public class Money extends AbstractContent<Integer> {

	public Money(Integer value) {
		super(value);

	}

	public String toString() {
		return "a money content (" + this.getValue() + ")";
	}

}
