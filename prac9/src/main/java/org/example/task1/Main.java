package org.example.task1;


import org.example.task1.ArrayUtils;
import org.example.task1.Circle;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        # 1
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(5);

        ArrayList<Integer> uniqueNumbers = ArrayUtils.removeDuplicates(numbers);
        System.out.println("Old: " + numbers + "\n" + "New: " + uniqueNumbers);

//        #2
        String[] numbersSearch = {"1", "2", "5", "7", "34", "10", "14"};

        int index = ArrayUtils.search(numbersSearch, "7");

        switch (index) {
            case -1:
                System.out.println("Element not found, try Again");
                break;
            default:
                System.out.println("Index of element: " + index);
                break;
        }

//        #3
        Circle[] circles = {
                new Circle(1),
                new Circle(2),
                new Circle(3),
                new Circle(4),
                new Circle(5)
        };

        double radius = circles[1].getRadius();
        System.out.println("Radius of circle: " + radius);

        Circle largestCircle = ArrayUtils.findLargestEl(circles);
        System.out.println("the biggest element: " + largestCircle);

        Integer[] numbs = {1, 2, 4, 7, 3, 5, 9};
        Integer largestNumb = ArrayUtils.findLargestEl(numbs);
        System.out.println("the biggest element: " + largestNumb);

//        #4

        Integer[][] numb = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        Integer largestNumb2d = ArrayUtils.findLargestEl(numb);
        System.out.println("the biggest element in 2d array: " + largestNumb2d);

    }
}