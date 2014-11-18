package courriers;

public class Inhabitant {

	private BankAccount account;
	private City city;
	private String name;

	public Inhabitant(String n, City c) {
		this.city = c;
		this.name = n;
		BankAccount bank = new BankAccount();
		this.account = bank;
	}

	public BankAccount getAccount() {
		return this.account;
	}

	public City getCity() {
		return this.city;
	}

	@SuppressWarnings("rawtypes")
	public void postsLetter(Letter le) {
		this.city.sendLetter(le);
		this.account.debit(le.getCost());
		System.out.println(this.name + " mails a " + le.toString()
				+ " whose content is a " + le.getContent().toString() + " to"
				+ le.getReceiver().toString() + " for a cost of "
				+ le.getCost() + " -" + le.getCost()
				+ " euros are debited from " + this.name
				+ " account whose balance is now "
				+ this.getAccount().getAccount());

	}

	@SuppressWarnings("rawtypes")
	public void receivesLetter(Letter le) {
		System.out.println(this.name + " receives a " + le.toString()
				+ " whose content is a " + le.getContent().toString() + " from"
				+ le.getSender().toString());
		le.action();
	}

	public String toString() {
		return this.name;
	}

}
