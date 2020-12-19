package Java_Programs;

public class Remove_All_Special_Characters {
	
	String str="#%$#%$!!Hellothere *&&%$%$";
	char arr[]=str.toCharArray();
	int len=arr.length;
	
	public Remove_All_Special_Characters()
	{
		for(int i=0;i<len;i++)
		{
			if((arr[i]>='a' && arr[i]<='z') || (arr[i]>='A' && arr[i]<='Z'))
			{
				if(arr[i]=='o')
				{
					System.out.print(arr[i]+" ");
				}
				else
				{
				System.out.print(arr[i]);
				}
			}
			
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Remove_All_Special_Characters r=new Remove_All_Special_Characters();
		
	}

}
