//////////////////////////////////////////////////////////////////////////////
//Alexis Arancio
//February 12, 2016
//CSE2 hw 03
//Convert
//
//The user wants to convert meters to inches
//Ask the user for a measurent in meters
//Print out the correct number of inches
//
import java.util.Scanner; //Forming the scanner for the program
//Document program
//
//
public class Convert{
    //Main method required for every Java 
    public static void main(String[] args) {
        Scanner myScanner=new Scanner ( System.in );
        System.out.print ("Enter the distacne in meters: xx.xx");
        double distanceMeters=myScanner.nextDouble ();
        double metersConvertedToInches= distanceMeters*39.37; //There are 39.37 inches per one meter
        //34.23*39.37=1347.6378 and 15.25*39.37=600.3925
        System.out.print ("Distance in inches " + metersConvertedToInches); 
        //Desired output of distance in meters converted to inches

    }//End of main method
    
}//End of class