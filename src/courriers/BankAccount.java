package courriers;

public class BankAccount {

	private int account;
	public static final int DEFAULT_AMOUNT = 100;

	public BankAccount() {
		account = DEFAULT_AMOUNT;
	}

	public void credit(int a) {
		if (a > 0) {
			this.account += a;
		}
	}

	public void debit(int a) {
		if (a > 0) {
			if ((this.account - a) < 0) {
				this.account = 0;
			} else {
				this.account -= a;
			}
		}
	}

	public int getAccount() {
		return this.account;
	}

}
