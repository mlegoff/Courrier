package courriers;

public class PromissaryNote extends Letter<Money> {

	protected final int DEFAULT_COST = 1;
	
	
 {
		super(new Money(content), receiver, sender);
	}

	public int getCost() {
		int cost = 1 + (int) (this.content.getValue())/100;
		return  cost;
	}
	
	public void action() {
		int money = (int) this.content.getValue();
		this.receiver.getAccount().credit(money);
		String th = "Thank you";
		Letter thank = new ThanksLetter(this.receiver,this.sender,th);
		this.receiver.postsLetter(thank);
		
	}
	
	public String toString() {
	
		return receiver.toString() + " " + content.toString() + " " + sender.toString() ;
	}
	
}
