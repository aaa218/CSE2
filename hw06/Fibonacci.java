///////////////////////////////////////////////////////////////////////////////
//Alexis Arancio
//March 8, 2016
//CSE2 hw06
//Fibonacci
//
//Program will ask user for three numbers, must be postive integers
//If it is not a positive integer, it will ask again using a while loop
//First two integers will be a1 and a2
//The last will be n, the amount of Fibonacci numbers to print out 
//
import java.util.Scanner; 

public class Fibonacci{
    public static void main(String [] args){
    Scanner myScanner=new Scanner (System.in);
    
    System.out.print ("Enter the first postive integer: "); //Prompting the user to enter an integer
    int firstNumber= myScanner.nextInt();
    System.out.print ("Enter the second positive integer: ");//Prompting the user to enter the second integer
    int secondNumber= myScanner.nextInt();
    System.out.print ("Enter the amount of numbers desired in the sequence: ");
    //Prompting the user to enter the amount of numbers they want in the sequence
    int numbersInSequence= myScanner.nextInt();
    
    while(firstNumber < 0 || secondNumber < 0 || numbersInSequence < 0 ){ 
    //Using a loop to ask the user to re-enter integers if they are not postive the first time
    System.out.println("Integers entered are invalid");
    System.out.println("Please re-enter the first positive integer: ");
        firstNumber = myScanner.nextInt();
        secondNumber = myScanner.nextInt();
        numbersInSequence = myScanner.nextInt();
    }
    System.out.print ("The numbers are:" );//Printing out the numbers
    System.out.print (firstNumber + ",");
    System.out.print (secondNumber);
    
    while (numbersInSequence>2){ //Creating the loop to make the fibonacci sequence
        numbersInSequence=firstNumber+secondNumber;
        System.out.print("," + numbersInSequence);
        numbersInSequence--;
        firstNumber=secondNumber;
        secondNumber=numbersInSequence;
    }
    System.out.print (".");
        }//End of main method
    }//End of class