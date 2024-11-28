package org.example.task1;

import java.util.ArrayList;

public class ArrayUtils {
    public static <T extends Comparable<T>> T findLargestEl(T[] arr) {
        if (arr.length == 0) return null;

        T largest = arr[0];
        for (T element : arr) {
            if (element.compareTo(largest) > 0) {
                largest = element;
            }
        }
        return largest;
    }

    public static <T extends Comparable<T>> T findLargestEl(T[][] arr) {
        if (arr == null || arr.length == 0 || arr[0].length == 0) return null;

        T largest = arr[0][0];
        for (T[] row : arr) {
            for (T element : row) {
                if (element.compareTo(largest) > 0) {
                    largest = element;
                }
            }
        }

        return largest;
    }

    public static <T> ArrayList<T> removeDuplicates(ArrayList<T> list) {
        ArrayList<T> uniqueList = new ArrayList<>();

        for (T element : list) {
            if (!uniqueList.contains(element)) {
                uniqueList.add(element);
            }
        }

        return uniqueList;
    }

    public static <T> int search(T[] arr, T element)
    {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }
}
