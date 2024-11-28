package org.example.task2;

public class Main {
    public static void main(String[] args) {
        GenericStack<String> stack1 = new GenericStack<>(6);
        stack1.push("str1");
        stack1.push("str2");
        stack1.push("str3");
        stack1.push("str4");
        stack1.push("str5");
        stack1.push("str6");

        System.out.println("Size: " + stack1.getSize());
        stack1.push("str1");
        System.out.println("Size: " + stack1.getSize());

        System.out.println("out stack1: ");
        while (!stack1.isEmpty()) {
            System.out.println(stack1.pop() + " ");
        }

        GenericStack<Integer> stack2 = new GenericStack<>(5);
        stack2.push(1);
        stack2.push(2);
        stack2.push(3);
        stack2.push(4);
        stack2.push(5);

        System.out.println("\n" + stack2.peek());
        System.out.println("\nstack2:");
        while (!stack2.isEmpty()) {
            System.out.print(stack2.pop() + " ");
        }
        System.out.println("\n" + stack2.isEmpty());
        stack2.push(5);
        System.out.println(stack2.isEmpty());
    }
}
