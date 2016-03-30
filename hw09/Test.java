import java.util.Scanner;
import java.util.Random;
public class Test{                                         
   
    
  
     public static void main(String []args){                                    //create the main method
     
     Scanner input=new Scanner(System.in);
        System.out.println("Welcome to Wolf game center!");
        System.out.print("Please choose one of the mini games:guessTheBox, spinTheWheel, and scrambler. ");
     String game=input.nextLine(); // propmt the user to choose the game he wants to play 
   boolean temp=true;   
   
    while(temp){         // create a loop if the user input wrong game then told him to enter again
   
   
    if(game.equals("guessTheBox")){     
        guessTheBox();
        temp = false;
        }
    else if(game.equals("spinTheWheel")){
      spinTheWheel();  
      temp = false;
    }
    else if(game.equals("scrambler")){
      
      scrambler();
      temp = false;
    }
    
    else{
        System.out.print("Error, you should choose one of the three games above.please enter again: ");
        temp=true;
        game=input.nextLine();
         }
    
        
         }
    }
    
    
        public static void guessTheBox(){         // method for the first game
        int random=(int)(Math.random()*3+1);        // generate a random number between 1 and 3
         System.out.println("Choose a integer number between 1 and 3. ");
         Scanner input = new Scanner(System.in);
         int num=input.nextInt();
        boolean flag=true;
         
         while(flag){                //create a loop if the user input a wrong number can input again 
         if(num==1||num==2||num==3){
         flag=false;
         if(num==random){        // if the number the user input is same as the number of random
             
        System.out.print("Congratulations! You win a Ferrari! ");
        
         }
        else{
            System.out.print("Sorry! You get nothing. ");
        }
         }
         else{
            System.out.print("Error! Please enter a integer number between 1 and 3.Please try again:  ");
            num=input.nextInt();
            flag=true;
         }
        
    }
        }
    public static void spinTheWheel(){      // the method for second game
     System.out.print("Please choose a color between black and red:  "); // enter a color first
        Scanner input = new Scanner(System.in);
        String color=input.nextLine();
        int randomcolor=(int)(Math.random()*2+1);// random generate a number if the number is 1 color is red number is 2 color is black
        String resultcolor="";
        if(randomcolor==1){
            resultcolor="red";
        }
        else{
             resultcolor="black";
        }
        
        
        
        boolean sun=true;
        while(sun){                                                             //create a loop for user if he input a wrong number
        if(color.equals("red")||color.equals("black")){
            sun= false;
            System.out.print("Please choose a number between 1 and 5:  ");
             int yournumber=input.nextInt();
             int rand=(int)(Math.random()*5+1);                                 //random generate a number between 1 and 5
            boolean shi=true;
            
            while(shi){
            if(yournumber>=1&&yournumber<=5){
            shi=false;
            if(rand==yournumber){
                 System.out.println("the result of the spin is "+" "+resultcolor+" "+rand);// turn the result if the user win the prize
                 System.out.print("Congratulations! You win a Ferrari!");
            }
            else{
               System.out.println("the result of the spin is "+" "+resultcolor+" "+rand);// turn the result if the user didn't win the prize
               System.out.print("Sorry! You get nothing. "); 
           }
            }
        
           
            
        
    else{
       System.out.print("Error! Please enter a integer number between 1 and 5.Please try again:  "); 
       yournumber=input.nextInt();
            shi=true;
    }
    
            }
        }
    
    
    else{
        System.out.print("Error! Please choose a color between red and black:  ");
        sun=true;
        color=input.nextLine();
    }
        }  
        
    }
    
     public static void scrambler(){
        System.out.print("Please enter a word:  ");                             // tell the user to enter a word
        Scanner input = new Scanner(System.in);
        String word=input.nextLine(); 
        int wordlength=word.length();                                           //find the word length
        int val=(int)(Math.random()*wordlength+1);                              //random generate the place you want to switch
        String x=word;
                                          
        for(int i=1;i<=10;i++){                                                 //switching 10 times
                                                
        
       
        char firstletter =word.charAt(0);                                       //the first letter of your word
       
       char letter2=word.charAt(val);
        String newword=word.substring(1,val);                                   //string from your firstletter to the switch place not include the firstletter
       
       String newword2=word.substring(val+1,wordlength);                        //string from your switch place to last letter
        x=letter2+newword+firstletter+newword2;                                  
            }
            
       System.out.print(x);                                                     //print the result
         
     }
       
     }
    