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

}
