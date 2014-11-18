package courriers;

public class TestPromissoryNote extends TestLetter<Money> {

	@Override
	public Letter<Money> createLetter() {
		City c = new City("Ytic");
		return new PromissaryNote(new Inhabitant("Jean", c), new Inhabitant(
				"Jean", c), 10);
	}

	@Override
	public void TestGetSender() {

	}

	@Override
	public void TestGetReceiver() {

	}

	@Override
	public void TestGetContent() {

	}

	@Override
	public void TestAction() {

	}

	@Override
	public void TestGetCost() {

	}

}
