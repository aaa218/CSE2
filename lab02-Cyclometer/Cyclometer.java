/////////////////////////////////////////////////////////////////
//Alexis Arancio
//February 5, 2016
//CSE2
//
//Bicycle Cyclometer. Measuring speed, distance etc.
//In two trips the program should:
//Measure minutes, rotations, distance in miles, and print distance
//All for the two trips combined
//
public class Cyclometer {
    // main method required for every Java program
    public static void main(String[] args) {
    //our input data.
    int secsTrip1=480; // Time in seconds for trip one
    int secsTrip2=3220; // Time in seconds for trip two
    int countsTrip1=1561; // Number of rotations for trip one
    int countsTrip2=9037; // Number of rotations for trip two
    
    double wheelDiameter=27.0, //
    PI=3.14159, //
    feetPerMile=5280, //
    inchesPerFoot=12, // 
    secondsPerMinute=60; //
    double distanceTrip1, distanceTrip2, totalDistance; //
    
    System.out.println ("Trip 1 took "+
        (secsTrip1/secondsPerMinute) + " minutes and had "+
        countsTrip1+ "counts.");
    System.out.println ("Trips 2 took "+
        (secsTrip2/secondsPerMinute)+ " minutes and had "+
        countsTrip2+ " counts.");
    
    //run the calculations; store the values.

distanceTrip1=countsTrip1*wheelDiameter*PI;
//Above gives the distance in inches
//(For each count, a rotation of the wheel travels
//the diameter in inches times PI)
distanceTrip1/=inchesPerFoot*feetPerMile; //Gives distance in miles
distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
totalDistance=distanceTrip1+distanceTrip2;

//Print out the output data.
System.out.println ("Trip 1 was "+distanceTrip1+" miles");
System.out.println ("Trip 2 was "+distanceTrip2+" miles");
System.out.println ("The total distance was "+totalDistance+" miles");
    } //end of main method
} //end of class