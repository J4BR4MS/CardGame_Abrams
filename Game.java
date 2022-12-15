import java.util.ArrayList;
import java.util.Scanner;

class Game
{
    private Deck
    private Player user;
    private Player cpu;

    public Game(Deck deck, Player user, Player cpu)
    {
        this.deck = deck;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Name: ");
        String name = scanner.nextLine();
        user = new Player(name);

        this.cpu = cpu;
    }

    public String printInstructions()
    {
        System.out.println("The goal of the game is for the sum of your cards to be closer to 21 than the dealer's. " +
                "You will be dealt 2 cards initially and can choose to draw another card or stay with your hand. The " +
                "dealer will continue to draw cards until he has a sum of 17 or above. If your cards total over 21, you" +
                "lose. If the dealer's cards total over 21, the dealer loses. If both you and the dealer go over, it " +
                "is a draw.");
    }

    public void playGame()
    {
        deck.shuffle();

        for (int i = 0; i < 2; i++) {
            Card temp = deck.deal();
            user.addCard(temp);
        }

        for (int i = 0; i < 2; i++) {
            Card cpu = deck.deal();
            cpu.addCard(temp);
        }

        boolean alive ==true;
        boolean hit ==true;

        while (hit) {
            user.toString;
            cpu.toString;
            String answer;
            while (answer.equals(stand) || answer.equals("hit")) {
                System.out.println("Would you like to draw another card or stand? (hit/stand)");
                Scanner temp = new Scanner(System.in);
                answer = temp.nextLine();
            }

            if (answer.equals("hit")) {
                Card card = deck.deal();
                user.addCard(card);
            }

            if (answer.equals("stand")) {
                hit == false;
            }

            if (user.getPoints() > 21) {
                System.out.println("You went over 21. You lose.");
                alive == false;
                hit == false;
            }

        }


        while (cpu.getPoints < 16) {
            Card temp = deck.deal();
            cpu.addCard(temp);
        }

        if (alive == true && cpu.getPoints < 22)
        {
            if(user.getPoints() > cpu.getPoints)
            {
                System.out.println("You win!");
            }
            if(user.getPoints() < cpu.getPoints)
            {
                System.out.println("You lose.");
            }
            if(user.getPoints() = cpu.getPoints)
            {
                System.out.println("Draw.");
            }
        }
    }
    public void Main()
    {
        Player user = new Player();
        Player cpu = new Player("CPU");
        Deck d = new Deck();
        Game g = new Game(d, user, cpu);
        playGame();
    }
}
