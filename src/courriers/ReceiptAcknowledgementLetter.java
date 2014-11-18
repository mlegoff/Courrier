package courriers;

public class ReceiptAcknowledgementLetter extends SimpleLetter {

	public ReceiptAcknowledgementLetter(Inhabitant sender, Inhabitant receiver,
			String content) {
		super(sender, receiver, content);
	}

	public String toString() {
		return "receipt acknowledgement letter";
	}

}
