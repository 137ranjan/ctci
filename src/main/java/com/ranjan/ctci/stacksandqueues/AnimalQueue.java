package com.ranjan.ctci.stacksandqueues;

import java.util.LinkedList;
import java.util.List;

public class AnimalQueue {
    private final List<Dog> dogs = new LinkedList<>();
    private final List<Cat> cats = new LinkedList<>();
    private int order = 0;

    public void enqueue(Animal animal) {
        animal.setOrder(order);
        order++;

        if (animal instanceof Dog) dogs.addLast((Dog) animal);
        else if (animal instanceof Cat) cats.addLast((Cat) animal);
    }

    public Animal dequeAny() {
        if (dogs.isEmpty()) {
            return dequeCats();
        } else if (cats.isEmpty()) {
            return dequeDogs();
        }

        Dog dog = dogs.getFirst();
        Cat cat = cats.getFirst();

        if (dog.isOlderThan(cat)) {
            return dequeDogs();
        } else {
            return dequeCats();
        }
    }

    public Dog dequeDogs() {
        return dogs.removeFirst();
    }

    public Cat dequeCats() {
        return cats.removeFirst();
    }
}
