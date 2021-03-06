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
			System.out.println("\nWhich scene of the DVD " + getTitle());
			System.out.print("Would you like to watch? Select 0 to " + (getScenes().size() - 1) + ": ");
			try {
				scene = scnr.nextInt();
			}catch(Exception e) {
				scnr.next(); 
				System.out.println("Invalid input recieved, try again:");
			}
			
			
		}while(scene == -1);
		
		System.out.println("\nScene " + scene + ": " + getScenes().get(scene));
	}
	
}
