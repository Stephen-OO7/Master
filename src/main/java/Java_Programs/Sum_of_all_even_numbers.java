package Java_Programs;

public class Sum_of_all_even_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		short num = 0;
		int res = 0;
		while (num <= 15) {
			if (num % 2 == 0) {

				System.out.println(num);
				res = res + num;
			}

			num++;

		}

		System.out.println("the sum of all even numbers between 1 to 15 is=" + res);
	}

}
