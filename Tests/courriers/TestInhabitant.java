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

		RegisteredLetter<SimpleLetter> RSL = new RegisteredLetter<SimpleLetter>(
				s);
		accountBefore = i.getAccount().getAccount();
		i.postsLetter(RSL);
		assertEquals(accountBefore - RSL.getCost(), i.getAccount().getAccount());

		UrgentLetter<SimpleLetter> USL = new UrgentLetter<SimpleLetter>(s);
		accountBefore = i.getAccount().getAccount();
		i.postsLetter(USL);
		assertEquals(accountBefore - USL.getCost(), i.getAccount().getAccount());

		PromissaryNote pn = new PromissaryNote(i, j, 10);
		accountBefore = i.getAccount().getAccount();
		i.postsLetter(pn);
		assertEquals(accountBefore - pn.getCost(), i.getAccount().getAccount());
		accountBefore = accountBefore - pn.getCost();
		i.getCity().distributeLetters();

		assertEquals(accountBefore - pn.getContent().getValue().intValue(), i
				.getAccount().getAccount());

	}

	@Test
	public void TestReceiveLetter() {

		City c = new City("BernardTown");
		Inhabitant i = new Inhabitant("Bernard", c);
		Inhabitant j = new Inhabitant("Arthur", c);
		PromissaryNote pn = new PromissaryNote(i, j, 10);
		int accountBefore = j.getAccount().getAccount();

		i.postsLetter(pn);
		c.distributeLetters();

		assertEquals(accountBefore + pn.getContent().getValue().intValue() - 1,
				j.getAccount().getAccount());
		assertFalse(c.getLetterbox().isEmpty()) ;
	}

}
