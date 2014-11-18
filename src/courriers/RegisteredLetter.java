package courriers;

public class RegisteredLetter <T extends Letter<?>> extends AbstractLetterDecorator<T>{
	
	private int DEFAULT_TAX;

	public RegisteredLetter(T letter) {
		super(letter);
	}
	
	public void action() {
		Letter receipt = new ReceiptAcknowledgementLetter(this.receiver,this.sender,"courrier reçu");
		this.receiver.
		
	}
	
	public String toString() {
		return "";
	}
	
	public int getCost(){
		return this.content.getCost()+this.DEFAULT_TAX;
	}
}
