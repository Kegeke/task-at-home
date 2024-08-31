package com.aston.lesson3_collections.collection;

public interface Collection<E> {
    boolean add(E e);

    E get();

    boolean remove(E e);

    boolean addAll(java.util.Collection<? extends E> c);
}
