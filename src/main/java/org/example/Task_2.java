package org.example;

/**
 * Если необходимо, исправьте данный код:
 * задание 2 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit
 */
public class Task_2 {
    public static void main(String[] args) {

        try {
            int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Делить на ноль нельзя!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Индекс массива за пределами границ");
        }

//        В этом коде добавлен блок try-catch для обработки возможных исключений.
//        Если попытаться делить на ноль, то вылетит ArithmeticException, а если обратиться
//        к несуществующему индексу массива, то вылетит ArrayIndexOutOfBoundsException.
//        Эти исключения ловятся в соответствующих блоках catch, где можно обработать их и
//        вывести сообщение об ошибке.
    }
}


