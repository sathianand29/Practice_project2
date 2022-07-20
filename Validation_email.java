package Practice_project2;
import java.util.ArrayList;
import java.util.Scanner;

public class Validation_email {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> email = new ArrayList<String>();
		email.add("abc@company.com");
		email.add("def@company.com");
		email.add("lmn@company.com.com");
		email.add("xyz@company.com");
		System.out.println("ENTER USER EMAIL ID:");
		String ID = sc.nextLine();
	
			if (email.contains(ID)) {
				System.out.println();
				System.out.println("email ID " + ID + " found");
			} 
			else {
				System.out.println("email ID " + ID + " Not found");

			}
		}
	}