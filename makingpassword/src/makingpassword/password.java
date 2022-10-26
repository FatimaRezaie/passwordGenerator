

package makingpassword;
import java.util.Random;
import java.util.Scanner;

public class password {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	      System.out.println("Enter the length of your password between 8 to 128:  ");
	      
	      int L = sc.nextInt();
	      
		System.out.println(generatePassword(L));
		System.out.println("Do you want to Generate next Password 1 or 2\n");
		int s = sc.nextInt();
		
		
	   }

	   private static char[] generatePassword(int length) {
		   
		  String string = " type the user password";
	      String capitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	      String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
	      String specialCharacters = "!@#$";
	      String numbers = "1234567890";
	      String combinedChars = capitalCaseLetters + lowerCaseLetters + specialCharacters + numbers;
	      Random random = new Random();
	      char[] password = new char[length];
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Enter your choice: ");
	      System.out.println("1: capitalCaseLetters: 1 ");
	      System.out.println("2: lowerCaseLetters: 2 ");
	      System.out.println("3: specialCharacters: 3 ");
	      System.out.println("4: numbers: 4 ");
	      System.out.println("5: combinedChars: 5 ");
	      int selection = sc.nextInt();
	      if(selection==1) {
	      for(int i = 0; i< length ; i++) {
		         password[i] = capitalCaseLetters.charAt(random.nextInt(capitalCaseLetters.length()));
		      }
	      return password;
	      }
	      
	      if(selection==2) {
		      for(int i = 0; i< length ; i++) {
			         password[i] = lowerCaseLetters.charAt(random.nextInt(lowerCaseLetters.length()));
			      }
		      return password;
		      }
	      if(selection==3) {
		      for(int i = 0; i< length ; i++) {
			         password[i] = specialCharacters.charAt(random.nextInt(specialCharacters.length()));
			      }
		      return password;
		      }
	      if(selection==4) {
		      for(int i = 0; i< length ; i++) {
			         password[i] = numbers.charAt(random.nextInt(numbers.length()));
			      }
		      return password;
		      }
	      if(selection==5) {
		      for(int i = 0; i< length ; i++) {
			         password[i] = combinedChars.charAt(random.nextInt(combinedChars.length()));
			      }
		      return password;
		      }
	      System.out.println(string);

	      password[0] = lowerCaseLetters.charAt(random.nextInt(lowerCaseLetters.length()));
	      password[1] = capitalCaseLetters.charAt(random.nextInt(capitalCaseLetters.length()));
	      password[2] = specialCharacters.charAt(random.nextInt(specialCharacters.length()));
	      password[3] = numbers.charAt(random.nextInt(numbers.length()));
	   
	      for(int i = 8; i< length ; i++) {
	         password[i] = combinedChars.charAt(random.nextInt(combinedChars.length()));
	      }
		return password;
	}
}

