package com.aston.homework3_collections;


import com.aston.homework3_collections.collection.LinkedList.SingleLinkedList;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        SingleLinkedList<Integer> singleLinkedList = new SingleLinkedList<>();
        singleLinkedList.add(55);
        singleLinkedList.add(77);
        singleLinkedList.add(22);
        singleLinkedList.add(11);
        singleLinkedList.add(33);
        singleLinkedList.add(66);
        singleLinkedList.add(88);

        System.out.println(singleLinkedList);
        System.out.println("Пустой ли список: " + singleLinkedList.isEmpty());
        System.out.println("Удаление элемента 44: " + singleLinkedList.remove(44));
        System.out.println("Добавление элемента 44: " + singleLinkedList.add(44));
        System.out.println("Есть ли элемент 12?: " + singleLinkedList.contains(12));
        System.out.println("Размер коллекции: " + singleLinkedList.size());
        System.out.println("Последниий элемент коллекции: " + singleLinkedList.get());
        System.out.println("Добавление элементов: " + singleLinkedList.addAll(List.of(12, 34, 56)));
        System.out.println(singleLinkedList);

        singleLinkedList.clear();

        singleLinkedList.get();
        singleLinkedList.add(23);
    }
}
