package org.example.task2;


import org.example.task2.Stack;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack stack = new Stack();

        System.out.println("Введите пять строк:");

        for (int i = 0; i < 5; i++) {
            String input = scanner.nextLine();
            stack.push(input);
        }

        Stack stack2 = new Stack(stack);

        System.out.println("Стек:");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

        System.out.println("Стек 2:");
        while (!stack2.isEmpty()) {
            System.out.println(stack2.pop());
        }

        scanner.close();
    }
}