package com.linkedList;

public class App {

    public static void main(String[] args) {
        List<Integer> list = new SingleLinkedList<>();
        list.insert(10);
        list.insert(-2);
        list.insert(3);
        list.insert(100);
        list.traverseList();
        System.out.println("--removal operation--");
        list.remove(10);
        list.traverseList();


        List<Person> listOfPerson = new SingleLinkedList<>();
        listOfPerson.insert(new Person("Nishant", 28));
        listOfPerson.insert(new Person("Gauri", 29));
        listOfPerson.insert(new Person("Mahesh", 30));
        listOfPerson.insert(new Person("Kinshuk", 29));
        listOfPerson.insert(new Person("Prakash", 31));
        listOfPerson.traverseList();
        System.out.println("--removal operation--");
        Person p = new Person("Nishant", 28);
        listOfPerson.remove(p);
        listOfPerson.traverseList();


    }
}
