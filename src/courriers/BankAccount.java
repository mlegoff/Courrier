package courriers;

public class BankAccount {

	private int account;
	private static final int DEFAULT_AMOUNT = 100 ;

	public BankAccount() {

	}

	public void credit(int a) {
		this.account += a;
	}

	public void debit(int a) {
		if ((this.account- a) < 0) {
			this.account= 0;
		} else {
			this.account -= a;
		}
	}
	
	public int getAccount(){
		return this.account;
	}
	
		

}
