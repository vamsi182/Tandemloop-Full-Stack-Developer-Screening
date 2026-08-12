Approach

1.Take integer a.
2.Check whether a is even or odd.
3.If even, set limit = a - 1.
4.If odd, set limit = a.
5.Start number = 1.
6.Run loop until limit.
7.Print the odd number and add 2.


import java.util.Scanner;

public class Problem3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        int limit = a;

        if (a % 2 == 0) {
            limit = a - 1;
        }

        int number = 1;

        for (int i = 1; i <= limit; i++) {

            System.out.print(number + " ");

            number = number + 2;
        }
    }
}
