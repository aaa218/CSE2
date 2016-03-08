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
public class Fibonacci{
    public static void main(String [] args){
        int firstNumber=1;
        while (firstNumber > 0){
            System.out.print ("Enter the first number in the sequence: ");
            firstNumber++;
            break;
        }
    }
}