package Algorithms.Recursion;

public class Recursion {
    public static void main(String[] args) {
        int result = factorial(2);

        System.out.println("Factorial: " + result);

        int num = 10;
        int result1 = fibonacci(num);

        System.out.println("Fibonacci: " + result1);

        System.out.println("------ FIBONACCI -----------");
        for (int i = 0; i < num; i++) {
            System.out.println(fibonacci(i));
        }

    }

    private static int fibonacci(int num) {
        if (num <= 1) {
            return 1;
        }
        return fibonacci(num - 1) + fibonacci(num - 2);
    }

    private static int factorial(int number) {
        if (number < 1)
            return 1;

        return number * factorial(number - 1);
    }
}
