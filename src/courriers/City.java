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

	}

	public void addHabitant(Inhabitant habitant) {
		this.inhabitants.add(habitant);
	}

	@SuppressWarnings("rawtypes")
	public void distributeLetters() {
		for (Letter l : this.letterbox) {
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

}
