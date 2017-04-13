import java.util.*;
import java.io.*;
import javax.swing.*;
import java.net.*;

public class WheelOfLunch {
	
	public static void infoBox(String infoMessage, String titleBar)
    {
        JOptionPane.showMessageDialog(null, infoMessage, "InfoBox: " + titleBar, JOptionPane.INFORMATION_MESSAGE);
    }

	public static void main(String[] args) throws FileNotFoundException, MalformedURLException, IOException {
		// TODO Auto-generated method stub
		
		//Version Number
		String versionNumber = "0.0.2b";
		
		//The list of restaurants
		ArrayList<String> restaurant = new ArrayList<String>();

		//Load the external file containing the list of restaurants
		URL url = new URL ("http://www.nekec.com/wheel-of-lunch/restfile.txt");
		
		URLConnection conn = url.openConnection();

		BufferedReader br = new BufferedReader (
				new InputStreamReader (conn.getInputStream() ) );
		
		String inputLine;
		
		while ((inputLine = br.readLine()) != null) {
			restaurant.add(inputLine);
		}
		
		
		int listLength = restaurant.size();
		
		// Pick the restaurant to eat at
		Random random = new Random();
		int lunch = random.nextInt(listLength);
		
		//Display all the information
		WheelOfLunch.infoBox("Wheel of Lunch, Version " + versionNumber + ".", "What Version are we Running?");
		WheelOfLunch.infoBox("Generating list of restaurants from " + url + ".", "Where is the List?");
		WheelOfLunch.infoBox("There are " + listLength + " restaurants in our list.", "How Many Restarants?");
		WheelOfLunch.infoBox("Let's eat at "+ restaurant.get(lunch) +".", "Where To Eat!");
		
	}

}