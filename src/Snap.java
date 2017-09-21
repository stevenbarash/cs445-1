public class Snap {
    public static void main(String[] args) {
        MultiDS<Card> deck = new MultiDS<>(52);
        MultiDS<Card> player1 = new MultiDS<>(52);
        MultiDS<Card> player2 = new MultiDS<>(52);


        //create deck


        Card d2 = new Card(Card.Suits.Diamonds, Card.Ranks.Two);
        Card d3 = new Card(Card.Suits.Diamonds, Card.Ranks.Three);
        Card d4 = new Card(Card.Suits.Diamonds, Card.Ranks.Four);
        Card d5 = new Card(Card.Suits.Diamonds, Card.Ranks.Five);
        Card d6 = new Card(Card.Suits.Diamonds, Card.Ranks.Six);
        Card d7 = new Card(Card.Suits.Diamonds, Card.Ranks.Seven);
        Card d8 = new Card(Card.Suits.Diamonds, Card.Ranks.Eight);
        Card d9 = new Card(Card.Suits.Diamonds, Card.Ranks.Nine);
        Card d10 = new Card(Card.Suits.Diamonds, Card.Ranks.Ten);
        Card dj = new Card(Card.Suits.Diamonds, Card.Ranks.Jack);
        Card dq = new Card(Card.Suits.Diamonds, Card.Ranks.Queen);
        Card dk = new Card(Card.Suits.Diamonds, Card.Ranks.King);
        Card da = new Card(Card.Suits.Diamonds, Card.Ranks.Ace);

        deck.addItem(d2);
        deck.addItem(d3);
        deck.addItem(d4);
        deck.addItem(d5);
        deck.addItem(d6);
        deck.addItem(d7);
        deck.addItem(d8);
        deck.addItem(d9);
        deck.addItem(d10);
        deck.addItem(dj);
        deck.addItem(dq);
        deck.addItem(dk);
        deck.addItem(da);


        Card c2 = new Card(Card.Suits.Clubs, Card.Ranks.Two);
        Card c3 = new Card(Card.Suits.Clubs, Card.Ranks.Three);
        Card c4 = new Card(Card.Suits.Clubs, Card.Ranks.Four);
        Card c5 = new Card(Card.Suits.Clubs, Card.Ranks.Five);
        Card c6 = new Card(Card.Suits.Clubs, Card.Ranks.Six);
        Card c7 = new Card(Card.Suits.Clubs, Card.Ranks.Seven);
        Card c8 = new Card(Card.Suits.Clubs, Card.Ranks.Eight);
        Card c9 = new Card(Card.Suits.Clubs, Card.Ranks.Nine);
        Card c10 = new Card(Card.Suits.Clubs, Card.Ranks.Ten);
        Card cj = new Card(Card.Suits.Clubs, Card.Ranks.Jack);
        Card cq = new Card(Card.Suits.Clubs, Card.Ranks.Queen);
        Card ck = new Card(Card.Suits.Clubs, Card.Ranks.King);
        Card ca = new Card(Card.Suits.Clubs, Card.Ranks.Ace);

        deck.addItem(c2);
        deck.addItem(c3);
        deck.addItem(c4);
        deck.addItem(c5);
        deck.addItem(c6);
        deck.addItem(c7);
        deck.addItem(c8);
        deck.addItem(c9);
        deck.addItem(c10);
        deck.addItem(cj);
        deck.addItem(cq);
        deck.addItem(ck);
        deck.addItem(ca);

        Card h2 = new Card(Card.Suits.Hearts, Card.Ranks.Two);
        Card h3 = new Card(Card.Suits.Hearts, Card.Ranks.Three);
        Card h4 = new Card(Card.Suits.Hearts, Card.Ranks.Four);
        Card h5 = new Card(Card.Suits.Hearts, Card.Ranks.Five);
        Card h6 = new Card(Card.Suits.Hearts, Card.Ranks.Six);
        Card h7 = new Card(Card.Suits.Hearts, Card.Ranks.Seven);
        Card h8 = new Card(Card.Suits.Hearts, Card.Ranks.Eight);
        Card h9 = new Card(Card.Suits.Hearts, Card.Ranks.Nine);
        Card h10 = new Card(Card.Suits.Hearts, Card.Ranks.Ten);
        Card hj = new Card(Card.Suits.Hearts, Card.Ranks.Jack);
        Card hq = new Card(Card.Suits.Hearts, Card.Ranks.Queen);
        Card hk = new Card(Card.Suits.Hearts, Card.Ranks.King);
        Card ha = new Card(Card.Suits.Hearts, Card.Ranks.Ace);

        deck.addItem(h3);
        deck.addItem(h4);
        deck.addItem(h5);
        deck.addItem(h6);
        deck.addItem(h7);
        deck.addItem(h8);
        deck.addItem(h9);
        deck.addItem(h10);
        deck.addItem(hj);
        deck.addItem(hq);
        deck.addItem(hk);
        deck.addItem(ha);

        Card s2 = new Card(Card.Suits.Spades, Card.Ranks.Two);
        Card s3 = new Card(Card.Suits.Spades, Card.Ranks.Three);
        Card s4 = new Card(Card.Suits.Spades, Card.Ranks.Four);
        Card s5 = new Card(Card.Suits.Spades, Card.Ranks.Five);
        Card s6 = new Card(Card.Suits.Spades, Card.Ranks.Six);
        Card s7 = new Card(Card.Suits.Spades, Card.Ranks.Seven);
        Card s8 = new Card(Card.Suits.Spades, Card.Ranks.Eight);
        Card s9 = new Card(Card.Suits.Spades, Card.Ranks.Nine);
        Card s10 = new Card(Card.Suits.Spades, Card.Ranks.Ten);
        Card sj = new Card(Card.Suits.Spades, Card.Ranks.Jack);
        Card sq = new Card(Card.Suits.Spades, Card.Ranks.Queen);
        Card sk = new Card(Card.Suits.Spades, Card.Ranks.King);
        Card sa = new Card(Card.Suits.Spades, Card.Ranks.Ace);

        deck.addItem(s2);
        deck.addItem(s3);
        deck.addItem(s4);
        deck.addItem(s5);
        deck.addItem(s6);
        deck.addItem(s7);
        deck.addItem(s8);
        deck.addItem(s9);
        deck.addItem(s10);
        deck.addItem(sj);
        deck.addItem(sq);
        deck.addItem(sk);
        deck.addItem(sa);

        deck.shuffle();
        System.out.println(deck.toString());

        for (int i = 0; i < 26; i++) {
            player1.addItem(deck.removeItem());
        }
        for (int i = 0; i < 26; i++) {
            player2.addItem(deck.removeItem());
        }
        System.out.println(player1.toString());
        System.out.println(player2.toString());

    }
}