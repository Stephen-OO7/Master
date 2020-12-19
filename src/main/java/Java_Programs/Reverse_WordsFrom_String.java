package Java_Programs;

public class Reverse_WordsFrom_String {
	String str="One two there four five six";
	String rev="";
	String [] arr=str.split(" ");
	public Reverse_WordsFrom_String()
	{
		for(int i=arr.length-1;i>=0;i--)
		{
			
			rev=rev+arr[i]+" ";
		}
		System.out.println(rev);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reverse_WordsFrom_String rev=new Reverse_WordsFrom_String();
		
		
		
		
	}

}
