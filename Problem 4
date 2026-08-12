Approach

1.Take the numbers into an array.
2.Start a loop from 1 to 9.
3.For each number (1 to 9), check every element in the array.
4.Use % to check divisibility.
5.If number % divisor == 0, increase the count.
6.Store each divisor and its count in the result map.


import java.util.*;

public class Problem4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        Map<Integer, Integer> map = new LinkedHashMap<>();

        for (int i = 1; i <= 9; i++) {

            int count = 0;

            for (int j = 0; j < numbers.length; j++) {

                if (numbers[j] % i == 0) {
                    count++;
                }
            }

            map.put(i, count);
        }

        System.out.println(map);
    }
}
