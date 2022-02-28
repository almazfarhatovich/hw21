package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        try {
            System.out.println(Weekdays.valueOf(input.toUpperCase()));
        } catch (IllegalArgumentException a) {
            System.out.println("Сен туура эмес жаздын " + input);
            //   Weekdays weekdays = Weekdays.ДУЙШОМБУ;
            //    System.out.println(weekdays);
        }
    }
}