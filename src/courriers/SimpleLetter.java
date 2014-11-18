package courriers;

public class SimpleLetter extends Letter<Text> {

	protected final int DEFAULT_COST = 2;

	public SimpleLetter(Inhabitant sender, Inhabitant receiver, String content) {
		super(new Text(content), receiver, sender);
	}

	public int getCost() {

		return 0;
	}

	public void action() {

	}

	public String toString() {

		return content.toString();
	}

}
