package com.aston.homework3_collections.collection.ArrayList;

import com.aston.homework3_collections.collection.Collection;

public class MyArrayList<E> {
    private static final int DEFAULT_CAPACITY = 10;

    private static final Object[] EMPTY_ELEMENTDATA = {};
    private static final Object[] DAFAULTCAPACITY_EMPTY_ELEMENTDATA = {};

    private final Object[] elementData;

    private int size;

    public MyArrayList(int initialCapacity) {
        if (initialCapacity > 0) {
            this.elementData = new Object[initialCapacity];
        } else if (initialCapacity == 0) {
            this.elementData = EMPTY_ELEMENTDATA;
        } else {
            throw new IllegalArgumentException("Illegal Capacity: " +
                    initialCapacity);
        }
    }

    public MyArrayList() {
        this.elementData = DAFAULTCAPACITY_EMPTY_ELEMENTDATA;
    }


}
