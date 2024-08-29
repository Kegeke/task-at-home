package com.aston.lesson3_collections.collection.LinkedList;

import com.aston.lesson3_collections.collection.Collections;

import java.util.Collection;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SingleLinkedList<E> implements Collections<E> {
    private Node<E> head;
    private int size;

    public SingleLinkedList() {
    }

    private static class Node<E> {
        private final E value;
        private Node<E> next;

        public Node(E value, Node<E> next) {
            this.value = value;
            this.next = next;
        }
    }

    @Override
    public boolean add(E e) {
        head = new Node<>(e, head);
        size++;

        return true;
    }

    @Override
    public E get() {
        return head.value;
    }

    @Override
    public boolean remove(Object o) {
        Node<E> temp = head;

        if (Objects.equals(o, head.value)) {
            head = head.next;
            size--;

            return true;
        }

        while (temp.next != null) {
            if (Objects.equals(o, temp.next.value)) {
                temp.next = temp.next.next;
                size--;

                return true;
            }

            temp = temp.next;
        }

        return false;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        for (E e : c) {
            add(e);
        }

        return true;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void clear() {
        head = null;
        size = 0;
    }

    /*
    private void bubbleSort(){
        //logic
    }
    */

    @Override
    public String toString() {
        String str = Stream
                .iterate(head, Objects::nonNull, x -> x.next)
                .map(x -> x.value.toString())
                .collect(Collectors.joining(", "));

        return "[" + str + "]";
    }
}
