//Cherish Shanks
//May 29,2016


import java.util.*;

public class ReverseNum {

static Scanner keyboard = new Scanner(System.in); //Allows users to input their numbers

  public static void main (String[] args) {
  
    System.out.println("Enter your number : ");  // Ask user to enter their number

        
    int num = keyboard.nextInt();
    int rev = reverseDigit (num); 
    

    System.out.println("Enter your number reversed is " + rev);} //The output
    
     // The math 
   public static int reverseDigit(int num1){
    
    System.out.println();
    
    int rev = 0;
    
    while (num1 != 0) { 
    rev *= 10;
    rev += num1 % 10;
     num1 /= 10;
     }
   
    
    return rev;}
   
    
}
