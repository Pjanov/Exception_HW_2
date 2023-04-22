package org.example;

import java.util.Scanner;

/**
 * Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
 * Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
 */
public class Task_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String input = scanner.nextLine();

        if (input.isEmpty()) {
            throw new IllegalArgumentException("Пустые строки вводить нельзя");
        } else {
            System.out.println("Вы ввели: " + input);
        }
    }
}
