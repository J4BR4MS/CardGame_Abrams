import java.util.ArrayList;

class Player
{
    private String name;
    private ArrayList<Card> hand;
    private int points;

    public Player(String name)
    {
        this.name = name;
        hand = new ArrayList<>();
        points = 0;
    }

    public Player(String name, ArrayList<Card> hand)
    {
        this.name = name;
        this.hand = hand;
        points = 0;
    }

    public String getName()
    {
        return name;
    }

    public ArrayList<Card> getHand()
    {
        return hand;
    }

    public int getPoints()
    {
        return points;
    }

    public void addPoints(int addedPoint)
    {
        points += addedPoint;
    }

    public void addCard(Card card)
    {
        hand.add(card);
    }

    public String toString()
    {
        String temp = name + " has " + points + " points\n";
        temp += name + "'s cards: " + hand.toString();
        return temp;
    }
}
