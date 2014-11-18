package courriers;

import java.util.*;

public class City {

	private List<Inhabitant> inhabitants;
	private List<Letter<?>> letterbox;
	private String name;

	public City(String n) {
		List<Inhabitant> newlist = new LinkedList<Inhabitant>();
		this.name = n;
		this.inhabitants = newlist;
		letterbox = new LinkedList<Letter<?>>();
	}

	public void addHabitant(Inhabitant habitant) {
		this.inhabitants.add(habitant);
	}

	@SuppressWarnings("rawtypes")
	public void distributeLetters() {
		List<Letter<?>> lbTemp = new LinkedList<Letter<?>>() ;
		lbTemp.addAll(letterbox) ;
		for (Letter l : lbTemp) {
			l.getReceiver().receivesLetter(l);
			this.letterbox.remove(l);
		}
	}

	@SuppressWarnings("rawtypes")
	public void sendLetter(Letter letter) {
		this.letterbox.add(letter);
	}

	public String toString() {
		return name;
	}

	public List<Inhabitant> getInhabitants() {
		return inhabitants ;
	}
	
	
	
}
