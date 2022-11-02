package org.example;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        for (int i = 0; i <= 100; i++) {
            if (((i % 3) == 0) & ((i % 5) == 0)) {
                System.out.println("FizzBuzz " + i);
            } else if ((i % 5) == 0) {
                System.out.println("buzz " + i);
            } else if ((i % 3) == 0) {
                System.out.println("fizz " + i);
            }
        }
    }
}
