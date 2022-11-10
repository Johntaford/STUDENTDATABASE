import java.util.*;

public class StudentsDBA {

	public static void main(String[] args) {
		System.out.println("Welcome to our Java class.  Which student would you like to learn more about? (enter a number 1-10: ");
		Scanner scan = new Scanner(System.in);
		
		int UserInput = scan.nextInt();
		
		String [] students = new String [10];
		String [] hometown = new String [10];
		String [] food = new String [10];
		String answer;
		
		students[0] = "Jack";
		students[1] = "Marlee";
		students[2] = "Samantha";
		students[3] = "Travis";
		students[4] = "Jacob";
		students[5] = "Carla";
		students[6] = "Ciara";
		students[7] = "Ian";
		students[8] = "Janet";
		students[9] = "Troy";
		
		hometown[0] = "Grand Rapids";
		hometown[1] = "Miamis";
		hometown[2] = "New York";
		hometown[3] = "Dallas";
		hometown[4] = "Rochester";
		hometown[5] = "Royal Oak";
		hometown[6] = "Memphis";
		hometown[7] = "Novi";
		hometown[8] = "DearBorn";
		hometown[9] = "Bloomfield";
		
		food[0] = "Mango";
		food[1] = "Peaches";
		food[2] = "Pasta";
		food[3] = "Pizza";
		food[4] = "Grapes";
		food[5] = "Oranges";
		food[6] = "Chicken";
		food[7] = "Tacos";
		food[8] = "Salads";
		food[9] = "Apples";
		
		do {
			
		
		
		
		try { 
			
			String DBA = students[UserInput];
		} catch (IndexOutOfBoundsException e) {
			System.out.println("That student does not exist.  Please try again. (enter a number 1-10): ");
			UserInput = scan.nextInt();
		}
		
		System.out.println("Student " + UserInput + " is " + students[UserInput - 1] + " What would you like to know about " + students[UserInput - 1] + "? (enter hometown or favorite Food): ");
		
		String input = scan.next();
		
		if(input.equalsIgnoreCase("hometown")) {
			System.out.println(students[UserInput-1] + " hometown is " + hometown[UserInput - 1] + " would you like to learn more? (yes/on)");
			String choice = scan.next();
			if (choice.equalsIgnoreCase("yes")) {
					System.out.println(students[UserInput-1] + " from " + hometown + " favorite food is " + food);
				}
			
			else if(input.equalsIgnoreCase("favorite food")) {
			System.out.println(students[UserInput-1] + " favorite food is " + food + "would you like to learn more? (yes/on)");
			String choice2 = scan.next();
			if (choice.equalsIgnoreCase("yes")) {
					System.out.println(students[UserInput-1] + " is from " + hometown);
			}
			
		}
			
	}
		System.out.println("would you like to learn about another student? (yes/no)");
		answer = scan.next();
		
		}while (answer.equalsIgnoreCase("Yes"));
		System.out.println("Have a Good day!");
}
}