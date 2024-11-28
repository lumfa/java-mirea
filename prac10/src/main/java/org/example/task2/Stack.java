package org.example.task2;

import java.util.ArrayList;

public class Stack {
    private ArrayList<Object> list;

    public Stack() {
        list = new ArrayList<>();
    }

    public Stack(Stack other) {
        this.list = new ArrayList<>(other.list);
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int getSize() {
        return list.size();
    }

    public Object peek() {
        return list.get(getSize() - 1);
    }

    public Object pop() {
        return list.remove(getSize() - 1);
    }

    public void push(Object o) {
        list.add(o);
    }
}
