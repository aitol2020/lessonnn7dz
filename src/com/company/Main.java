package com.company;

import java.util.*;

import static java.lang.Thread.sleep;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> a = new ArrayList<>();
        ArrayList<String> b = new ArrayList<>();
        ArrayList<String> c = new ArrayList<>();

        Comparator<String> comparator = (n1, n2) -> {
            Integer it1 = n1.length();
            Integer it2 = n2.length();
            return it1.compareTo(it2);
        };

        metod(a);
        print(a);

        Iterator<String> iteratorA = a.iterator();
        metod(b);
        print(b);


        Iterator<String> iteratorB = b.iterator();
        Collections.reverse(b);

        while (iteratorA.hasNext() && iteratorB.hasNext()) {
            c.add(iteratorA.next());
            c.add(iteratorB.next());
        }

        print(c);

        c.sort(comparator);
        print(c);

    }

    public static void metod(ArrayList<String> list) {
        boolean knopka = true;
        int kal = 0;
        while (knopka) {
            Scanner scanner = new Scanner(System.in);
            String ss = scanner.nextLine();
            list.add(ss);
            kal++;
            if (kal == 5)
                knopka = false;
        }
    }

    public static void print(ArrayList<String> list) {
        Iterator<String> iterator = list.iterator();
        System.out.println("__________________");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            try {
                sleep(500);
            } catch (InterruptedException ignored) {
            }
        }
        System.out.println("*****************");
    }
}

//
//a)  В задании нельзя использовать циклы for и for each.
   // Только while и Iterator
//b)  Написать приложение которое бы считывало сначала 5 строк которые вводит юзер и сохраняла бы их в Список А.
//c)  Затем программа должна отобразить этот список
//d)  Потом программа считывает еще 5 строк, которые вводит
   // юзер и помещает их в Список Б. После также отображает его в консоли
//e)  Объединить Список А со Списком Б в новый список С следующим образом {A1,B5,А2,Б4,А3,Б3,А4,Б2,А5,Б1}
//f)  После объединения отобразить в консоли список С
//g)  В конце отсортировать элементы списка С по длине слова,
   // сначала идут String-и с наименьшим количеством символов, и
 //   распечатать отсортированный список С.*/

