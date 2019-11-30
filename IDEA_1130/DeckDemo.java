import javax.crypto.spec.DESedeKeySpec;
import javax.smartcardio.Card;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DeckDemo
{
    public int rank;
    public String suit;
    public static void shuffle(List<DeckDemo> deck) {
        Random rand = new Random();
        for(int i = deck.size() - 1;i > 0; --i){
            int pos=rand.nextInt(i);
            swap(deck,i,pos);
        }
    }
    public static void swap(List<DeckDemo> deck,int i,int j){
        DeckDemo tmp = deck.get(i);
        deck.set(i,deck.get(j));
        deck.set(j,tmp);
    }
   /* public static void send(List<Card> deck.List<List<List<Card>> persons,
                            int numberCard,int numberPerson)
    {
    }*/
   public static final String[] SUITS = {"♠","♥","♣","♦"};
   private static List<DeckDemo> buyDeck(){
       List<DeckDemo> deck = new ArrayList<>(52);
       for(int i = 0; i < 4 ;i++){
           for(int j = 1; j <=13;j++){
               String suit = SUITS[i];
               int rank = j;
               DeckDemo deckDemo = new DeckDemo();
               deckDemo.rank = rank;
               deckDemo.suit = suit;
               deck.add(deckDemo);
           }
       }
       return deck;
   }
   public static void main(String[] args){
       List<DeckDemo> deck = buyDeck();
       System.out.println("刚买回来的牌：");
       System.out.println(deck);
       shuffle(deck);
       System.out.println("洗过的牌：");
       System.out.println(deck); // 三个人，每个人轮流抓 5 张牌
       List<List<Card>> hands = new ArrayList<>();
       hands.add(new ArrayList<>());
       hands.add(new ArrayList<>());
       hands.add(new ArrayList<>());
       for(int i = 0;i < 5;i++){
           for(int j = 0;j < 3; j++){
               hands.get(j).add(deck.remove(0));
           }
       }
       System.out.println("剩余的牌:");
       System.out.println(deck);
       System.out.println("A 手中的牌:");
       System.out.println(hands.get(0));
       System.out.println("B 手中的牌:");
       System.out.println(hands.get(1));
       System.out.println("C 手中的牌:");
       System.out.println(hands.get(2));
   }
}
