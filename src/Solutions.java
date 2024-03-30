import java.util.ArrayList;
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

    public List<Integer> arrayToList(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for (int num : arr) {
            list.add(num);
        }
        return list;
    }

    public List<Integer> findUnique(List<Integer> nums) {
        List<Integer> uniqueList = new ArrayList<>();

        for (Integer num : nums) {
            if (!uniqueList.contains(num)) {
                uniqueList.add(num);
            }
        }
        return uniqueList;
    }
}
