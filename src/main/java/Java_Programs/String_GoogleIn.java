package Java_Programs;

public class String_GoogleIn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="www.google.com";
		
		String str[]=s.split("[.]");
		str[2]="in";
		
		for (int i=0;i<str.length;i++)
		{
			if(i<2)
			{
				System.out.print(str[i]+".");
			}
			else
			{
				System.out.print(str[i]);
			}

				
		}
		
		//OR
		
		
		/*
		 * char arr[]=s.toCharArray();; for(int i=0;i<14;i++) { if(s.charAt(i)=='c' &&
		 * s.charAt(i+1)=='o' && s.charAt(i+2)=='m') {
		 * 
		 * arr[i]='i'; arr[i+1]='n'; arr[i+2]=' ';
		 * 
		 * }
		 * 
		 * } for(int j=0;j<arr.length;j++) { System.out.print(arr[j]);
		 * 
		 * }
		 */
		
		
	}

}
