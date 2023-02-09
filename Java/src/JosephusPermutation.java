import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JosephusPermutation {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        josephusPermutation(list, -1); // expected {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}
        // josephusPermutation(list, 2); // expected {2, 4, 6, 8, 10, 3, 7, 1, 9, 5}

        list = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        // josephusPermutation(list, 3); // expected {3, 6, 2, 7, 5, 1, 4}

        List<String> lista = new ArrayList<String>(Arrays.asList("C", "o", "d", "e", "W", "a", "r", "s"));
        // josephusPermutation(lista, 4); // expected {"e", "s", "W", "o", "C", "d",
        // "r", "a"}

    }

    public static <T> List<T> josephusPermutation(final List<T> items, final int k) {

        List<T> result = new ArrayList<>();

        int count = 1;

        while (items.size() > 0) {
            if (count > k)
                break;
            for (int i = 0; i < items.size(); i++) {
                if (count == k) {
                    result.add(items.get(i));
                    items.remove(i);
                    count = 1;
                    i -= 1;
                    continue;
                }
                count++;
            }
        }

        for (T r : result) {
            System.out.println(r);
        }

        return result;

    }

}

/*
 * This problem takes its name by arguably the most important event in the life
 * of the ancient historian Josephus: according to his tale, he and his 40
 * soldiers were trapped in a cave by the Romans during a siege.
 * 
 * Refusing to surrender to the enemy, they instead opted for mass suicide, with
 * a twist: they formed a circle and proceeded to kill one man every three,
 * until one last man was left (and that it was supposed to kill himself to end
 * the act).
 * 
 * Well, Josephus and another man were the last two and, as we now know every
 * detail of the story, you may have correctly guessed that they didn't exactly
 * follow through the original idea.
 * 
 * You are now to create a function that returns a Josephus permutation, taking
 * as parameters the initial array/list of items to be permuted as if they were
 * in a circle and counted out every k places until none remained.
 * 
 * Tips and notes: it helps to start counting from 1 up to n, instead of the
 * usual range 0..n-1; k will always be >=1.
 * 
 * For example, with n=7 and k=3 josephus(7,3) should act this way.
 * 
 * [1,2,3,4,5,6,7] - initial sequence
 * [1,2,4,5,6,7] => 3 is counted out and goes into the result [3]
 * [1,2,4,5,7] => 6 is counted out and goes into the result [3,6]
 * [1,4,5,7] => 2 is counted out and goes into the result [3,6,2]
 * [1,4,5] => 7 is counted out and goes into the result [3,6,2,7]
 * [1,4] => 5 is counted out and goes into the result [3,6,2,7,5]
 * [4] => 1 is counted out and goes into the result [3,6,2,7,5,1]
 * [] => 4 is counted out and goes into the result [3,6,2,7,5,1,4]
 * So our final result is:
 * 
 * josephus([1,2,3,4,5,6,7],3)==[3,6,2,7,5,1,4]
 * For more info, browse the Josephus Permutation page on wikipedia; related
 * kata: Josephus Survivor.
 * 
 * Also, live game demo by OmniZoetrope.
 */