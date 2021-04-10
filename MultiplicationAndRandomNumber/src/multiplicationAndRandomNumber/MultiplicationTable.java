package multiplicationAndRandomNumber;

public class MultiplicationTable {

	public static void main(String[] args) {
		for(int one = 1; one<=10; one++)
		{
			for(int two = 1; two<=10; two++)
			{
				System.out.printf("%5d", (one*two));
			}
			System.out.println();
		}

	}

}
