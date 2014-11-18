package courriers;

public class PromissaryNote extends Letter<Money> {

	protected final int DEFAULT_COST = 1;

	public PromissaryNote(Inhabitant sender, Inhabitant receiver, int content) {
		super(new Money(content), receiver, sender);
	}

	public int getCost() {
		return DEFAULT_COST + (this.content.getValue().intValue()) / 100;
	}

	public void action() {
		int money = this.content.getValue().intValue();
		this.receiver.getAccount().credit(money);
		String th = "Thank you";
		ThanksLetter thank = new ThanksLetter(this.receiver, this.sender, th);
		this.receiver.postsLetter(thank);
	}

	public String toString() {
		return "promissary note";
	}

}
