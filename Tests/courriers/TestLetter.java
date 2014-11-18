package courriers;

public abstract class TestLetter<T extends Content> implements Content {

	public abstract Letter<?> createLetter();
	
}
