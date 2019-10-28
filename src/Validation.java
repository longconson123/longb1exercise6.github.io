
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MyPC
 */
public class Validation {
    static String email_value = "\\w+@\\w+[.]\\w+\\w*$";
//	static String email_value = "^[^0-9]+\\w*@gmail.com$";
	static String PHONE_VALUE = "^\\d{10}\\d*$";
	static String DAY_VALUE = "\\d{1,2}[-|/]\\d{1,2}[-|/]\\d{4}";
    public static Scanner input = new Scanner(System.in);

	// check input String
	public static String checkInputString() {
		// loop until user input correct
		while (true) {
			String result = input.nextLine().trim();

			if (result.isEmpty()) {
				System.err.println("data is empty!");
				System.out.println("add data");
			} else {
				return result;
			}
		}
	}

	// check user input int
	public static int checkInputInt() {
		// loop until user input correct
		while (true) {
			try {
				int result = Integer.valueOf(input.nextLine().trim());
				return result;
			} catch (NumberFormatException e) {
				System.err.println("Must be input integer.");
				System.out.println("re-input:");
			}

		}
	}

	// check user input double-float
	//
	// check user input number limit
	public static int checkInputLimit(int min, int max) {
		// loop until user input correct
		while (true) {
			int result = checkInputInt();
			if (result < min || result > max) {
				System.out.println("please enter number in rage " + "[" + min + "," + max + "]");
			} else {
				return result;
			}
		}

	}
	// check user input yes/ no

	public static boolean checkInputYN() {
		// loop until user input correct
		while (true) {
			String result = checkInputString();
			if (result.equals("Y")) {
				return true;
			} else if (result.equals("N")) {
				return false;
			} else {
				System.out.println("re-input");
			}
		}
	}
        
        
	public static String checkInputEmail() {
		System.out.print("Input your email(email@address.com): ");
		while (true) {
			String emailCheck = checkInputString();
			if (!emailCheck.matches(email_value)) {
				System.err.println("Email must be correct format");
				System.out.print("TRY again: ");
			} else {
				return emailCheck;
			}
		}
	}

	static String checkInputPhone() {
		System.out.print("Input your PHONE: ");
		while (true) {
			try {
				String phoneCheck = input.nextLine();
//                String resultCheck = String.valueOf(phoneCheck);
				if (phoneCheck.matches(PHONE_VALUE)) {
					return phoneCheck;

				} else {
					System.err.println("Phone number must be 10 digits");
				}
			} catch (NumberFormatException ex) {
				System.out.print("Phone number: ");
				System.err.println("Phone number must be number");
			}
		}
	}

	static String checkInputDate() {
		System.out.print("Input your Date: ");
		while (true) {
			try {
				String dateCheck = input.nextLine();
//                String resultCheck = String.valueOf(phoneCheck);
				if (dateCheck.matches(DAY_VALUE)) {
					return dateCheck;

				} else {
					System.err.println("not correct");
				}
			} catch (NumberFormatException ex) {
				System.err.println("day  number must be number");
			}
		}
	}

  

}
