import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PickPeaks {

    private static Map result;

    public static void main(String[] args) {

        int[] arr0 = { 0, 1, 2, 5, 1, 0 }; // expected {pos:[3],peaks:[5]}
        result =pickPeaks(arr0);
        System.out.println(result);
        int[] arr1 = { 3, 2, 3, 6, 4, 1, 2, 3, 2, 1, 2, 3 }; // expected {pos:[3,7], peaks:[6,3]}
        result =pickPeaks(arr1);
        System.out.println(result);
        int[] arr2 = {1, 2, 2, 2, 1}; // expected {pos:[1],peaks[2]}
        result =pickPeaks(arr2);
        System.out.println(result);
        int[] arr3 = {1, 2, 2, 2, 3}; // expected {pos:[],peaks:[]}
        result =pickPeaks(arr3);
        System.out.println(result);
        int[] arr4 = {1, 2, 2, 2, 2}; // expected {pos:[],peaks:[]}
        result =pickPeaks(arr4);
        System.out.println(result);
        int[] arr5 = {}; // expected {pos:[],peaks:[]}
        result =pickPeaks(arr5);
        System.out.println(result);

    }

    static Map<String,List<Integer>> pickPeaks(int[] array) {

        Map<String,List<Integer>> result = new HashMap<String,List<Integer>>();
        List<Integer> pos = new ArrayList<>();
        List<Integer> peaks = new ArrayList<>();
        int pointer = 0;
        int value = 0;

        for(int i = 0; i < array.length; i++){
            if(array[i]>value){
                value = array[i];
                pointer = i;
            }
            if(array[i]<value){
                if(pointer == 0){
                }else if(array[pointer-1]<array[pointer]){
                    pos.add(pointer);
                    peaks.add(value);
                }
                value = array[i];
                pointer = i;
            }

        }

        result.put("pos",pos);
        result.put("peaks",peaks);

        return result;

    }

}

/*
 * In this kata, you will write a function that returns the positions and the
 * values of the "peaks" (or local maxima) of a numeric array.
 * 
 * For example, the array arr = [0, 1, 2, 5, 1, 0] has a peak at position 3 with
 * a value of 5 (since arr[3] equals 5).
 * 
 * The output will be returned as a ``Map<String,List>with two key-value
 * pairs:"pos"and"peaks". If there is no peak in the given array, simply return
 * {"pos" => [], "peaks" => []}`.
 * 
 * Example: pickPeaks([3, 2, 3, 6, 4, 1, 2, 3, 2, 1, 2, 3]) should return {pos:
 * [3, 7], peaks: [6, 3]} (or equivalent in other languages)
 * 
 * All input arrays will be valid integer arrays (although it could still be
 * empty), so you won't need to validate the input.
 * 
 * The first and last elements of the array will not be considered as peaks (in
 * the context of a mathematical function, we don't know what is after and
 * before and therefore, we don't know if it is a peak or not).
 * 
 * Also, beware of plateaus !!! [1, 2, 2, 2, 1] has a peak while [1, 2, 2, 2, 3]
 * and [1, 2, 2, 2, 2] do not. In case of a plateau-peak, please only return the
 * position and value of the beginning of the plateau. For example:
 * pickPeaks([1, 2, 2, 2, 1]) returns {pos: [1], peaks: [2]} (or equivalent in
 * other languages)
 * 
 * Have fun!
 */
