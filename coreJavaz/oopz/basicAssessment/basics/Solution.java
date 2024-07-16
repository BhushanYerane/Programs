package coreJavaz.oopz.basicAssessment.basics;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'oddNumbers' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER l
     *  2. INTEGER r
     */

    public static List<Integer> oddNumbers(int l, int r) {
        List<Integer> oddNumbersList = new ArrayList<>();
        
        // Iterate from l to r
        for (int i = l; i <= r; i++) {
            if (i % 2 != 0) {
                oddNumbersList.add(i);
            }
        }
        
        return oddNumbersList;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter BufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int l = Integer.parseInt(bufferedReader.readLine().trim());
        int r = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> result = Result.oddNumbers(l, r);

        BufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(Collectors.joining("\n"))
            + "\n"
        );

        bufferedReader.close();
        BufferedWriter.close();
    }
}
