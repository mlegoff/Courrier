package courriers;

public class Inhabitant {
	
	
	private BankAccount account;
	private City city;
	private String name;
	
	public Inhabitant(String n,City c){
		this.city = c;
		this.name = n;
		BankAccount bank = new BankAccount();
		this.account = bank;
	}

	public BankAccount getAccount(){
		return this.account;
	}
	
	public City getCity(){
		return this.city;
	}
	
	public void postsLetter(Letter le){
		this.city.sendLetter(le);
		this.account.debit(le.getCost());
		
	}
	
	public void receivesLetter(Letter le){
		le.action();
	}
	
	public String toString(){
		return this.name;
	}
	
}
