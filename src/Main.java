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
		SimpleLetter l = new SimpleLetter(inhabitants.get(0),inhabitants.get(1), "Coucou");
		inhabitants.get(0).postsLetter(l);

		PromissaryNote p = new PromissaryNote(inhabitants.get(10),inhabitants.get(11), 100);
		inhabitants.get(10).postsLetter(p);

		UrgentLetter<PromissaryNote> UPL = new UrgentLetter<PromissaryNote>(new PromissaryNote(inhabitants.get(20), inhabitants.get(21),1000));
		inhabitants.get(20).postsLetter(UPL);

		System.out.println("Day 2 :");
		c.distributeLetters();
		

		System.out.println("Day 3 :");
	}

}
