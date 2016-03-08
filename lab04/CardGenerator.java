///////////////////////////////////////////////////////////////////////////////
//Alexis Arancio
//February 19, 2016
//CSE2 lab04
//Card Generator
//
//Want to create random card generator to practice for magic show
//Each number represents one card
//Diamonds are 1-13, Clubs are 14-26, Hearts are 27-39, Spades 40-52
//
public class CardGenerator{
    //Main method required for every java program
    public static void main(String [] args ) {
        int upperBound= 52; //Defining an upper bound 
        int baseNum= 1; // Defining a base number
        int randomRank=(int)(Math.random()*13)+ 1; //Choosing a random card in a rank
        int randomSuit=(int)(Math.random()*4)+ 1; //Choosing a random card in a suit
        
        String rank = ""; //String  for rank
        String suit = ""; //String for suit
        
        switch(randomRank % 13){
            case 1:
                rank= "Ace"; //Rank of the card in the deck
            break;
            case 2:
                rank= "2";
            break;
            case 3:
                rank= "3";
            break;
            case 4:
                rank= "4";
            break;
            case 5:
                rank= "5";
            break;
            case 6:
                rank= "6";
            break;
            case 7:
                rank= "7";
            break;
            case 8:
                rank= "8";
            break;
            case 9:
                rank= "9";
            break;
            case 10:
                rank= "10";
            break;
            case 11:
                rank= "Jack";
            break;
            case 12:
                rank= "Queen";
            break;
            case 13:
                rank= "King";
        }
        
        switch(randomSuit % 4){
            case 1:
                suit= "Clubs"; //Suit of the card in the deck
            break;
            case 2:
                suit= "Hearts";
            break;
            case 3:
                suit= "Spades";
            break;
            case 4:
                suit= "Diamonds";
            break;
        }
        
        System.out.println("You picked the " + ( rank ) + " of " + ( suit ) );

        
        
    }//End of main method
}//End of class