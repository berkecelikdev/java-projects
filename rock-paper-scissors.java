import java.util.Random;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String userChoice;
        String computerChoice;
        String[] choices = {"rock", "paper", "scissors"};
        String playAgain = "yes";
        int wins = 0;
        int loses = 0;
        int draws = 0;
        int gamesPlayed = 0;

        do{
            System.out.print("Enter your move (rock, paper, scissors): ");
            userChoice = scanner.nextLine().toLowerCase();

            if(!userChoice.equals("rock") && !userChoice.equals("paper") && !userChoice.equals("scissors")){
                System.out.println("Invalid choice!");
                continue;
            }

            computerChoice = choices[random.nextInt(3)];
            System.out.println("Computer choice: " + computerChoice);

            if(userChoice.equals(computerChoice)){
                System.out.println("It's draw!");
                draws++;
            }
            else if((userChoice.equals("rock") && computerChoice.equals("scissors"))
                    || (userChoice.equals("paper") && computerChoice.equals("rock"))
                    || (userChoice.equals("scissors") && computerChoice.equals("paper"))){
                System.out.println("You win!");
                wins++;
            }
            else{
                System.out.println("You lose!");
                loses++;
            }

            gamesPlayed++;

            System.out.print("Play again (yes / no): ");
            playAgain = scanner.nextLine().toLowerCase();

        }while(playAgain.equals("yes"));

        System.out.println("*********************");
        System.out.println("Thanks for playing!");
        System.out.println("Games Played: " + gamesPlayed);
        System.out.println("Wins: " + wins);
        System.out.println("Loses: " + loses);
        System.out.println("Draws: " + draws);
        System.out.println("*********************");

        
        scanner.close();
    }
}

