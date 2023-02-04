import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Permutations {

    private static Set<String> words = new HashSet<>();

    public static void main(String[] args) {

        singlePermutation("a"); // expected ['a']
        singlePermutation("ab"); // expected ['ab', 'ba']
        singlePermutation("abc"); // expected ['abc','acb','bac','bca','cab','cba']
        singlePermutation("aabb"); // expected ['aabb', 'abab', 'abba', 'baab',
        // 'baba', 'bbaa']
        // singlePermutation("012");

    }

    public static List<String> singlePermutation(String s) {

        String[] tokens = s.split("");
        int[] pointers = new int[tokens.length];

        for (int i = 0; i < pointers.length; i++) {
            pointers[i] = i;
        }

        permute(pointers, 0, tokens);

        List<String> result = new ArrayList<String>();
        result.addAll(Permutations.words);

        Permutations.words.clear();

        for (String r : result) {
            System.out.println(r);
        }

        return result;

    }

    private static void permute(int[] arr, int index, String[] tokens) {
        if (index == arr.length) {

            String word = "";

            for (int i = 0; i < tokens.length; i++) {
                word = word + tokens[arr[i]];
            }

            Permutations.words.add(word);

        }
        for (int i = index; i < arr.length; i++) {
            swap(arr, i, index);
            permute(arr, index + 1, tokens);
            swap(arr, i, index);
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}

/*
 * 
 * In this kata, your task is to create all permutations of a non-empty input
 * string and remove duplicates, if present.
 * 
 * Create as many "shufflings" as you can!
 * 
 * Examples:
 * 
 * With input 'a':
 * Your function should return: ['a']
 * 
 * With input 'ab':
 * Your function should return ['ab', 'ba']
 * 
 * With input 'abc':
 * Your function should return ['abc','acb','bac','bca','cab','cba']
 * 
 * With input 'aabb':
 * Your function should return ['aabb', 'abab', 'abba', 'baab', 'baba', 'bbaa']
 * Note: The order of the permutations doesn't matter.
 * 
 * Good luck!
 * 
 */
