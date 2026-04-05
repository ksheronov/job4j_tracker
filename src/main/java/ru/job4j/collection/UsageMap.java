package ru.job4j.collection;

import java.util.HashMap;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("test@test", "Petr Ivanov");
        map.put("mail@mail", "Vera Petrova");
        map.put("email@email", "Ivanov Ivan");
        map.put("kris@mail", "Kristina Serova");
        map.put("ks@mail.ru", "Konstantin Sh");
        map.put("mail@mail", "Anna Kargina");
        for (String key : map.keySet()) {
            System.out.println("Key = " + key + " Value = " + map.get(key));
        }
    }
}
