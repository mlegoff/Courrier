package courriers;

public class UrgentLetter<T extends Letter<?>> extends
		AbstractLetterDecorator<T> {

	private Letter<?> l;

	public UrgentLetter(T letter) {
		super(letter);
	}

	public int getCost() {
		return this.l.getCost() * 2;
	}

	public String toString() {
		return "urgent letter";
	}

	public void action() {

	}

}
