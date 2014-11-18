package courriers;

public class Text extends AbstractContent<String> {

	public Text(String string) {
		super(string);
	}

	public String toString() {
		return "a text content (" + this.getValue().toString() + ")";
	}
}
