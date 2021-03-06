import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class VHSTest {

	@Test
	void testConstructor1() {
		ArrayList<String> scenes = new ArrayList<>();
		VHS test1 = new VHS("test movie", 4, scenes);
		assertEquals("test movie", test1.getTitle());
	}
	
	@Test
	void testConstructor2() {
		ArrayList<String> scenes = new ArrayList<>();
		VHS test2 = new VHS("test movie", 4, scenes);
		assertEquals(4, test2.getRunTime());
	}
	
	@Test
	void testConstructor3() {
		ArrayList<String> scenes = new ArrayList<>();
		VHS test3 = new VHS("test movie", 4, scenes);
		assertNotNull(test3.getScenes());
	}
	
	@Test
	void testConstructor4() {
		ArrayList<String> scenes = new ArrayList<>();
		VHS test4 = new VHS("test movie", 4, scenes);
		assertEquals(0, test4.getCurrentTime());
	}
	
	@Test
	void testPlay() {
		ArrayList<String> scenes = new ArrayList<>();
		scenes.add("scene 1");
		scenes.add("scene 2");
		scenes.add("scene 3");
		scenes.add("scene 4");
		VHS test5 = new VHS("test movie", 4, scenes);
		test5.play();
		assertEquals(1, test5.getCurrentTime());
	}
	
	@Test
	void testRewind() {
		ArrayList<String> scenes = new ArrayList<>();
		scenes.add("scene 1");
		scenes.add("scene 2");
		scenes.add("scene 3");
		scenes.add("scene 4");
		VHS test6 = new VHS("test movie", 4, scenes);
		test6.play();
		test6.play();
		test6.rewind();
		assertEquals(0, test6.getCurrentTime());
	}
	
	@Test
	void testAutoRewind() {
		ArrayList<String> scenes = new ArrayList<>();
		scenes.add("scene 1");
		scenes.add("scene 2");
		scenes.add("scene 3");
		scenes.add("scene 4");
		VHS test7 = new VHS("test movie", 4, scenes);
		test7.play();
		test7.play();
		test7.play();
		test7.play();
		assertEquals(0, test7.getCurrentTime());
	}
	
	

}
