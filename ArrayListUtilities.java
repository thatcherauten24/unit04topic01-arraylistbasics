import java.util.ArrayList;

public class ArrayListUtilities {
    public static int getListMax(ArrayList<Integer> items) {
        int max = items.get(0);

        for (int i = 1; i < items.size(); i++) {
            if (items.get(i) > max) {
                max = items.get(i);
            }
        }
        return max;
    }

    public static ArrayList<String> withoutLongWords(ArrayList<String> withLongWords) {
        ArrayList<String> result = withLongWords;

        for (int i = result.size() - 1; i > 0; i--) {
            if (result.get(i).length() > 5) {
                result.remove(i);
            }
        }

        return result;
    }

    public static void removeLongWords(ArrayList<String> withLongWords) {
        for (int i = withLongWords.size() - 1; i > 0; i--) {
            if (withLongWords.get(i).length() > 5) {
                withLongWords.remove(i);
            }
        }
    }

    public static ArrayList<Double> reversed(ArrayList<Double> nums) {
        ArrayList<Double> reversedNums = new ArrayList<Double>();

        for (int i = nums.size() - 1; i >= 0; i--) {
            reversedNums.add(nums.get(i));
        }
        return reversedNums;
    }

    public static void reverseInPlace(ArrayList<Double> nums) {
        for (int fromEnd = nums.size() - 1; fromEnd >= 0; fromEnd--) {    
            for (int fromStart = 0; fromStart < nums.size(); fromStart++) {
                nums.add(fromStart, nums.get(fromEnd));
            }
        }
    }

    public static void main(String[] args) {
        
    }
}