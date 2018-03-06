import static org.junit.Assert.*;

import org.junit.Test;

import fr.frg.tunisien.TranslateService;
import fr.frg.tunisien.RegExMatcher;

public class DiccoTest {

	@Test
	public void test() {
		TranslateService.load();
	}

	
	@Test
	public void testRegExBuilder() {
		assertEquals("(((a)|(3))|(3a))",RegExMatcher.buildRegex("a","3","3a"));
	}
}
