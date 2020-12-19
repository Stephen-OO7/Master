package Java_Programs;

public class SortTheNumbersInAnArrayInAscendingOrder {
	int arr[]=new int[] {20,14,48,9,5,3,25,7};
	SortTheNumbersInAnArrayInAscendingOrder()
	{
		
		for(int i=0;i<8;i++)
		{
			
					for(int k=0;k<8;k++)
					{
						
					if(arr[i]<arr[k])
					 {
						
						int temp=arr[i];
						arr[i]=arr[k];
						arr[k]=temp;
						
								
					 }
			
					}
		
	}
		for (int i=0;i<8;i++)
		{
		System.out.println(arr[i]);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortTheNumbersInAnArrayInAscendingOrder sort=new SortTheNumbersInAnArrayInAscendingOrder();
		
		
		   


	}

}
