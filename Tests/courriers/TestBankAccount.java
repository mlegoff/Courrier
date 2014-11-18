package courriers;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestBankAccount {

	@Test
	public void TestConstructeur() {
		BankAccount b;
		b = new BankAccount("Roger");
		assertNotNull(b);
	}

	@Test
	public void TestGetAccount() {
		BankAccount b = new BankAccount("Roger");
		assertEquals(100, b.getAccount());
	}

	@Test
	public void TestCedit() {
		BankAccount b = new BankAccount("Roger");
		b.credit(100);
		assertEquals(200, b.getAccount());
		b.credit(-100);
		assertEquals(200, b.getAccount());
	}

	@Test
	public void TestDebit() {
		BankAccount b = new BankAccount("Roger");
		b.debit(100);
		assertEquals(0, b.getAccount());
		b.debit(100);
		assertEquals(0, b.getAccount());
	}

}
