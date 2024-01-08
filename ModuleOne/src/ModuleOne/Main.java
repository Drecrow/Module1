package ModuleOne;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
String firstName, lastName, streetAddress, city, zipCode;

        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first name: ");
        firstName = scanner.nextLine();

        System.out.print("Enter last name: ");
        lastName = scanner.nextLine();

        System.out.print("Enter street address: ");
        streetAddress = scanner.nextLine();

        System.out.print("Enter city: ");
        city = scanner.nextLine();

        System.out.print("Enter zip code: ");
        zipCode = scanner.nextLine();

       
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Street Address: " + streetAddress);
        System.out.println("City: " + city);
        System.out.println("Zip Code: " + zipCode);

        
    }
}