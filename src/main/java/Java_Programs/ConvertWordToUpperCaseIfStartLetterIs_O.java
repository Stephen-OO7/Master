package Java_Programs;

public class ConvertWordToUpperCaseIfStartLetterIs_O {
	
	String str="The compiled code of java can run on mac linux or windows if jre is available on the operating system";
	String temp;
	String arr[]=str.split(" ");
	public   ConvertWordToUpperCaseIfStartLetterIs_O()
	{
		for(int i=0;i<arr.length;i++)
		{
			
			if(arr[i].charAt(0)=='o')
			{
				temp=arr[i].toUpperCase();
				arr[i]=temp;
				
			}
			
			System.out.print(arr[i]+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConvertWordToUpperCaseIfStartLetterIs_O co= new ConvertWordToUpperCaseIfStartLetterIs_O();
			
		
	}

}
