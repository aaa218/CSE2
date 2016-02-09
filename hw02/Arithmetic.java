///////////////////////////////////////////////////////////////////////////////
//Alexis Arancio
//February 5, 2016
//CSE2 Homework 02
//Arithmetic Calculations
//
//Computing the cost of of items you bought at the store, including 6% tax
//
public class Arithmetic {
    //main method required for every Java program
    public static void main(String[] args) {
        
    //input data
    
    //Numbers of pairs of pants
    int numPants=3;
    //Cost per pair of pants
    double pantsPrice=34.98;
    
    //Number of sweatshirts
    int numShirts=2;
    //Cost per shirt
    double shirtPrice=24.99;
    
    //Number of belts
    int numBelts=1;
    //Cost per box of envelopes
    double beltCost=33.99;
    
    //The tax rate
    double paSalesTax=0.06;
    
//Compute the total cost of pants
double totalCostOfPants;
totalCostOfPants=(numPants*pantsPrice); //Gives the price of pants
//Compute the total cost of sweatshirts
double totalCostOfSweatshirts;
totalCostOfSweatshirts=(numShirts*shirtPrice); //Gives the price of sweatshirts
//Compute the total cost of belts
double totalCostOfBelts;
totalCostOfBelts=(numBelts*beltCost); //Gives the price of belts

//Compute sales tax on pants
double taxOnPants;
taxOnPants=(numPants*pantsPrice)*(paSalesTax); //Cost of pants plus tax
//Compute sales tax on sweatshirts
double taxOnSweatshirts;
taxOnSweatshirts=(numShirts*shirtPrice)*(paSalesTax); //Cost of sweatshirts plus tax
//Compute sales tax on belts
double taxOnBelts;
taxOnBelts=(numBelts*beltCost)*(paSalesTax); //Cost of belts plus tax

//Compute transaction cost before tax
double totalCostOfTransactionBeforeTax;
totalCostOfTransactionBeforeTax=(totalCostOfPants+totalCostOfSweatshirts+totalCostOfBelts); 
// Gives total transaction cost before tax

//Compute total sales tax
double totalSalesTax;
totalSalesTax=(taxOnPants+taxOnSweatshirts+taxOnBelts); //Gives total of sales tax

//Compute total paid for transaction, including sales tax
double totalPaidIncludingSalesTax;
totalPaidIncludingSalesTax=(totalCostOfTransactionBeforeTax+totalSalesTax);
//Gives total paid for complete transaction, including sales tax
    
//Print out the output data
System.out.println ("The total cost of pants is " + totalCostOfPants);
System.out.println ("The total cost of sweatshirts is " + totalCostOfSweatshirts);
System.out.println ("The total cost of belts is " + totalCostOfBelts);
System.out.println ("The sales tax on pants is " + taxOnPants);
System.out.println ("The sales tax on sweatshirts is " + taxOnSweatshirts);
System.out.println ("The sales tax on belts is " + taxOnBelts);
System.out.println ("The total cost of the transaction before tax is " + totalCostOfTransactionBeforeTax);
System.out.println ("The total sales tax is " + totalSalesTax);
System.out.println ("The total paid for the transaction, including sales tax is " + totalPaidIncludingSalesTax);

    }//End of main method
}//End of class