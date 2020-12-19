package Java_Programs;

public class CountOfPrimeNumbers {
	int c=0;
	int c2=0;
	 CountOfPrimeNumbers()
	 {
		 int arr[] =new int[] {2,5,6,8,11,14,17,18,20};
		 
		 for(int i=0;i<=8;i++)
			{
				for(int j=1;j<=arr[i];j++)
				{
					if(arr[i]%j==0)
					{
						c++;
					}
				
				}
				if(c==2)
				{
					System.out.println(arr[i]);
					c=0;
					c2++;
				}
				else {
					c=0;
				     }
			} 
		 System.out.println("count of prime numbers in the given array is= "+c2);
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 CountOfPrimeNumbers pr=new  CountOfPrimeNumbers();
		
		
		
		

	}

}
