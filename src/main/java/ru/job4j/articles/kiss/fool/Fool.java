package ru.job4j.articles.kiss.fool;

import java.util.Scanner;

public class Fool {

    static boolean answers (int key) {
        String[] sys = {"Ошибка. Начинай снова.","Fizz", "Buzz", "FizzBuzz"};
        int k = 0;
        boolean buz = key % 3 == 0;
        boolean fiz = key % 5 == 0;
        boolean buzfiz = buz && fiz;
        if (buzfiz) {
            System.out.println(sys[3]);
        } else if (buz) {
            System.out.println(sys[1]);
        } else if (fiz) {
            System.out.println(sys[2]);
        } else {
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("Игра FizzBuzz.");
        var startAt = 1;
        String[] sys = {"Ошибка. Начинай снова.","Fizz", "Buzz", "FizzBuzz"};
        var input = new Scanner(System.in);
        while (startAt < 100) {

            startAt++;
            var answer = input.nextLine();
            if (buzfiz) {
                if (!sys[3].equals(answer)) {
                    System.out.println(sys[0]);
                    startAt = 0;
                }
            } else if (buz) {
                if (!sys[1].equals(answer)) {
                    System.out.println(sys[0]);
                    startAt = 0;
                }
            } else if (fiz) {
                if (!sys[2].equals(answer)) {
                    System.out.println(sys[0]);
                    startAt = 0;
                }
            } else {
                if (!String.valueOf(startAt).equals(answer)) {
                    System.out.println(sys[0]);
                    startAt = 0;
                }
            }
            startAt++;
        }
    }
}
