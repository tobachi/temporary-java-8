package love;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    private static String targetWord;
    private static String[] dictionary = new String[22];

    @Before
    public void init() {
        targetWord = "love";
        dictionary[0] = "velo";
        dictionary[1] = "low";
        dictionary[2] = "vole";
        dictionary[3] = "lovee";
        dictionary[4] = "volvell";
        dictionary[5] = "lowly";
        dictionary[6] = "lower";
        dictionary[7] = "lover";
        dictionary[8] = "levo";
        dictionary[9] = "loved";
        dictionary[10] = "love";
        dictionary[11] = "lovee";
        dictionary[12] = "lowe";
        dictionary[13] = "lowes";
        dictionary[14] = "lovey";
        dictionary[15] = "lowan";
        dictionary[16] = "lowa";
        dictionary[17] = "evolve";
        dictionary[18] = "loves";
        dictionary[19] = "volvelle";
        dictionary[20] = "lowed";
        dictionary[21] = "love";
    }

    @Test
    public void result() {
        int result = Solution.value(targetWord, dictionary);
        assertEquals(8, result);
    }

}