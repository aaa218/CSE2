///////////////////////////////////////////////////////////////////////////////
//Alexis Arancio
//March 8, 2016
//CSE2 hw06
//Run Factorial
//
//Using while-loops to solve a factorial program
import java.util.Scanner;

public class RunFactorial{
    public static void main(String [] args){
        Scanner rf=new Scanner (System.in);//Declaring a scanner for the program
        System.out.print("Enter an integar that is between 9 and 16: ");//Asking the user for an input
        double number= rf.nextDouble();
        
        while (number > 16){
            System.out.print("Invalid input, enter again!: ");//If the input is out of range Java will ask again
            number= rf.nextDouble();
        }
        System.out.print("Input accepted: "); //Loop to do arithmetic factorial
            int factorial = 1;
            while(number>0){
                factorial*=number;
                number-=1;
            }
        System.out.println("The factorial is equal to " + factorial);//Printing out the value of the factorial
        }//End of main method
    }//End of class