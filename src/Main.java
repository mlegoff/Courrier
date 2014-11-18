import java.util.List;

import courriers.*;

public class Main {

	public static void main(String[] args) {
		City c = new City("L.A");
		System.out.println("Creating " + c.toString() + " city");
		System.out.println("Creating 100 inhabitants");
		for (int i = 0; i < 100; i++) {
			c.addHabitant(new Inhabitant("inhabitant-" + i, c));
		}

		List<Inhabitant> inhabitants = c.getInhabitants();

		System.out.println("Day 1 :");
		inhabitants.get(20).getAccount().credit(2000) ;
		SimpleLetter l = new SimpleLetter(inhabitants.get(0),inhabitants.get(1), "Coucou");
		inhabitants.get(0).postsLetter(l);

		PromissaryNote p = new PromissaryNote(inhabitants.get(10),inhabitants.get(11), 100);
		inhabitants.get(10).postsLetter(p);

		UrgentLetter<PromissaryNote> UPL = new UrgentLetter<PromissaryNote>(new PromissaryNote(inhabitants.get(20), inhabitants.get(21),1000));
		inhabitants.get(20).postsLetter(UPL);

		System.out.println("Day 2 :");
		inhabitants.get(30).getAccount().credit(2000) ;
		
		System.out.println("Beginning of distribution :");
		
		c.distributeLetters();
		
		System.out.println("End of distribution :");
		
		RegisteredLetter<PromissaryNote> RPL = new RegisteredLetter<PromissaryNote>(new PromissaryNote(inhabitants.get(30), inhabitants.get(31),1000)) ;
		inhabitants.get(30).postsLetter(RPL);

		System.out.println("Day 3 :");
		System.out.println("Beginning of distribution :");
		
		c.distributeLetters();
		
		System.out.println("End of distribution :");
		
		System.out.println("Day 4 :");
		System.out.println("Beginning of distribution :");
		
		c.distributeLetters();
		
		System.out.println("End of distribution :");
		
	}

}
