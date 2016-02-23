///////////////////////////////////////////////////////////////////////////////
//Alexis Arancio
//February 22, 2016
//CSE2 hw04
//RGB Values To Hexadecimal
//
//Create a program that takes RGB values and converts them to hexidecimal values
//
import java.util.Scanner; //Forming the scanner for the import
public class ToHex{
    //Main method required to every Java program
    public static void main(String [] args ) {
        Scanner input=new Scanner (System.in); //Defining the scanner
        System.out.print("Enter a number in the form xxx: ");
        //Writing out the format the hexadecimal should be written in
        
        int num=input.nextInt( );
        int remainder; //This ensures that the remainder is an integar
        String string2="";
        
        char hexadecimal [] = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        //Defining chars to represent the hexadecimal values
        
        {remainder=num%16; //Remainder into hexadecimal using modulo
        string2=hexadecimal[remainder]+string2; //Decimal into hexadecimal
        num=num&16; //Decimal into hexadecimal (formula)
        }
        
        System.out.print("The values are represented in hexadecimal as: " +string2);
        //Result of conversion of decimals into hexadecimal printed out 
        
        
    }//End of main method
}//End of class