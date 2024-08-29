package com.aston.lesson3_collections.collection;

import java.util.Collection;

public interface Collections<E> {
    boolean add(E e);

    E get();

    boolean remove(Object o);

    boolean addAll(Collection<? extends E> c);
}
