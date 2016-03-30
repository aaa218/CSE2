///////////////////////////////////////////////////////////////////////////////
//Alexis Arancio
//March 25, 2016
//CSE2 lab09
//Methods
//
//Program will generate basic random sentences
import java.util.Random;

public class Methods{
    public static void main(String [] args{
        
    Random randomGenerator= new Random();
    int randomInt= randomGenerator.nextInt(10); //Generates random integers less than 10
    
    num=(int)(Math.random()*10);
    String word1=adjectives(num);
    
    num=(int)(Math.random()*10);
    String word2=nouns(num);
    
    num=(int)(Math.random()*10);
    String word3=verbs(num);
    
    num=(int)(Math.random()*10);
    String word4=adjectives(num);
    
    num=(int)(Math.random()*10);
    String word5=nouns(num);
    
    boolean answer= false;

    public static String adjectives (int x){
        
        switch(words){
            case 1:
                rank= "happy";
            break;
            case 2:
                rank= "sad";
            break;
            case 3:
                rank= "hungry";
            break;
            case 4:
                rank= "slow";
            break;
            case 5:
                rank= "tiny";
            break;
            case 6:
                rank= "fat";
            break;
            case 7:
                rank= "smelly";
            break;
            case 8:
                rank= "funny";
            break;
            case 9:
                rank= "goofy";
    }
    public static String nouns(int x){
        switch(words){
            case 1:
                rank= "strawberry";
            break;
            case 2:
                rank= "deer";
            break;
            case 3:
                rank= "computer";
            break;
            case 4:
                rank= "ball";
            break;
            case 5:
                rank= "lollipop";
            break;
            case 6:
                rank= "cow";
            break;
            case 7:
                rank= "bed";
            break;
            case 8:
                rank= "dog";
            break;
            case 9:
                rank= "tiger";
    }
    public static String verbs(int x) {
      switch(words){
            case 1:
                rank= "laugh";
            break;
            case 2:
                rank= "jumped";
            break;
            case 3:
                rank= "danced";
            break;
            case 4:
                rank= "walked";
            break;
            case 5:
                rank= "slapped";
            break;
            case 6:
                rank= "studied";
            break;
            case 7:
                rank= "sleep";
            break;
            case 8:
                rank= "cried";
            break;
            case 9:
                rank= "ate";
    }  
  
    } //End of main method
} //End of class
