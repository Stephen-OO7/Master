package Java_Programs;

public class Switch_Weekdays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte num=5;
		
		switch(num)
		{
		
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("thursday");
			break;
		case 5:
			System.out.println("friday");
			break;
		case 6:
			System.out.println("saturday");
			break;
		case 7:
			System.out.println("sunday");
			break;
		
		default:
			System.out.println("enter a valid number");
			break;
		}
	}

}
