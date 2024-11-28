package org.example.task2;

public class GenericStack<E> {
//    private java.util.ArrayList<E> list = new java.util.ArrayList<>();

    private E[] list;
    private int size = 0;

    public GenericStack(int size) {
        list = (E[]) new Object[size];
    }

    public int getSize() {
        return list.length;
    }

    public E peek() {
        if (size == 0) {
            throw new java.util.EmptyStackException();
        }
        return list[size - 1];
    }

    private void doubleList() {
        E[] newList = (E[]) new Object[list.length * 2];
        System.arraycopy(list, 0, newList, 0, list.length);
        list = newList;
    }

    public void push(E o) {
        if (size == list.length) {
            doubleList();
        }
        list[size++] = o;
    }

    public E pop() {
        if (size == 0) {
            throw new java.util.EmptyStackException();
        }
        E o = list[--size];
        list[size] = null;
        return o;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public String toString() {
        return "стек: " + list.toString();
    }
}