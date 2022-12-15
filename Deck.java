import java.util.ArrayList;

public class Deck
{
    private ArrayList<Card> cards;
    private int cardsLeft;

    public Deck() {
        cards = new ArrayList<>(String[]ranks, String[]suits,int[] values);
        for (int i = 0; i < ranks.length; i++) {
            for (int j = 0; j < suits.length; j++) {
                cards.add(new Card(ranks[i], suits[j], values[i]));
            }
        }

        cardsLeft = cards.size();
        shuffle();

    }

    public boolean isEmpty() {
        return cardsLeft == 0;
    }

    public int getCardsLeft()
    {
        return cardsLeft;
    }

    public Card deal()
    {
        if(isEmpty())
        {
            return null;
        }

        cardsLeft--;
        return cards.get(CardsLeft);
    }

    public void shuffle()
    {
        for(int i = 0; i < cards.size; i++) {
            int x = (int) (math.random() * card.size())
            Card temp = cards.get(i);
            cards.set(i, cards.get(x));
            cards.set(x, temp);
        }

        cardsLeft = cards.size();
    }
}
