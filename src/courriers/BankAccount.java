package courriers;

public class BankAccount {

	private int account;
	private static final int DEFAULT_AMOUNT = 100;
	private String owner;

	public BankAccount(String name) {
		account = DEFAULT_AMOUNT;
		owner = name;
	}

	public void credit(int a) {
		if (a > 0) {
			this.account += a;
		}
		System.out.println("\t+ " + owner + " account is credited with " + a + " euros; its balance is now " + account + " euros ") ;
	}

	public void debit(int a) {
		if (a > 0) {
			if ((this.account - a) < 0) {
				this.account = 0;
			} else {
				this.account -= a;
			}
		}
		System.out.println("\t- " + a + " euros are debited from " + owner
				+ " account whose balance is now " + account);
	}

	public int getAccount() {
		return this.account;
	}

}
