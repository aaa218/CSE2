///////////////////////////////////////////////////////////////////////////////
//Alexis Arancio
//March 28, 2016
//CSE2 hw09
//Games
//
//Program will prompt the user to choose one of three mini games
//Each mini game will use input from the user to come up with different outputs
//
import java.util.Scanner;
import java.util.Random;

public class Games{
    public static void main(String [] args){
        Scanner myScanner= new Scanner (System.in);
            
            System.out.println("Welcome to Fun Times game center"); //Asks the user to enter desired game
            System.out.print("Please choose a game: guessTheBox, spinTheWheel or scrambler. ");
                String game=Scanner.nextInt();
            
            boolean userInput=true; //Loop to decide which game will be output based off of users input
            while (userInput){
                if (game.equals ("guessTheBox")){
                    guessTheBox();
                    break;
                }
                else if (game.equals ("spinTheWheel")){
                    spinTheWheel;
                    break;
                }
                else if (game.equals ("scrambler")){
                    scrambler();
                    break;
            }
            else{
                System.out.print("Error. Choose one of the displayed games. Enter a game again: "); //Will print if something other than displayed games is entered
                userInput=true;
                game=Scanner.nextLine();
            }
            }
            }//End of main method
            
    public static void guessTheBox(){ //Method for game 1
        int randomNumber=(Math.random()*3+1); //Random number from 1 to 3
        System.out.println ("Enter a number between 1 and 3: ");
            Scanner myScanner=new Scanner(System.in);
        int inputNumber=Scanner.NextInt();
        
        boolean userInput2=true;
        while (userInput2){
            if (inputNumber==1 || inputNumber==2 || inputNumber==3){ //Loop to output based off of users input
                userInput2=false;
            if (userInput2==randomNumber){
                System.out.print ("YAY! You win a lifetime supply of M&Ms!"); //Will print if user guesses right number
            }
            else{
                System.out.print("Boo. You don't win anything. Try again next time."); //Will print if correct number is not guessed
            }
            }
            else{ 
                System.out.print("Error. Enter a number between 1 and 3: "); //Case in which the number entered is not between 1 and 3
                inputNumber=Scanner.nextInt();
                userInput2=true;
            }
        }
    }
            
    public static void spinTheWheel(){ //Method for game 2
        System.out.print("Choose black or red: ");
        Scanner myScanner=new Scanner(System.in);
        String color=Scanner.nextInt();
    int inputColor=(Math.random()*2+1); //Random generator to ensure black or red is chosen
        String outputColor=" ";
            if(inputColor==1){
                outputColor= "Red";
            }
            else{
                outputColor= "Black";
            }
    boolean spin=true;
    while (spin){
        if(color.equals ("Red") || color.equals ("Black")){
            spin=false;
        System.out.print("Enter a number between 1 and 5: ");
        int number=Scanner.nextInt();
        int num=(int)(Math.random()*5+1); //Random generate for number between 1 and 5
    boolean spin2=true;
    
    while(spin2){ //Loop will run until desired input is made
        if(number >= 1 && number <= 5){
            spin2=false;
        if(num==number){
            System.out.println("The spin is:" + " " + outputColor + " " + num); //Forming print out for the combination of color and random number
            System.out.print("YAY! You win a lifetime supply of M&Ms!");
        }
        else{
            System.out.println("The spin is:" + " " + outputColor + " " + num);
            System.out.print("Boo. You don't win anything. Try again next time.");
        }
        }
        else{
            System.out.print("Error. Enter a number between 1 and 5: "); //If user does not enter a number between 1 and 5
            number=Scanner.nextInt();
            spin2=true;
        }
    }
        }
        else{ //If user does not input either black or red this will print
            System.out.print("Error. Choose black or red: ");
            spin=true;
            color=Scanner.nextLine();
        }
    }
            }
}//End of class