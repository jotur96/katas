import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BestTravel {

    public static void main(String[] args) {

        List<Integer> ts = new ArrayList<>(Arrays.asList(50, 55, 56, 57, 58));

        // chooseBestSum(163, 3, ts);

        ts = new ArrayList<>(Arrays.asList(91, 74, 73, 85, 73, 81, 87));

        chooseBestSum(331, 4, ts);

    }

    public static Integer chooseBestSum(int distances, int towns, List<Integer> ts) {

        if (ts.size() < towns) {
            return null;
        }

        System.out.println("Distances: " + distances);
        System.out.println("Towns: " + towns);

        for (Integer i : ts) {
            System.out.println(i);
        }

        List<int[]> routes = new ArrayList<int[]>();
        int pointer = 0;
        int[] tempRoute = new int[towns];
        int distanceMax = 0;

        while (pointer < ts.size()) {
            int iTemp = 1;
            int count = 1;

            for (int i = pointer + count; i < ts.size(); i++) {

                tempRoute[iTemp] = ts.get(i);
                iTemp++;

                if (iTemp >= towns) {
                    tempRoute[0] = ts.get(pointer);
                    i = pointer + count;
                    tempRoute[0] = ts.get(pointer);

                    int[] tempRouteCopy = new int[towns];
                    System.arraycopy(tempRoute, 0, tempRouteCopy, 0, towns);
                    routes.add(tempRouteCopy);

                    count++;
                    iTemp = 1;
                }
            }
            pointer++;
        }

        for (int[] route : routes) {
            int distanceMaxTemp = 0;
            for (int distance : route) {
                distanceMaxTemp += distance;
            }
            System.out.println("Distances: " + distanceMaxTemp);

            if (distanceMaxTemp == distances) {
                return distances;
            }

            if (distanceMaxTemp < distances) {
                if (distanceMax < distanceMaxTemp) {
                    distanceMax = distanceMaxTemp;
                }
            }
        }

        System.out.println("DistanceMax: " + distanceMax);

        return distanceMax == 0 ? null : distanceMax;

    }

}

/*
 * John and Mary want to travel between a few towns A, B, C ... Mary has on a
 * sheet of paper a list of distances between these towns. ls = [50, 55, 57, 58,
 * 60]. John is tired of driving and he says to Mary that he doesn't want to
 * drive more than t = 174 miles and he will visit only 3 towns.
 * 
 * Which distances, hence which towns, they will choose so that the sum of the
 * distances is the biggest possible to please Mary and John?
 * 
 * Example:
 * With list ls and 3 towns to visit they can make a choice between:
 * [50,55,57],[50,55,58],[50,55,60],[50,57,58],[50,57,60],[50,58,60],[55,57,58],
 * [55,57,60],[55,58,60],[57,58,60].
 * 
 * The sums of distances are then: 162, 163, 165, 165, 167, 168, 170, 172, 173,
 * 175.
 * 
 * The biggest possible sum taking a limit of 174 into account is then 173 and
 * the distances of the 3 corresponding towns is [55, 58, 60].
 * 
 * The function chooseBestSum (or choose_best_sum or ... depending on the
 * language) will take as parameters t (maximum sum of distances, integer >= 0),
 * k (number of towns to visit, k >= 1) and ls (list of distances, all distances
 * are positive or zero integers and this list has at least one element). The
 * function returns the "best" sum ie the biggest possible sum of k distances
 * less than or equal to the given limit t, if that sum exists, or otherwise
 * nil, null, None, Nothing, depending on the language. In that case with C,
 * C++, D, Dart, Fortran, F#, Go, Julia, Kotlin, Nim, OCaml, Pascal, Perl,
 * PowerShell, Reason, Rust, Scala, Shell, Swift return -1.
 * 
 * Examples:
 * ts = [50, 55, 56, 57, 58] choose_best_sum(163, 3, ts) -> 163
 * 
 * xs = [50] choose_best_sum(163, 3, xs) -> nil (or null or ... or -1 (C++, C,
 * D, Rust, Swift, Go, ...)
 * 
 * ys = [91, 74, 73, 85, 73, 81, 87] choose_best_sum(230, 3, ys) -> 228
 * 
 * Notes:
 * try not to modify the input list of distances ls
 * in some languages this "list" is in fact a string (see the Sample Tests).
 */