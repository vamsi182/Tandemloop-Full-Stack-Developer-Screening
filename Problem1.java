Approach:

1.Create a Scanner object.
2.Take a, b, and the operation from the user.
3.Use if-else to check the operation.
4.Perform the corresponding calculation.
5.Problem asks to use a class, so create a Calculator class


import java.util.Scanner;

public class Problem1 {

    static class Calculator {
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        String operation = sc.next();

        if (operation.equals("add")) {
            System.out.println(a + b);
        }
        else if (operation.equals("subtract")) {
            System.out.println(a - b);
        }
        else if (operation.equals("multiply")) {
            System.out.println(a * b);
        }
        else if (operation.equals("divide")) {
            System.out.println(a / b);
        }
    }
}
