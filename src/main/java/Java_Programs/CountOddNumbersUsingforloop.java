package Java_Programs;

public class CountOddNumbersUsingforloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int c=0;
		
		for(int i=1;i<=20;i++)
		{
			if(i%2!=0)
			{
				c++;
			}
		}
		
		System.out.println("count of all odd numbers between 0 to 20 is= "+c);

	}

}
