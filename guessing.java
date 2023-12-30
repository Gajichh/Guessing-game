import java.util.*;
public class guessing {

   public static void game(int dif){
    Scanner sc = new Scanner(System.in);
       if(dif<1 || dif>5) throw new RuntimeException("You MUST Choose a Difficulty between 1 and 5.");
       

       int guess = 0;
       if(dif == 1) guess = 10;
          if(dif == 2) guess = 7;
            if(dif == 3) guess = 5;      // Difficulty decides the number of guesses you get.
              if(dif == 4) guess = 3;
                if(dif == 5) guess = 1;
                

       int num = (int) ((999 - 100 + 1)*Math.random() + 100);   // this generates the 3 digit number that you have to guess.

       System.out.println("Guess: ");
       int a = sc.nextInt();

       while(a!=num && guess>0){
        guess--;
        if(a<num){
            System.out.println("Higher.");
        } else System.out.println("Lower.");        // this checks if the number you guessed is lower or higher than the number you need to guess.
        System.out.println("["+ guess +"] Guess Again: ");
        a = sc.nextInt();
       }

       if(a==num) System.out.println("Great job!");    // You won!
       else System.out.println("You Failed!");   // You lost.
   }


   public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     System.out.println("Choose the difficulty (1-5): ");
     try{
        int dif = sc.nextInt();
        game(dif);
     }
     catch(InputMismatchException e){
        System.out.println("You MUST enter an Integer.");
     }
     catch(RuntimeException e){
        System.out.println("You MUST Choose a Difficulty between 1 and 5.");
     }
     catch(Exception e){
        System.out.println("System Error.");
     }
   }
}
