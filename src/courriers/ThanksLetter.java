package courriers;

public class ThanksLetter extends SimpleLetter {

	public ThanksLetter(Inhabitant sender, Inhabitant receiver, String content) {
		super(sender, receiver, content);
	}

	public String toString() {
		return "a thanks letter whose content is " + content.toString();
	}
}
