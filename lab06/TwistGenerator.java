///////////////////////////////////////////////////////////////////////////////
//Alexis Arancio
//March 4, 2016
//CSE2 lab06
//Twist Generator
//
//Program will print out a simple "twist"
//
import java.util.Scanner; //Setting up the scanner for the program

public class TwistGenerator{
    
    public static void main(String [] args) {
        Scanner myScanner= new Scanner (System.in); //Setting up the scanner 
        
        System.out.print("Enter a positive integer for length: "); //Asking the user
        double length = myScanner.nextDouble();
        
        while (length < 0 || ((length*10)%10)!=0){   
            System.out.println("Invalid input, enter again: ");  //Re-ask the user
            length = myScanner.nextDouble();
        }
        int i = (int)length; 
        int k = 1;
        while (k<=length)   {
            if ((k%3)==1)   {
                System.out.print("\\");
            }
            else if ((k%3)==0)  {
                System.out.print("/");
            }
            else {
                System.out.print(" ");
            }
            k++;
        }
        System.out.println();
        k=1;
        while (k<=length)   {
            if ((k%3)==2)   {
            System.out.print("X");
            }
            else    {
                System.out.print(" ");
            }
            k++;
        }
        System.out.println();
        k=1;
        while (k<=length)   {
            if ((k%3)==1)   {
                System.out.print("/");
            }
            else if ((k%3)==0)  {
                System.out.print("\\");
            }
            else {
                System.out.print(" ");
            }
            k++;
        }
        System.out.println();
    } //End of main method
} //End of class