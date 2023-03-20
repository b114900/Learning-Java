import java.util.Scanner;


class Hello_World {

	public static String hello_world_int(int input_number)
	{
		switch(input_number)
		{
		case 1:
			return "hello world";
		case 2:
			return "hello world again";
		case 3:
			return "hello " + input_number;
		default:
			return "none of the above";
		}
	}
	
	static int get_user_input()
	{
		int input_number;
		Scanner myObj = new Scanner(System.in);
		
		System.out.println("Give me a number other than 666");
		input_number = myObj.nextInt();
		return input_number;
	}
	
	public static void main(String []args)
	{
//		System.out.println("Hello, World\n");
		int input_number;
			
		System.out.println(hello_world_int(1));
		System.out.println(hello_world_int(2));
		System.out.println(hello_world_int(3) + "\n");
		
		input_number = get_user_input();
		while (input_number != 666)
		{
			System.out.println(hello_world_int(input_number));
			input_number = get_user_input();
		}
		System.out.println("WHAT HAVE YOU DONE???");
	}
	
	
}
