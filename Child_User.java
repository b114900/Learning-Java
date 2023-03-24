import java.util.Scanner;

public class Child_User extends User{

	private int parent_id;
	private int age;
	private String ALIAS;
	
	public Child_User(String name, String birthdate, int ID, int input_number,
					  int parent_id_number ,int child_age) {
		super (name, birthdate, ID, input_number);
		parent_id = parent_id_number;
		age = child_age;
		ALIAS = name;		
	}
	
	public int get_age()
	{
		return age;
	}
	public int get_parent_id()
	{
		return parent_id;
	}
	
	public String get_ALIAS()
	{
		return ALIAS;
	}
	
	public int grow_up()
	{
		if (age >= 17)
		{
			System.out.println("You are an atult, please use a standard account \n");
			return age;
		}
		age += 1;
		System.out.printf("You are not %d years old!\n", age);
		return age;
	}
	
	public void show() //Data with column headers
	{
		System.out.printf("%-20s %-20s %-10s %-15s %-10s %-5s %-10s \n", 
						  "Name", "Birthdate", "ID", "Input_Number", "Parent_ID", "Age", "ALIAS");
		System.out.printf("%-20s %-20s %-10d %-15d %-10d %-5d %-10s\n", get_name(), get_birthdate(),
						   get_id(),get_input_number(), parent_id, age, ALIAS);
	}
	
	public void show_data_only() //prints only data with no column headers
	{
		System.out.printf("%-20s %-20s %-10d %-15d %-10d %-5d %-10s\n", get_name(), get_birthdate(),
				 		  get_id(),get_input_number(), parent_id, age, ALIAS);
	}
	
	public void Play_Pretend()		//Changes Alias to match input unless input is DONE, in which case, Alias becomes name
	{
		String Fantasy_Name;
		Scanner myObj = new Scanner(System.in);
		
		System.out.println("Who are you today? or are you DONE playing?");
		Fantasy_Name = myObj.nextLine();
		if (!Fantasy_Name.equals("DONE"))
		{
			ALIAS = Fantasy_Name;
			System.out.printf("Have fun on your adventures %s!\n", ALIAS);
		}
		else
		{
			ALIAS = get_name();
			System.out.printf("Welcome back to reality %s.\n", ALIAS);
		}
	}

	public static void main(String[] args) {
		
		Child_User Tom;
		Tom = new Child_User("Tom Sawyer", "Jan 1, 1832", 66, 6, 3965, 15);
		Tom.show();
		Tom.grow_up();
		Tom.grow_up();
		Tom.show();
		Tom.grow_up();
		
		Tom.Play_Pretend();
		Tom.show();
		Tom.Play_Pretend();
		Tom.show();
	}

}
