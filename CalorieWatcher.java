

import java.util.Scanner;

public class CalorieWatcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//40/10, 4/300 = 75
		//each cookie is 75 calories
		
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("How many cookies did you eat: ");
		int cookies =keyboard.nextInt();
		
		keyboard.close();
		int calories = cookies * 75;
		
		System.out.println("Calories: "+ calories);
		
	}

}
