package ru.job4j.articles.kiss.fool;

import java.util.Scanner;

public class Fool {

    static String systemAnswers(int key) {
        String[] sys = {"Fizz", "Buzz", "FizzBuzz"};
        boolean fiz = key % 3 == 0;
        boolean buz = key % 5 == 0;
        boolean buzfiz = buz && fiz;
        if (buzfiz) {
            return sys[2];
        } else if (buz) {
            return sys[1];
        } else if (fiz) {
            return (sys[0]);
        } else {
            return String.valueOf(key);
        }
    }

    public static void main(String[] args) {
        System.out.println("Игра FizzBuzz.");
        var startAt = 1;
        var input = new Scanner(System.in);
        while (startAt < 100) {
            System.out.println(systemAnswers(startAt));
            startAt++;
            var answer = input.nextLine();
            if (!systemAnswers(startAt).equals(answer)) {
                System.out.println("Ошибка. Начинай снова.");
                startAt = 1;
                continue;
            }
            startAt++;
        }
        System.out.println("Игра завершена.");
    }
}
