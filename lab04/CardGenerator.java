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
        int card=(int)(Math.random()*(upperBound+1))+baseNum; //Defining an upper bound 
        int card=(int)(Math.random()*52)+ 1; //Choosing a random number (card) between 1 and 52
        String suit = ""; //String for suit
        String rank = ""; //String  for rank
        switch(card % 13){
            case 1:
                rank = "1" //Rank of the card in the deck
            break;
            case 2:
                rank = "2"
            break;
            case 3:
                rank = "3"
            break;
            case 4:
                rank = "4"
                
        }
        

        
        
    }//End of main method
}//End of class