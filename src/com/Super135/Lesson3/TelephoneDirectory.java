package com.Super135.Lesson3;

import java.util.TreeMap;

public class TelephoneDirectory {


    private static final String[] name  = {"Вася", "Илья", "Антон", "Марина", "Антон"};
    private static final String[] phone = {"+7(985)521-68-12", "+7(951)321-66-22", "+7(485)341-98-72", "+7(985)940-56-87", "+7(987)532-66-23"};

    private TreeMap<String, RecordTelephon> mapTelDirs = new TreeMap<>();

    public void get(String user){
        mapTelDirs.entrySet().stream().forEach(mapEntry -> {
            if (mapEntry.getValue().getName() == user) {
                System.out.println(mapEntry.getValue().getName() + " "+
                        mapEntry.getValue().getId() + " " +
                        mapEntry.getValue().getPhone());
        }});
    }


    public void add(String name, String phone){
        mapTelDirs.put(String.valueOf(mapTelDirs.size()+1), new RecordTelephon(name,String.valueOf(mapTelDirs.size()+1), phone));
    }


    public static void main(String[] args) {
        TelephoneDirectory telephoneDirectory = new TelephoneDirectory();

        for (int i = 0; i < name.length ; i++) {
            telephoneDirectory.add(name[i],phone[i]);
        }
        telephoneDirectory.get("Антон");

    }
}
