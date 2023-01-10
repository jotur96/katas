import java.util.ArrayList;
import java.util.*;

public class SumSquaredDivisors {

    public static void main(String[] args) {

        listSquared(1, 250);

    }

    public static String listSquared(long m, long n) {

        List<List<Long>> array = new ArrayList<>();

        for (long i = m; i <= n; i++) {

            List<Long> arrayTemp = new ArrayList<>();
            long sumTemp = 0;

            for (long j = 1; j <= i; j++) {
                if (i % j == 0) {
                    sumTemp = sumTemp + (j * j);
                }
            }
            double sqrTemp = Math.round(Math.sqrt(sumTemp));
            if( sqrTemp*sqrTemp == sumTemp){
                arrayTemp.add(i);
                arrayTemp.add(sumTemp);
                array.add(arrayTemp);                
            }
        }

        return array.toString();
    }

}
