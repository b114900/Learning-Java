import java.util.Scanner;

public class User {

	private String name;
	private String birthdate;
	private int id;
	private int input_number;
	
	public String get_name()
	{
		return name;
	}
	
	public String get_birthdate()
	{
		return birthdate;
	}
	
	public int get_id()
	{
		return id;
	}
	
	public int get_input_number()
	{
		return input_number;
	}
	
	
	public User(String User_name, String User_birthdate, int User_id, int User_input_number)
	{
		name = User_name;
		birthdate = User_birthdate;
		id = User_id;
		input_number = User_input_number;
	}
	
	public static User get_user_input()
	{
		String name, birthdate;
		int id, input_number;
		Scanner myObj = new Scanner(System.in);
		
		System.out.println("What is your name?");
		name = myObj.nextLine();
		System.out.println("What is your birthdate?");
		birthdate = myObj.nextLine();
		System.out.println("What is your id?");
		id = myObj.nextInt();
		System.out.println("What number do you like?");
		input_number = myObj.nextInt();
		myObj.close();
		return new User(name, birthdate, id, input_number);
	}
	
	public static void main(String []args)
	{
		User someone;
		someone = get_user_input();
		
		System.out.printf("%-20s %-20s %-10s %-10s \n", "Name", "Birthdate", "ID", "Input_Number");
		System.out.printf("%-20s %-20s %-10d %-10d \n", someone.get_name(), someone.get_birthdate(),
													someone.get_id(),someone.get_input_number());
		
		
	}
}
