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

        for (int i = withLongWords.size() - 1; i > 0; i--) {
            if (withLongWords.get(i).length() > 5) {
                withLongWords.remove(i);
            }
        }

        return result;
    }

    public static void removeLongWords(ArrayList<String> withLongWords) {

    }

    public static void main(String[] args) {
        
    }
}