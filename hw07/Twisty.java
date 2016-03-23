///////////////////////////////////////////////////////////////////////////////
//Alexis Arancio
//March 20, 2016
//CSE2 hw07
//Twisty
//
//This program will ask the user for two inputs, length (horizontally) and width (vertically)
//Pattern is composed to two twists made up of hashtags and slashes
//Reject any input where the requested width is larger than the requested length or when length is greater than 80
//
import java.util.Scanner; //Forming the scanner for the prorgam
//
//
public class Twisty{
    //Main method required for every Java program
    public static void main(String [] args) {
        
    Scanner myScanner= new Scanner (System.in);
    boolean goodInteger1= true;
    int length= 1;
    while (goodInteger1){
        System.out.print ("Input desired length: "); //Prompting the user to enter length
    if (!myScanner.hasNextInt()){
        System.out.println("Error. Enter an integer less than 80: "); //If the entered integer is more than 80, ask again
        System.out.print ("Input desired length: ");
    }
    length= myScanner.nextInt();
    }
    while (length <= 0 || length > 80); //The input length should not be below 0 or above 80
    
    boolean goodInteger2= true;
    int width= 1;
    while (goodInteger2){
        System.out.print ("Input desired width: "); //Prompting the user to enter width
    if (width > length){
        System.out.println("Error. Enter an integer less than the length: "); //If entered width is more than the length, ask again
        System.out.print ("Input desired width: ");
    }
        else{
            System.out.println("Enter a postive integer: "); //Integer must be postive, if not- ask again
            System.out.print ("Input desired width: ");
        }
    while (!myScanner.hasNextInt()){
        myScanner.next();
            System.out.println("Enter a postive integer: ");
            System.out.print("Input desired width: ");
    }
    width= myScanner.nextInt();
    }
    while (width <= 0 || width > length); //The input width should not be longer than the length
    
    int p1= 1; int p2= 0; int p3= width; int p4= width*2 - 1;
    
    for (int n=1; n<=width; n++){
        System.out.print ("\n"); //Makes the lines seperate
    for (int k=1; k<=length; k++){
        if (1%(width*2)==p1){ // Beginning pattern with #
        System.out.print("#");
        }
        else if((k-1)%width==p2){ //Pattern with \
        System.out.print ("\\");
        }
        else if (k%(width*2)==p3){ //Pattern with /
        System.out.print ("/");
        }
        else if((k-1%(width*2)==p4)){ //Ending pattern with #
        System.out.print("#");
        }
        else { System.out.print (" ");
        }
    }
    p1++; p2++; p3--; p4--;
    }
    
    }//End of main method
}//End of class