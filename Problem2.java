Approach

1.Take integer a using Scanner.
2.Start number = 1.
3.Run loop a times.
4.Print number.
5.Add 2 to number each time.
6.This gives: 1, 3, 5, 7...


import java.util.Scanner;

public class Problem2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        int number = 1;

        for (int i = 1; i <= a; i++) {

            System.out.print(number + " ");

            number = number + 2;
        }
    }
}
