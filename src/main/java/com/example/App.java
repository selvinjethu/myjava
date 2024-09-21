package com.example;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        int result = add(5, 10);
        System.out.println("Sum: " + result);
    }

    public static int add(int a, int b) {
        return a + b;
    }

    // This method is intentionally bad for testing purposes
    public static void badMethod() {
        int x = 0;
        for (int i = 0; i < 10; i++) {
            x += i; // A simple loop
        }
        System.out.println("X: " + x);
    }
}
