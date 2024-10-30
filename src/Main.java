// Scanner is a predefined class which is used to take user input in java.
// Scanner class is defined inside java.util package.א
// nextInt():Used to read integer value from the user.
// nextFloat():Used to read float value from the user.
// nextDouble():Used to read double value from the user.
// next():Used to read string value without space from the user. א
// nextLine():Used to read string value from the user.
// nextByte():Used to read byte value from the usאצ
// nextShort():Used to reads short value from the user.
// nextLong():Used to read long value from the user.

//importing the package
import java.util.Scanner;

class Main {
  
  public static void main(String[] args) {
    System.out.println("please enter your name:");
    Scanner myScanner = new Scanner(System.in);

    String userName = myScanner.next();  // Read user input - blocking function!
    System.out.println("hello " + userName + "! \nit's very nice to meet you."); 

    System.out.println("let us see if we have another token...");
    System.out.println("this will work if you entered your FULL name. \nif this gets stuck please enter some string...");
    userName = myScanner.next();  
    System.out.println("next token is: " + userName ); 

    System.out.println("please enter an integer number:");
    int num = myScanner.nextInt(); 
    System.out.println("the number " + num + " in power of 2 is: " + Math.pow(num,2) ); 

    myScanner.close();
  }
}



























