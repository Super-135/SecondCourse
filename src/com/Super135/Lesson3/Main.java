package com.Super135.Lesson3;

import java.util.*;

public class Main {



    public static String[] massWord = {"мама","папа","дядя","Вася","машина","топор","самолет","мама","папа","дядя","вася",
            "топор","самолет","мама","папа","машина","топор","самолет","топор","самолет","мама","папа"};

    public static void main(String[] args) {


        //1 Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся). Найти и
        //вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
        //Посчитать, сколько раз встречается каждое слово.
        HashMap<String, Integer> listWords = new HashMap<>();

        for (int i = 0; i < massWord.length; i++) {
            if (! listWords.containsKey(massWord[i])) {
                listWords.put(massWord[i],1);
            } else {
                listWords.put(massWord[i],listWords.get(massWord[i])+1);
            }
        }
         System.out.println(listWords);
    }

}
