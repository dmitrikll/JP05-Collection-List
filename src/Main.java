import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Solutions solution = new Solutions();

        //TIP Task01
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

         //TIP task02
        int[] arr = {1,2,3,4,5,6,7,};
        List<Integer> arrayToList = solution.arrayToList(arr);

        System.out.println("Array " + java.util.Arrays.toString(arr));
        System.out.println("List " + arrayToList);
    }
}



