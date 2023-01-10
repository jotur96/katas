import java.util.*;

public class LongestConsec {

    public static void main(String[] args) {

        longestConsect(new String[] { "zone", "abigail", "theta", "form", "libe", "zas", "theta", "abigail" }, 2);

    }

    public static String longestConsect(String[] strarr, int k) {

        int count = 0;

        List<String> array = new ArrayList<>(); 

        for (int i = 0; i < strarr.length; i++) {
            String strings = "";
            int counTemp = 0;

            if( strarr.length < (i+k)){
                for( int j = i; j <= k; j++){
                    strings = strings+strarr[j];
                }
                array.add(strings);
                count = strings.length();
            }
        }

        for(String s : array){
            if(s.length() == count){
                return s;
            }
        }

        System.out.println(" ads" );

        return "";

    }

}
