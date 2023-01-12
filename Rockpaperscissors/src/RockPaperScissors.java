













import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 0 for Rock,1 for Paper,2 for Scissors");
        int userInput= sc.nextInt();
        Random random=new Random();
        int computerInput=random.nextInt(3);
        if (userInput==computerInput){
            System.out.println("Game Draw!!!");
        } else if (userInput==0 && computerInput==2 || userInput==1 && computerInput==0 || userInput==2 && computerInput==1) {
            System.out.println("Hurray!!!! You Win");
        }
        else {
            System.out.println("Oh!! you Lose");
        }

        // Computer choice;
        if(computerInput==0){
            System.out.println("computer choice is : Rock");
        } else if (computerInput==1) {
            System.out.println("computer choice : Paper");

        } else if (computerInput==2) {
            System.out.println("computer choice is : Scissors");

        }

    }
}
