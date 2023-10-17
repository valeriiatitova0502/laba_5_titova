package org.example;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Main
{
    public static void main(String[] args){
        String[] names = {"Лера", "Егор", "Алина", "Ваня", "Ваня", "Дима", "Лариса","Женя", "Женя", "Лера","Настя","Егор","Боря"};
        // Создаем HashSet для уникальных имен и помещаем в него имена из массива
        // Создаем HashMap для подсчета повторяющихся имен
        HashMap<String, Integer> wordList = new HashMap<>();
        // Перебираем массив имен
        for (String a : names) {
            if (wordList.containsKey(a)) {
                wordList.put(a, (wordList.get(a) + 1));
            } else {
                wordList.put(a, 1);
            }
        }
        System.out.println(wordList.entrySet());
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Егор", "89042290818");
        phoneBook.add("Лера", "89226652416");
        phoneBook.add("Настя", "89021904691");
        phoneBook.add("Вика", "89021904691");
        phoneBook.add("Гриша", "8951234554");
        phoneBook.add("Тоня", "864357911");
        phoneBook.add("Ваня" , "8951357911");
        phoneBook.add("Антон", "56925476332");
        phoneBook.add("Миша", "87654321");
        phoneBook.add("Антон", "15");
        phoneBook.add("Антон", "3");
        phoneBook.add("Миша", "1");
        phoneBook.add("Алина", "5621345637");
        phoneBook.add("Егор","89042290818");
        phoneBook.add("Лера","89226652416");

        phoneBook.getAll();

    }
}
