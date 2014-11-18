package courriers;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestInhabitant {

	@Test
	public void TestConstruction() {
		City c = new City("BernardTown");
		Inhabitant i = new Inhabitant("Bernard", c);
		assertNotNull(i);
	}

	@Test
	public void TestGetCity() {
		City c = new City("BernardTown");
		Inhabitant i = new Inhabitant("Bernard", c);
		assertNotNull(i.getCity());
		assertEquals(c, i.getCity());
	}

	@Test
	public void TestGetAccount() {
		City c = new City("BernardTown");
		Inhabitant i = new Inhabitant("Bernard", c);
		Inhabitant j = new Inhabitant("Arthur", c);
		assertNotNull(i.getAccount());
		assertNotEquals(j.getAccount(), i.getAccount());
	}

	@Test
	public void TestPostLetter() {
		City c = new City("BernardTown");
		Inhabitant i = new Inhabitant("Bernard", c);
		Inhabitant j = new Inhabitant("Arthur", c);
		SimpleLetter s = new SimpleLetter(i, j, "Coucou");
		int accountBefore = i.getAccount().getAccount();

		i.postsLetter(s);

		assertEquals(accountBefore - s.getCost(), i.getAccount().getAccount());
	}

	@Test
	public void TestReceiveLetter() {
		/*
		City c = new City("BernardTown");
		Inhabitant i = new Inhabitant("Bernard", c);
		Inhabitant j = new Inhabitant("Arthur", c);
		SimpleLetter s = new SimpleLetter(i, j, "Coucou");
		PromissaryNote pn = new PromissaryNote(i, j, 10);
		int accountBefore = i.getAccount().getAccount();

		i.postsLetter(s);

		assertEquals(accountBefore - s.getCost(), i.getAccount().getAccount());
		*/

	}

}
