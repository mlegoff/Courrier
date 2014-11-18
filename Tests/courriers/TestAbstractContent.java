package courriers;

import static org.junit.Assert.*;

import org.junit.Test;

public abstract class TestAbstractContent<T> implements Content {

	public abstract AbstractContent<T> createContent();

	@Test
	public void TestConstruction() {
		AbstractContent<T> abc = createContent();
		assertNotNull(abc);
	}

	@Test
	public abstract void TestGetValue() ;

	
}