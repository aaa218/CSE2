////////////////////////////////////////////////////////////////////
//Alexis Arancio
//February 12, 2016
//CSE2 lab 03
//Check
//
//User went to dinner with friends, wants to split the check evenly.
//Program should obtain from Scanner original cost of check, percentage of tip,
//and the number of ways  the check is going to be split.
//Will determine how much each person in the group needs to pay.
//
import java.util.Scanner;
//Document program
//
//
public class Check{
    //main method required for every Java program
    public static void main(String[] args) {
        Scanner myScanner=new Scanner ( System.in );
        System.out.print ("Enter the original cost of the check in the form xx.xx: ");
        double checkCost=myScanner.nextDouble ();
        System.out.print ("Enter the percantage tip that you wish to pay as a whole number (in the form xx): ");
        double tipPercent=myScanner.nextDouble();
        tipPercent /=100; //We want to convert the percentage into a decimal value
        System.out.print ("Enter the number of people who went out to dinner: ");
        int numPeople=myScanner.nextInt();
        double totalCost;
        double costPerPerson;
        int dollars,dimes,pennies;//Whole dollar amount of cost dimes, pennies; //For sotring digits
            //to the right of the decimal point 
            //for the cost$
        totalCost=checkCost * (1+tipPercent);
        costPerPerson=totalCost/numPeople;
        //Get the whole amount, dropping decimal fraction
        dollars=(int)costPerPerson;
        //Get dimes amount, e.g.,
        //(int)(6.73*10) % 10->67 % 10->7
        //Where the % (mod) operator returns the remainder
        //after the division: 583%100 -> 27%5 -> 2
        dimes=(int) (costPerPerson * 10) % 10;
        pennies=(int) (costPerPerson * 100) % 10;
        System.out.println ("Each person in the group owes $" + dollars + '.' + dimes + pennies);
        
    } //End of main method
} //End of class