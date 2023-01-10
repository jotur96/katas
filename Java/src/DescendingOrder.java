import java.util.Arrays;

public class DescendingOrder {

    public static void main(String[] args) {

        DescendingOrderTest.test();
        
    }

    public static int sortDesc(int num){

        String[] numParsed = Integer.toString(num).split("");
        String numReturn = "";
        int pointer = 0;

        while(pointer < numParsed.length) {




        }    
        
        // for(int i = numParsed.length-1; i >= 0 ; i--){
        //     numReturn = numReturn + numParsed[i];
        // }

        return Integer.valueOf(numReturn);
    }

}

/*
 * Your task is to make a function that can take any non-negative integer as an
 * argument and return it with its digits in descending order. Essentially,
 * rearrange the digits to create the highest possible number.
 * 
 * Examples:
 * Input: 42145 Output: 54421
 * 
 * Input: 145263 Output: 654321
 * 
 * Input: 123456789 Output: 987654321
 */