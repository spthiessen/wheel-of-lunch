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
		String versionNumber = "0.0.3";
		String appName = "Wheel of Lunch";
		
		//Pick which restaurant list to use
		
		String[] restListChoices = {"Prince Albert", "IMS"};
		
		String restList = (String) JOptionPane.showInputDialog(null, "Which List Would You Like to Use?",
				appName, JOptionPane.QUESTION_MESSAGE, null,
				restListChoices,
				restListChoices[1]);
		
		String userSelection;
		
		if (restList == "IMS"){
			userSelection = "http://www.nekec.com/wheel-of-lunch/imsrestfile.txt";
		} else{
			userSelection = "http://www.nekec.com/wheel-of-lunch/parestfile.txt";
		}
		
		//The list of restaurants
		ArrayList<String> restaurant = new ArrayList<String>();

		//Load the external file containing the list of restaurants
		URL url = new URL (userSelection);
		
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
		
		WheelOfLunch.infoBox("Wheel of Lunch, Version " + versionNumber + "\nWe are using the " + restList + " list of restaurants\nThere are " + listLength + " restaurants in our list\nLet's eat at "+ restaurant.get(lunch) +".", appName);

	}

}