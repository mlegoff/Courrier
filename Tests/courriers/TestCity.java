package courriers;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCity {

	@Test
	public void TestConstruction() {
		City c = new City("Ytic");
		assertNotNull(c);
	}

	@Test
	public void TestGetAddInhabitants() {
		City c = new City("Ytic");
		Inhabitant i = new Inhabitant("Jean", c);
		assertNotNull(c.getInhabitants());
		assertTrue(c.getInhabitants().isEmpty());
		c.addHabitant(i);
		assertFalse(c.getInhabitants().isEmpty());
		assertEquals(i, c.getInhabitants().get(0));
	}

	@Test
	public void TestSendLetter() {
		City c = new City("Ytic");
		Inhabitant i = new Inhabitant("Jean", c);
		SimpleLetter sl = new SimpleLetter(i, i, "TEST");
		assertNotNull(c.getLetterbox());
		assertTrue(c.getLetterbox().isEmpty());
		c.sendLetter(sl);
		assertFalse(c.getLetterbox().isEmpty());
		assertEquals(sl, c.getLetterbox().get(0));
	}

	@Test
	public void TestDistributeLetter() {
		City c = new City("Ytic");
		Inhabitant i = new Inhabitant("Jean", c);
		Inhabitant j = new Inhabitant("Jeanne", c);
		SimpleLetter sl = new SimpleLetter(i, j, "TEST");
		RegisteredLetter<SimpleLetter> RS = new RegisteredLetter<SimpleLetter>(sl);
		PromissaryNote pn = new PromissaryNote(i, j, 1);
		RegisteredLetter<PromissaryNote> RPN = new RegisteredLetter<PromissaryNote>(pn);

		i.postsLetter(sl);
		c.distributeLetters();
		assertTrue(c.getLetterbox().isEmpty());

		i.postsLetter(RS);
		for (int k = 0; k < 2; k++) {
			assertFalse(c.getLetterbox().isEmpty());
			c.distributeLetters();
		}
		assertTrue(c.getLetterbox().isEmpty());

		i.postsLetter(RPN);
		for (int k = 0; k < 2; k++) {
			assertFalse(c.getLetterbox().isEmpty());
			c.distributeLetters();
		}
		assertTrue(c.getLetterbox().isEmpty());

	}

}
