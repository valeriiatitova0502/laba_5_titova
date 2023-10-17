package org.example;
import java.util.*;

public class PhoneBook {
    private TreeMap<String, TreeSet<Long>> persons = new TreeMap<>();

    public void add(String name, String number){
        Long phoneNumber = Long.parseLong(number);
        String existingName = null;

        for(Map.Entry<String, TreeSet<Long>> entry : persons.entrySet()){
            if(entry.getValue().contains(phoneNumber)) {
                existingName = entry.getKey();
                break;
            }
        }

        if(existingName != null && existingName.equals(name)){
            System.out.println("Номер " + phoneNumber + "и контакт " + name + " уже существует.");
            return;
        } else if (existingName != null){
            System.out.println("Номер " + phoneNumber + " уже существует у " + existingName + ", добавить у " + name + " невозможно.");
            return;
        }
        if(persons.containsKey(name)){
            persons.get(name).add(phoneNumber);
        }
        else {
            persons.put(name, new TreeSet<>(Collections.singleton(phoneNumber)));
        }
    }

    public void get(String name){
        if(this.persons.containsKey(name)){
            System.out.println(this.persons.get(name).toString());
        }
    }

    public void getAll(){
        for(var pair : persons.entrySet()){
            String name = pair.getKey();
            TreeSet<Long> numbers = pair.getValue();
            System.out.println(name + ": " + numbers);
        }
    }
}