import java.util.*;

public class Article {
    private String heading;
    private String body;
    private String author;

    // Constructor
    public Article(String heading, String body, String author) {
        this.heading = heading;
        this.body = body;
        this.author = author;
    }

    // Getters
    public String getHeading() {
        return heading;
    }

    public String getBody() {
        return body;
    }

    public String getAuthor() {
        return author;
    }

    // Setters
    public void setHeading(String heading) {
        this.heading = heading;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    // Method to get the longest word in the body
    public String getLongestWord() {
        String[] words = body.split("\\W+"); // Split body into words, ignoring punctuation
        String longestWord = "";
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        return longestWord;
    }

    // Method to get unique words in the body
    public Set<String> getWords() {
        String[] words = body.split("\\W+"); // Split body into words, ignoring punctuation
        return new HashSet<>(Arrays.asList(words)); // Convert to a set to remove duplicates
    }

    public static void main(String[] args) {
        // Create an article instance
        Article article = new Article(
                "Exciting News!",
                "This is a very exciting article about exciting things happening all around the world. Exciting, isn’t it?",
                "John Doe"
        );

        // Test longest word
        System.out.println("Longest word: " + article.getLongestWord());

        // Test unique words
        System.out.println("Unique words: " + article.getWords());
    }
}
