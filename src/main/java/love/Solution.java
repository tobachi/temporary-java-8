package love;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Solution {
    public static void main(String args[]) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = new ArrayList<>();
        while (true) {
            list.add(bufferedReader.readLine());
            if (list.size() == 2) break;
        }
        String targetWord = list.get(0);
        String[] dictionary = list.get(1).split(" ");

        System.out.println(value(targetWord, dictionary));
    }

    static int value(String targetWord, String[] dictionary) {
        char[] targetWordArray = targetWord.toCharArray();
        Arrays.sort(targetWordArray);
        Set<Character> targetWordLetters = new HashSet<>();
        for (char letter : targetWordArray) {
            targetWordLetters.add(letter);
        }

        Set<String> dictionarySet = new HashSet<>();
        for (String word : dictionary) {
            dictionarySet.add(word);
        }

        int result = 0;
        for (String dictionaryWord : dictionarySet) {
            Set<Character> dictionaryWordLetters = new HashSet<>();
            char[] dictionaryWordArray = dictionaryWord.toCharArray();
            Arrays.sort(dictionaryWordArray);
            for (char letter : dictionaryWordArray) {
                dictionaryWordLetters.add(letter);
            }
            if (Objects.equals(targetWordLetters, dictionaryWordLetters)) result++;
        }
        return result;
    }
}