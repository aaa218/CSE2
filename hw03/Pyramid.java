///////////////////////////////////////////////////////////////////////////////
//Alexis Arancio
//February 15, 2016
//CSE2 hw03
//Pyramid
//
//Program will prompt user for dimensions of a pyramid and return the volume inside
//
import java.util.Scanner; //Forming the scanner for the prorgam
//Document program
//
//
public class Pyramid{
    //Main method required for every Java program
    public static void main(String [] args) {
        Scanner myScanner=new Scanner ( System.in );
        System.out.print ("Enter the length of the square side of the pyramid in the form xx: ");
        //Will print out the prompt to input length of the sqaure side of the pyramid for the user
        double lengthOfSquareSide=myScanner.nextDouble (); //Preparing the scanner for the length of square side
        System.out.print ("Enter the height of the pyramid in the form xx: ");
        //Will print out the prompt to input height of the pyramid for the user
        double heightOfPyramid=myScanner.nextDouble (); //Preparing the scanner for height of pyramid
        double volumeOfPyramid;
        volumeOfPyramid=( (( lengthOfSquareSide ) * ( lengthOfSquareSide ) * (heightOfPyramid)) /3 );
        //Formula for finding the volume of a pyramid: ( (1/3) * length * base * height )
        System.out.print ("The volume inside the pyramid is " + volumeOfPyramid);
        //Will print out the desired result of the volume in the pryamid
        
    }//End of main method
    
}//End of class
