package courriers;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestBankAccount {

	@Test
	public void TestConstructeur() {
		BankAccount b;
		b = new BankAccount();
		assertNotNull(b);
		assertEquals(BankAccount.DEFAULT_AMOUNT, 
	}

}
