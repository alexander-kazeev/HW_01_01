package ru.otus.AIK.L0201.HW02;

public class Main {
    public static void main(String[] args){
        int maxArrayLength = 500_000;

        printObjectSize(new Object(),1);
        printObjectSize(new A(1, "Obj of class A"),1);
        printObjectSize(1,1);
        printObjectSize("",1);
        printObjectSize("тестовая строка01",1);
        printObjectSize(new String (new char[0]),1);
        String[] stringArray = new String[maxArrayLength];
        for (int i = 0; i < maxArrayLength; i++) {
            stringArray[i] = "";
        }
        printObjectSize(stringArray,maxArrayLength);
        stringArray = null;
        System.gc();
        String[] stringArrayText = new String[maxArrayLength];
        for (int i = 0; i < maxArrayLength; i++) {
            stringArrayText[i] = "тестовая строка02";
        }
        printObjectSize(stringArrayText,maxArrayLength);
        stringArrayText = null;
        System.gc();
        String[] stringArrayNewChar = new String[maxArrayLength];
        for (int i = 0; i < maxArrayLength; i++) {
            stringArrayNewChar[i] = new String (new char[0]);
        }
        printObjectSize(stringArrayNewChar,maxArrayLength);
        stringArrayNewChar = null;
        System.gc();
        String[] stringArrayNewText = new String[maxArrayLength];
        for (int i = 0; i < maxArrayLength; i++) {
            stringArrayNewText[i] = "тестовая строка03"+i;
        }
        printObjectSize(stringArrayNewText,maxArrayLength);
        stringArrayNewText = null;
        System.gc();
        System.out.println("Домашнее задание 02 по лекции L0201 выполнено!");
    }

    public static void printObjectSize(Object obj, int size) {
        long objSize = AgentMemoryCounter.getSize(obj);
        System.out.println(String.format("%s, size=%s, per1=%s", obj.getClass()
                .getSimpleName(), objSize, objSize/size));
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