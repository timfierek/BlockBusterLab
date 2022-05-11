import java.util.ArrayList;

/**
 * VHS is a child class of Movie and incorporates new methods along with the provided
 * ones from Movie.
 * 
 * @author Tim Fierek
 *
 */
public class VHS extends Movie{

	private int currentTime;
	
	public VHS(String title, int runTime, ArrayList<String> scenes) {
		super(title, runTime, scenes);
		currentTime = 0;
	}
	
	@Override
	public void play() {
		System.out.println("Scene " + currentTime + ": " + getScenes().get(currentTime));
		currentTime++;
		if(currentTime > getRunTime()-1) {
			rewind();
		}
	}
	
	private void rewind() {
		currentTime = 0;
	}
}
