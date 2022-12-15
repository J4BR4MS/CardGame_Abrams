import java.util.ArrayList;

public class Card
{
    private int rank;
    private String suit;
    private int point;

    public Card(int rank, String suit, int point)
    {
        this.rank = rank;
        this.suit = suit;
        this.point = point;
    }

    public void setRank(int rank)
    {
        this.rank = rank;
    }

    public void setSuit(String suit)
    {
        this.suit = suit;
    }

    public void setPoint(int point)
    {
        this.point = point;
    }

    public int getRank()
    {
        return rank;
    }

    public String getSuit(String suit)
    {
        return suit;
    }

    public int getPoint(int point)
    {
        return point;
    }

    public String toString()
    {
        return rank + " of " + suit;
    }
}


























//    private ArrayList<Integer[][]> cards = new ArrayList<Integer[][]>();
//
////    public Card(int rank, String suit, ArrayList<Integer> cards)
////    {
////        this.rank = rank;
////        this.suit = suit;
////        this.cards = cards;
////    }
//
//    public void createCards()
//    {
//        for(int i = 2; i < 15; i++)
//        {
//            cards.add();
//        }
//    }
