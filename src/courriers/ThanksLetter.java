package courriers;

public class ThanksLetter extends SimpleLetter {

	public ThanksLetter(Inhabitant sender, Inhabitant receiver, String content) {
		super(sender, receiver, content);
	}

	public String toString() {
		return "thanks letter";
	}
}
