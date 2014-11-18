package courriers;

public class UrgentLetter<T extends Letter<?>> extends
		AbstractLetterDecorator<T> {

	public UrgentLetter(T letter) {
		super(letter);
	}

	public int getCost() {
		return this.content.getCost() * 2;
	}

	public String toString() {
		return "an urgent letter whose content is " + content.toString() ;
	}

	public void action() {

	}

}
