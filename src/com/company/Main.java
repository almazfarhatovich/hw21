package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(Weekdays.valueOf(input.toUpperCase()));
      //   Weekdays weekdays = Weekdays.ДУЙШОМБУ;
     //    System.out.println(weekdays);
    }
}
