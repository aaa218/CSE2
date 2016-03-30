///////////////////////////////////////////////////////////////////////////////
//Alexis Arancio
//March 28, 2016
//CSE2 hw09
//Rectangularize
//
//Program will have two methods that return void and have the same name (method overloading)
//One method will accept int and the other will accept a string
//Method that accepts int will print out a square of %- Length and width will be number provided as input
//Method that accepts string will print out the same number of times there are characters in the string
//
import java.util.Scanner;

public class Rectangularize{
    public static void main(String [] args){
        Scanner myScanner= new Scanner (System.in);
            System.out.println ("Enter a word or number: "); //Ask the user to input a word
                if(myScanner.hasNextInt()){
                    int input=myScanner.nextInt();
                    printInt(input); //Will print contingent upon the input
                }
                else{
                    String word = myScanner.next();
                    printString(word); //Will print contingent upon the input
    }
}//End of main method
    public static void printString (String word){
            int input=word.length();
            for (int l = 1; l <= input; l++){
                System.out.println(word); //Will print out word for lines of length input 
            } 
        }
    public static void printInt (int input){
        int n=1;
        for (int l = 1; l <= input; l++){
            while(n <= input){
                System.out.print("%"); n++; //Will print symbol for lines of input
            }
                System.out.println(); n=1;
        }
    }
}//End of class