import java.util.ArrayList;

public class DeadFish {

    private static int result [];

    public static void main(String[] args) {

        
        result = DeadFish.parse("iiisdoso"); // Expected result {8, 64}
        System.out.println("{"+result[0]+", "+result[1]+"}");

        result = DeadFish.parse("iiisdosodddddiso"); // Expected result {8, 64, 3600}
        System.out.println("{"+result[0]+", "+result[1]+", "+result[2]+"}");


    }

    public static int[] parse(String data) {    

        // Implement me! :)
        ArrayList<Integer> tempArray = new ArrayList<Integer>();
        int numTemp = 0;

        String[] dataStr = data.split("");

        for (String s : dataStr) {
            if (s.equals("i")) {
                numTemp++;
            }
            if (s.equals("d")) {
                numTemp--;
            }
            if (s.equals("s")) {
                numTemp = numTemp * numTemp;
            }
            if (s.equals("o")) {
                tempArray.add(numTemp);
            }
        }

        int[] result = new int[tempArray.size()];

        for (int i = 0; i < tempArray.size(); i++) {
            result[i] = tempArray.get(i);
        }

        return result;
    }

}

/*
Write a simple parser that will parse and run Deadfish.

Deadfish has 4 commands, each 1 character long:

i increments the value (initially 0)
d decrements the value
s squares the value
o outputs the value into the return array
Invalid characters should be ignored.

*/