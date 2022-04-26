package ru.samsung.itschool.mdev;

import com.google.gson.Gson;

import java.math.BigDecimal;
import java.util.List;

class Staff {
    public String name;
    public int age;
    public String position;
    public BigDecimal salary;
    public List<String> skills;

    public Staff(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class Main {

    public static void main(String[] args) {
	        Staff ivan = new Staff("Ivan",15);
        // Нужно сериализовать объект ivan в строку
        //GSON - Google Script Object Notation (Библиотека)
            Gson gson = new Gson();

            String str = gson.toJson(ivan);
            System.out.println(str);

            // {"name":"Anton","age":15,"position":"Junior","salary":100,"skills":["java","xml","python","Android"]}

            String task = "{\"name\":\"Anton\",\"age\":15,\"position\":\"Junior\",\"salary\":100,\"skills\":[\"java\",\"xml\",\"python\",\"Android\"]}";
            Staff anton = gson.fromJson(task,Staff.class);
            System.out.println(anton.skills.size());
    }
}
