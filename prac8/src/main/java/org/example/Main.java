package org.example;


import java.util.Scanner;

public class Main {
    private static final String[] MONTHS = {"январь", "февраль", "март", "апрель", "май",
            "июнь", "июль", "август", "сентябрь", "октябрь", "ноябрь", "декабрь"};

    private static final int[] DAYS = {
            31, 28, 31, 30, 31,
            30, 31, 31, 30, 31,
            30, 31
    };

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Input number of month");
            int monthInput = scanner.nextInt();

            Task month = new Task(monthInput);

            if (month.getMonth() == 2) {
                System.out.println("Input year: ");
                int year = scanner.nextInt();
                boolean isLeapYear = isLeapYear(year);

                int daysInFebruary = isLeapYear ? 29 : 28;
                System.out.println(MONTHS[month.getMonth() - 1] + ": " + daysInFebruary + " days");
            } else {
                System.out.println(MONTHS[month.getMonth() - 1] + ": " + DAYS[month.getMonth() - 1] + " дней");
            }
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Error:" + ex.getMessage());
        } finally {
            System.out.println("Closed");
        }
    }

    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}