package courriers;

public class SimpleLetter extends Letter<Text> {

	protected final int DEFAULT_COST = 1;

	public SimpleLetter(Inhabitant sender, Inhabitant receiver, String content) {
		super(new Text(content), receiver, sender);
	}

	public int getCost() {
		return this.DEFAULT_COST;
	}

	public void action() {

	}

	public String toString() {
		return "simple letter";
	}

}
