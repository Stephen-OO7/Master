package Java_Programs;

public class FirstLetterOfEveryWordCapital {
	String str="tom is becoming a programmer";
	FirstLetterOfEveryWordCapital()
	{
		char arr[]=str.toCharArray();
		char c;
		String s;
		for(int i=0;i<arr.length;i++)

		{
			if(i==0)
			{
				if(i==0)
				{
				c=arr[i];
				s=Character.toString(c);
				s=s.toUpperCase();
				arr[i]=s.charAt(0);
				}
			}
			else if(arr[i]==' ')
			{
				
				c=arr[i+1];
				s=Character.toString(c);
				s=s.toUpperCase();
				arr[i+1]=s.charAt(0);
				
			}
			
			System.out.print(arr[i]);
			
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstLetterOfEveryWordCapital f=new FirstLetterOfEveryWordCapital();
		
		
	
		
	}

}
