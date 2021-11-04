package com.company;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;


public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Введите выражение вида 2*(4+5)/8 : ");
        String str1 = s.nextLine();
        String str2 = str1;
        Expression ToPost = new Expression(str1, str2);
        //Проверка основных ошибок в выражении:
        //1. Несоответствие скобок
        //2. Деление на 0
        //3. 4++4 или 5+6+
        if(ToPost.InfToPost()) {
            Queue qe = new LinkedList();
            qe = ToPost.getQE();
            System.out.println("Постфиксная запись:");
            System.out.println(qe);
            double res = ToPost.PostInRes();
            System.out.println();
            System.out.println("Результат: " + res);
        } else
            System.out.println("Ошибка!");
    }
}
