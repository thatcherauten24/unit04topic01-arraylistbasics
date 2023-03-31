import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class ArrayListUtilitiesTest {
    @Test
    public void testGetListMax() {
        ArrayList<Integer> input;
        int expectedOutput;
        int actualOutput;

        // some positive numbers
        input = new ArrayList<>(Arrays.asList(1, 5, 4, 9, 2, 1));
        expectedOutput = 9;
        actualOutput = ArrayListUtilities.getListMax(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testWithoutLongWords() {
        ArrayList<String> input;
        ArrayList<String> expectedOutput;
        ArrayList<String> actualOutput;

        // some positive numbers
        input = new ArrayList<>(Arrays.asList("rat", "paper", "computer", "bomb", "mouse", "keyboard"));
        expectedOutput = new ArrayList<String> (Arrays.asList("rat", "paper", "bomb", "mouse"));
        actualOutput = ArrayListUtilities.withoutLongWords(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testRemoveLongWords() {
        ArrayList<String> original;
        ArrayList<String> expectedFinal;

        // some positive numbers
        original = new ArrayList<>(Arrays.asList("rat", "paper", "computer", "bomb", "mouse", "keyboard"));
        expectedFinal = new ArrayList<String> (Arrays.asList("rat", "paper", "bomb", "mouse"));
        ArrayListUtilities.removeLongWords(original);
        assertEquals(expectedFinal, original);
    }

    @Test
    public void testReversed() {
        ArrayList<Double> input;
        ArrayList<Double> expectedOutput;
        ArrayList<Double> actualOutput;

        // some positive numbers
        input = new ArrayList<>(Arrays.asList(12.0, 3.5, 8.9, 6.1));
        expectedOutput = new ArrayList<Double> (Arrays.asList(6.1, 8.9, 3.5, 12.0));
        actualOutput = ArrayListUtilities.reversed(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testreverseInPlace() {
        ArrayList<Double> original;
        ArrayList<Double> expectedFinal;

        // some positive numbers
        original = new ArrayList<>(Arrays.asList(12.0, 3.5, 8.9, 6.1));
        expectedFinal = new ArrayList<Double> (Arrays.asList(6.1, 8.9, 3.5, 12.0));
        ArrayListUtilities.reverseInPlace(original);
        assertEquals(expectedFinal, original);
    }

    

}
