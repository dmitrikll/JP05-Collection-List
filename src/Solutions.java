import java.util.List;

public class Solutions {

    public int countOccurance(List<String> wordList, String targetWord) {
        int count = 0;

        for (String word : wordList) {
            if (word.equals(targetWord)) {
                count += 1;
            }
        }
        return count;
    }
}
