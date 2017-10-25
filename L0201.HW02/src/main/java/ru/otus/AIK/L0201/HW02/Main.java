package ru.otus.AIK.L0201.HW02;

import ru.otus.AIK.L0201.HW02.AgentMemoryCounter;

public class Main {
    public static void main(String[] args){

        printObjectSize(new Object());
        printObjectSize(new A(1, "Obj of class A"));
        printObjectSize(1);


        System.out.println("Домашнее задание 02 по лекции L0201 выполнено!");
    }

    public static void printObjectSize(Object obj) {
        System.out.println(String.format("%s, size=%s", obj.getClass()
                .getSimpleName(), AgentMemoryCounter.getSize(obj)));
    }
}

class A {
    Integer id;
    String name;

    public A(Integer id, String name) {
        this.id = id;
        this.name = name;
    }
}