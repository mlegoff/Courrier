package courriers;

import java.util.LinkedList;
import java.util.List;

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

	public void distributeLetters() {

	}

	public void sendLetter(Letter letter) {

	}

	public String toString() {

		return "";
	}

}
