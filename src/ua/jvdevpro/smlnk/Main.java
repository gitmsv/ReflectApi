package ua.jvdevpro.smlnk;

/**
 * Возможности интерфейса Java Reflection API:
 * - Определение класса объекта.
 * - Получение информации о модификаторах класса, полях, методах, конструкторах и суперклассах.
 * - Определение констант и методов, принадлежащих интерфейсу.
 * - Создание экземпляра класса, имя которого неизвестно до момента выполнения программы.
 * - Получение и установка значения свойства объекта.
 * - Вызов методов объекта.
 * - Создание нового массива, размер и тип компонентов которого, неизвестны до момента выполнения программ.Интерфейс Java Reflection API состоит из классов пакетов java.lang и java.lang.reflect.
 */

/**Интерфейс Java Reflection API состоит из классов пакетов java.lang и java.lang.reflect.*/

import java.util.Scanner;

/**Для начала работы с Reflection API требуется получить экземпляр класса Class
 Выполнить это можно несколькими способами:

 - Использовать свойство class для существующего класса;

 - Вызвать метод getClass() у существующего объекта;

 - Вызвать метод Class.forName("Class_name");*/

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Class<?> classTwo = Scanner.class; // Вызов для класса

        Class<?> classOne = sc.getClass(); // Вызов для объекта

        Class<?> classThree = null;

        try {
            classThree = Class.forName("java.util.Scanner");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();

        }

        System.out.println(classOne);
        System.out.println(classTwo);
        System.out.println(classThree);
        sc.close();
    }
}
