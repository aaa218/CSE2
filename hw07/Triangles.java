///////////////////////////////////////////////////////////////////////////////
//Alexis Arancio
//March 20, 2016
//CSE2 hw07
//Triangles
//
//Program will prompt user for integers (between 5 & 30) and print out number sequences in the shape of a triangle
//
import java.util.Scanner; //Forming the scanner for the prorgam
//
public class Triangles{
    //Main method required for every Java program
    public static void main(String [] args) {
        Scanner myScanner= new Scanner (System.in);
    boolean correctInteger= true;
    int number= 0;
        while (correctInteger){ //A while loop will make sure a correct integer is entered
            System.out.println("Enter an integer between 5 and 30: ");
                if (!myScanner.hasNextInt()){ //If the input is not between the desired range- Java will ask again
                    System.out.println("Error! Enter an integer between 5 and 30: ");
                    myScanner.next();
        }
            number= myScanner.nextInt(); //If the number entered is outside of range it will be rejected
                if (number>= 5 && number <= 30);
                correctInteger= false;
        }
        
        //Loop sequences of triangles below
        
    System.out.println("FOOR LOOP: "); //Start of the for loop triangle
    int firstCounter=1;
        for (int line=0; line<number; line++) { //Loop will run & break amount of times as integer entered
        for (int n=0; n<firstCounter; n++){ //Loop will print numbers in triangle form
        }
        firstCounter++;
        System.out.println(" ");
        }
    int secondCounter;
        secondCounter= number - 1;
        for (int line=0; line<number - 1; line++){ //Loop will break numbers in a decreasing order
        for (int n=0; n<secondCounter; n++){ //Loop will form the triangle in a decreasing order
            System.out.print(secondCounter);
        }
        secondCounter--;
        System.out.println(" ");
        } //End of for loop triangle form
        
    System.out.println("WHILE LOOP: "); //Start of the while loop triangle
    int firstRow=0;
    int thirdCounter= number - 1; //Ensures the loop will decrease in order of desired number
        while (firstRow < number){
            int n= 0;
        while (n < thirdCounter){
        System.out.print(thirdCounter); n++;
        }
        thirdCounter--;
        firstRow++;
        System.out.println(" ");
        } //End of while loop triangle form
        
    System.out.println("DO WHILE LOOP: "); //Start of the do while loop triangle
    int secondRow=0;
    int fourthCounter= 1;
        do {
            int n=0;
        do {
        System.out.print(fourthCounter); n++;
        }
        while (n < fourthCounter);
        secondRow++;
        fourthCounter++;
        System.out.println(" ");
        }
        while (secondRow < number);
            int thirdRow=0;
            int fifthCounter= number - 1; //Ensures the loop will decrease in order of desired number
        do {
            int n=0;
        do{
        System.out.print(fifthCounter); n++;
        }
        while (n < fifthCounter);
        thirdRow++;
        fifthCounter--;
        System.out.println(" ");
        }
        while (thirdRow < number - 1);
        //End of do while loop triangle form
        
    }//End of main method
}//End of class