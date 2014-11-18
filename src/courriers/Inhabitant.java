package courriers;

public class Inhabitant {

	private BankAccount account;
	private City city;
	private String name;

	public Inhabitant(String n, City c) {
		this.city = c;
		this.name = n;
		BankAccount bank = new BankAccount(name);
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
		System.out.println("-> " + this.name + " mails " + le.toString()
				+ " to " + le.getReceiver().toString() + " for a cost of "
				+ le.getCost());
		this.account.debit(le.getCost());

	}

	@SuppressWarnings("rawtypes")
	public void receivesLetter(Letter le) {
		System.out.println("<- " + this.name + " receives " + le.toString()
				+ " from " + le.getSender().toString());
		le.action();
	}

	public String toString() {
		return this.name;
	}

}
