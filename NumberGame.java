import java.util.Scanner;
import java.util.Random;
public class NumberGame{
    public static void main(String args[]){
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Number Guessing  game-----");
        System.out.println(" ");


      int randomNumber  = random.nextInt(100);
      int score = 0;   
      int maxAttempts = 5;
      int attempts = 0;
    
    while (attempts < maxAttempts){
               
    System.out.print("\nEnter your guessed number between 1 to 100 and You have only 5 attempts and also u will get score either 0 or 1 :- ");
       int guessedNumber = sc.nextInt();
       attempts ++;
     
    if (guessedNumber == randomNumber) {
         System.out.println("Yes,It is correct. You Win!!");
         System.out.println("Number of attempts :" + attempts);
         score ++;
         System.out.println("And your score is : "+score);
         System.out.println(" ");         
         break;
        }

        else if (guessedNumber > randomNumber){
            System.out.println("No ! Your guessed number is too higher, Try again  ");
            System.out.println("And your score is: "+score);
        }

        else {
            System.out.println("No! Your guessed number is too lower, Try again  ");
            System.out.println("And your score is: "+score);
        }
    }
     if (attempts == maxAttempts){
         System.out.println("GAME OVER ! \nNo more attempts left , " + " and the number was:-  " + randomNumber);
       }




        System.out.println("Do you want to play again (yes/no)? ");
         String playagain = sc.next();
         if (playagain.equalsIgnoreCase("no")){
            System.out.println("Thanks for playing.");
         } 
         else {
             randomNumber  = random.nextInt(100);
             score = 0;   
             maxAttempts = 5;
             attempts = 0;
             while(attempts < maxAttempts){
            System.out.print("\nEnter your guessed number between 1 to 100 and You have only 5 attempts and also u will get score either 0 or 1 :- ");
            int guessedNumber = sc.nextInt();
            attempts ++;
     
    if (guessedNumber == randomNumber) {
         System.out.println("Yes,It is correct. You Win!!");
         System.out.println("Number of attempts :" + attempts);
         score ++;
         System.out.println("And your score is : "+score);
         System.out.println(" ");         
         break;
        }

        else if (guessedNumber > randomNumber){
            System.out.println("No ! Your guessed number is too higher, Try again  ");
            System.out.println("And your score is: "+score);
        }

        else {
            System.out.println("No! Your guessed number is too lower, Try again  ");
            System.out.println("And your score is: "+score);
        }
    }
     if (attempts == maxAttempts){
         System.out.println("GAME OVER ! \nNo more attempts left , " + " and the number was:-  " + randomNumber);
       }
        System.out.println("Thanks for playing.");
            }
         }     
    }
    

