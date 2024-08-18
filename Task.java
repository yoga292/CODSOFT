import java.util.*;
public class Task{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random rand=new Random();
        int score=0;
        boolean again;
        do {
            int att=0;
            int maxAtt=10;
            int toguess=rand.nextInt(101);
            boolean guess=false;
            System.out.println("Guess the number between 1 to 100:");
            while(att<maxAtt && !guess)
            {
                System.out.print("Enter your guess:");
                int n=sc.nextInt();
                att++;
                if(n==toguess){
                    System.out.println("You have guessed the correct number");
                    guess=true;
                    score+=(maxAtt-att+1);
                }
                else if(n<toguess) {
                    System.out.println("Your guess is too low");
                }
                else {
                    System.out.println("Your guess is too high");
                }
                if(!guess&&att==maxAtt) {
                    System.out.println("Sorry you have used all your attempts");
                }
            }
            System.out.print("Would you like to play again?(YES/NO)");
            again=sc.next().equalsIgnoreCase("yes");
        } while(again);
        System.out.println("Your final score is: "+score);

    }
}
