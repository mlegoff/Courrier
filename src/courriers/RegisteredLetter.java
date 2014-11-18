package courriers;

public class RegisteredLetter<T extends Letter<?>> extends
		AbstractLetterDecorator<T> {

	private int DEFAULT_TAX = 15;

	public RegisteredLetter(T letter) {
		super(letter);
	}

	public void action() {
		ReceiptAcknowledgementLetter receipt = new ReceiptAcknowledgementLetter(
				this.receiver, this.sender, "Acknowledged");
		this.sender.getCity().sendLetter(receipt);
		content.action();
	}

	public String toString() {
		return "a registered letter whose content is " + content.toString() ;
	}

	public int getCost() {
		return this.content.getCost() + this.DEFAULT_TAX;
	}
}
