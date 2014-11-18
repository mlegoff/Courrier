package courriers;

public class UrgentLetter<T extends Letter<?>> extends
		AbstractLetterDecorator<T> {

	public UrgentLetter(T letter) {
		super(letter);
		// TODO Stub du constructeur g�n�r� automatiquement
	}

	@Override
	public String toString() {
		// TODO Stub de la m�thode g�n�r� automatiquement
		return null;
	}

	@Override
	public void action() {
		sender.getAccount().debit(2 * content.getCost()) ;
	}

}
