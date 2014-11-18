package courriers;

import static org.junit.Assert.*;

import org.junit.Test;

public abstract class TestLetter<T extends Content> implements Content {

	public abstract Letter<T> createLetter();

	@Test
	public void TestConstruction() {
		Letter<T> l = createLetter();
		assertNotNull(l);
	}
	
	@Test
	public abstract void TestGetSender() ;
	
	@Test
	public abstract void TestGetReceiver() ;
	
	@Test
	public abstract void TestGetContent() ;
	
	@Test
	public abstract void TestAction() ;
	
	@Test
	public abstract void TestGetCost() ;
	
}
