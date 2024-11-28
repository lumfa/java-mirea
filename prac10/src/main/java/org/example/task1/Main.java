package org.example.task1;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack stack = new Stack();
        StackArray stackArray = new StackArray();

        System.out.println("Введите пять строк:");

        for (int i = 0; i < 5; i++) {
            String input = scanner.nextLine();
            stack.push(input);
            stackArray.push(input);
        }

        System.out.println("Строки в обратном порядке Stack:");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

        System.out.println("Строки в обратном порядке StackArray:");
        while (!stackArray.isEmpty()) {
            System.out.println(stackArray.pop());
        }

        scanner.close();
    }
}