import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class DVDTest {

	@Test
	void testConstructor1() {
		ArrayList<String> scenes = new ArrayList<>();
		DVD test1 = new DVD("test movie", 4, scenes);
		assertEquals("test movie", test1.getTitle());
	}
	
	@Test
	void testConstructor2() {
		ArrayList<String> scenes = new ArrayList<>();
		DVD test2 = new DVD("test movie", 4, scenes);
		assertEquals(4, test2.getRunTime());
	}

}
