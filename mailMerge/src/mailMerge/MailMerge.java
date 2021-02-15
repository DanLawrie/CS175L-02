package mailMerge;

import java.util.Scanner;

public class MailMerge {

	public static void main(String[] args) {
		
		
		Scanner in = new Scanner(System.in);
		

		String replaceText1 = "Dear firstName lastName,";
		String replaceText2 = "Please confirm that your address is houseNumber street.";
		String replaceText3 = "Your answer is: yORn Goodbye!";
		String promptText1 = "Please enter your first name: ";
		String promptText2 = "Please enter your last name: ";
		String promptText3 = "Please enter your house number: ";
		String promptText4 = "Please enter your street: ";
		String promptText5 = "Is this address correct? ";
		
		
		System.out.print(promptText1);
		String firstName = in.nextLine();
		
		System.out.print(promptText2);
		String lastName = in.nextLine();
		
		System.out.print(promptText3);
		String houseNum = in.nextLine();
		
		System.out.print(promptText4);
		String street = in.nextLine();
		
		
		
		replaceText1= replaceText1.replace("firstName", firstName);
		replaceText1= replaceText1.replace("lastName", lastName);
		System.out.println(replaceText1);
		replaceText2 = replaceText2.replace("houseNumber", houseNum);
		replaceText2 = replaceText2.replace("street", street);
		System.out.println(replaceText2);
		
		System.out.print(promptText5);
		String correct = in.nextLine();
		
		replaceText3= replaceText3.replace("yORn", correct);
		System.out.println(replaceText3);
		in.close();
		}

}
