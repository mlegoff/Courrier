package courriers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class TestText extends TestAbstractContent<String> {

	@Override
	public AbstractContent<String> createContent() {
		return new Text("TEST");
	}
	
	@Override
	@Test
	public void TestGetValue() {
		String s = new String("Roger") ;
		Text abc = new Text(s);
		assertNotNull(abc.getValue()) ;
		assertEquals(s, abc.getValue());
	}
}
