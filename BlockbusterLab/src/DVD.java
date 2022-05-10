import java.util.ArrayList;
import java.util.Scanner;

/**
 * DVD provides extended functionality from its Movie super class.
 * 
 * @author Tim Fierek
 *
 */
public class DVD extends Movie{

	private static Scanner scnr;
	
	public DVD(String title, int runTime, ArrayList<String> scenes) {
		super(title, runTime, scenes);
		scnr = new Scanner(System.in);
	}
	
	@Override
	public void play() {
		
		int scene = -1;
		
		do {
			System.out.println("Which scene of the DVD " + getTitle());
			System.out.print("Would you like to watch? Select 0 to " + (getRunTime() - 1) + ": ");
			try {
				scene = scnr.nextInt();
				scnr.next(); 
			}catch(Exception e) {
				System.out.println("Invalid input recieved, try again:");
			}
			
			
		}while(scene == -1);
		
		System.out.println("Scene " + scene + ": " + getScenes().get(scene));
	}
	
}
