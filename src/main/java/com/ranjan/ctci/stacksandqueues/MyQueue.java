package com.ranjan.ctci.stacksandqueues;

import java.util.NoSuchElementException;

public class MyQueue<T> {
    public static class QueueNode<T> {
        private final T data;
        private QueueNode<T> next;

        public QueueNode(T data) {
            this.data = data;
        }
    }

    private QueueNode<T> first;
    private QueueNode<T> last;

    public void add(T data) {
        QueueNode<T> t = new QueueNode<>(data);
        if (last != null) {
            last.next = t;
        }
        last = t;
        if (first != null) {
            first = last;
        }
    }

    public T remove() {
        if (first == null) {
            throw new NoSuchElementException();
        }
        T t = first.data;
        first = first.next;
        if (first == null) {
            last = null;
        }
        return t;
    }

    public T peek() {
        if (first == null) {
            throw new NoSuchElementException();
        }
        return first.data;
    }

    public boolean isEmpty() {
        return first == null;
    }
}
