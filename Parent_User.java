import java.util.ArrayList;


public class Parent_User extends User{

	private ArrayList<Child_User> Children;
	
	public Parent_User(String User_name, String User_birthdate, int User_id, int User_input_number) {
		super(User_name, User_birthdate, User_id, User_input_number);
		Children = new ArrayList<Child_User>();
	}

	public void add_Child_User(Child_User kid) //Adds a child to the list of children
	{
		System.out.println("Adding " + kid.get_name());
		System.out.println(Children.size());
		Children.add(kid);
	}
	
	public void show_family() //Shows own data and children data with column headers
	{
		int i;
		show();
		System.out.println("Children");
		System.out.printf("%-20s %-20s %-10s %-15s %-10s %-5s %-10s \n", 
				  		  "Name", "Birthdate", "ID", "Input_Number", "Parent_ID", "Age", "ALIAS");
		for (i = 0; i < Children.size(); i++)
		{
			Children.get(i).show_data_only();
		}
		
	}
	
	
	public static void main (String []args)
	{
		Parent_User Mom;
		Child_User Tom, Huck;
		Tom = new Child_User("Tom Sawyer", "Jan 1, 1832", 66, 6, 3965, 15);
		Huck = new Child_User("Huck Finn", "June 6, 1666", 55, 9, 3965, 15);
		Mom = new Parent_User("Mom Sawyer", "Deec 25 1810", 77, 7);
		Mom.add_Child_User(Tom);
		Mom.add_Child_User(Huck);
		Mom.show_family();
		
	}
}
