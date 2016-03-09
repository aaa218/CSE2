///////////////////////////////////////////////////////////////////////////////
//Alexis Arancio
//March 8, 2016
//CSE2 hw06
//Text Spinner
//
//Program will create a spinner using an infinite loop
public class TextSpinner{
    public static void main(String [] args){
        
        while (true){
            System.out.print("/\b");//Printing out the symbols for the spinner including the backspaces
            System.out.print("-\b");
            System.out.print("\\\b");
            System.out.print("|\b");
            System.out.print("/\b");
        }
    }//End of main method
}//End of class