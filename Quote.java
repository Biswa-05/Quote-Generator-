import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class QuoteGenerator {

    private static List<String> quotes = new ArrayList<>();

    static {
        // Add some sample quotes to the list
        quotes.add("The only way to do great work is to love what you do. - Steve Jobs");
        quotes.add("The future belongs to those who believe in the beauty of their dreams. - Eleanor Roosevelt");
        quotes.add("The greatest glory in living lies not in never falling, but in rising every time we fall. - Nelson Mandela");
        quotes.add("Believe you can and you're halfway there. - Theodore Roosevelt");
        quotes.add("A rose by any other name would smell as sweet.	 - William Shakespeare	");
        quotes.add("Ask not what your country can do for you; ask what you can do for your country.	 - John Kennedy	");
        quotes.add("Ask, and it shall be given you; seek, and you shall find.	 - the Bible	");
        quotes.add("Eighty percent of success is showing up.	 - Woody Allen	");
        quotes.add("Genius is one percent inspiration and ninety-nine percent perspiration.	 - Thomas Edison	");
        quotes.add("He travels the fastest who travels alone.	 - Rudyard Kipling	");
        quotes.add("If at first you don’t succeed, try, try again.	 - W. E. Hickson	");
        quotes.add("If you are going through hell, keep going.	 - Winston Churchill	");
    }

    public static String getRandomQuote() {
        Random random = new Random();
        int index = random.nextInt(quotes.size());
        return quotes.get(index);
    }

    public static void main(String[] args) {
        System.out.println(getRandomQuote());
    }
}
