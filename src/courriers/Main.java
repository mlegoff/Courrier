package courriers;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		System.out.println("Creating L.A city");
		City c = new City("L.A");
		System.out.println("Creating 100 inhabitants");
		for (int i = 0; i < 100; i++) {
			c.addHabitant(new Inhabitant("inhabitant-" + i, c));
		}

		List<Inhabitant> inhabitants = c.getInhabitants();

		System.out.println("Day 1 :") ;
		SimpleLetter l = new SimpleLetter(inhabitants.get(0), inhabitants.get(1), "Coucou") ;
		inhabitants.get(0).postsLetter(l) ;

		PromissaryNote p = new PromissaryNote(inhabitants.get(10), inhabitants.get(11), 100) ;
		inhabitants.get(10).postsLetter(p) ;
		
		
		
		System.out.println("Day 2 :") ;

		System.out.println("Day 3 :") ;
	}

}
