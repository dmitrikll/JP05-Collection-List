import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Solutions solution = new Solutions();

        ArrayList<String> wordList = new ArrayList<>();
        wordList.add("mango");
        wordList.add("kiwi");
        wordList.add("banana");
        wordList.add("melon");
        wordList.add("blackberry");
        wordList.add("cherry");
        wordList.add("lime");
        wordList.add("grape");
        wordList.add("orange");
        wordList.add("melon");
        wordList.add("olive");
        wordList.add("apple");

        String targetWord = "melon";
        int countWord = solution.countOccurance(wordList, targetWord);

        System.out.println("The word " + targetWord + " appears " + countWord + " times in the list.");

    }
}




