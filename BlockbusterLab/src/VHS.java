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
		if(currentTime > getScenes().size()-1) {
			rewind();
		}
		System.out.println("VHS " + getTitle());
		System.out.println("Scene " + currentTime + ": " + getScenes().get(currentTime));
		currentTime++;
		
	}
	
	public void rewind() {
		currentTime = 0;
	}
	
	public int getCurrentTime() {
		return currentTime;
	}
	
	public void setCurrentTime(int currentTime) {
		this.currentTime = currentTime;
	}
}
