import java.util.*;
import java.io.*;

public class WheelOfLunch {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		//Check for the restaurants.txt file
		/*
		if(restaurant.exists()) {
		     log(myfile + " exists. length : " + myfile.length());
		     FileReader fr = new FileReader(restaurant.txt); 
		}
		*/

		
		//The list of restaurants
		ArrayList<String> restaurant = new ArrayList<String>();

		//Scanner Object
		Scanner s = new Scanner(new File("restfile.txt"));
		
		while (s.hasNext() ) {
			restaurant.add(s.nextLine() );
			
		}
		
		s.close();
		
		/*
		restaurant.add("Montana's");
		restaurant.add("Pizza Hut");
		restaurant.add("Venice House on 2nd");
		restaurant.add("Boston's Pizza");
		restaurant.add("McDonald's");
		restaurant.add("Wendy's");
		restaurant.add("Mucho Burrito");
		restaurant.add("Fatburger");
		restaurant.add( "Burger King");
		restaurant.add("Arby's");
		restaurant.add("Mr. Mike's");
		restaurant.add("Aisian Le");
		restaurant.add("Grainfields");
		restaurant.add("Aisa Buffett");
		restaurant.add("Panago");
		restaurant.add("Rusty Owl");
		restaurant.add("Venice Houce on Central");
		restaurant.add("Chicken Chef");
		restaurant.add("Spicy Peppercorn");
		restaurant.add("Vu's Garden");
		restaurant.add("Spice Trail");
		restaurant.add("A&W");
		restaurant.add("Dairy Queen");
		restaurant.add("Taco Time");
		restaurant.add("Extreme Pita");
		restaurant.add("Subway");
		restaurant.add("Quizno's");
		restaurant.add("Mr. Sub");
		restaurant.add("Selena's Donair");
		*/

		int listLength = restaurant.size();
		
		System.out.println("There are " + listLength + " restaurants in our list.");
		
		// Pick the restaurant to eat at
		Random random = new Random();
		int lunch = random.nextInt(listLength);
		
		System.out.println("Let's eat at "+ restaurant.get(lunch) +"." );
		
	}

}