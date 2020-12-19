package Java_Programs;

public class TotalCountOfCharacter_A_InArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char arr[]=new char[] { 'I', 'a', 'm', 'A', 'j', 'a', 'v', 'a', 'Q', 'A'};
		
		int size=arr.length;
		int c=0;
		
		for(int i=0;i<=size-1;i++)
		{
			if(arr[i]=='A' || arr[i]=='a')
			{
				c++;
			}
			
			
		}
		
		System.out.println(c+" Times Alphabet A appeared in the array");

	}

}
