package Java_Programs;

public class ElseIFLadder_Prog2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
short billamount=200;
		
		if(billamount<300 || billamount==300)
		{
			System.out.println("Total Bill amount with added 50 rs tax= rs "+(billamount+50));
		}
		else if(billamount>300 && billamount<=500  )
		{
			System.out.println("Total Bill amount with added 20 rs tax= rs "+(billamount+20));
		}
		
		else if(billamount>500 && billamount<=1000)
		{
			System.out.println("Total Bill amount with added 10 rs tax= rs "+(billamount+10));
		}
		
		else
		{
			System.out.println("No tax on amount");	
		}

	}

}
