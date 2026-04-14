package com.gla.Collection;
class CircularBuffer {
    private int[] buffer;
    private int capacity;
    private int size;
    private int front;


    public CircularBuffer(int capacity) {
        this.capacity = capacity;
        buffer = new int[capacity];
        size = 0;
        front = 0;
    }


    public void insert(int value) {
        if (size < capacity) {
            buffer[(front + size) % capacity] = value;
            size++;
        } else {
            // Buffer full → overwrite oldest
            front = (front + 1) % capacity;
            buffer[(front + size - 1) % capacity] = value;
        }
    }


    public void display() {
        System.out.print("Buffer: [");
        for (int i = 0; i < size; i++) {
            System.out.print(buffer[(front + i) % capacity]);
            if (i < size - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}
public class CircularBuff
public static void main(String[] args) {
    CircularBuffer cb = new CircularBuffer(3);


    cb.insert(1);
    cb.insert(2);
    cb.insert(3);
    cb.display(); // [1, 2, 3]


    cb.insert(4);
    cb.display(); // [2, 3, 4]

    cb.insert(5);
    cb.display(); // [3, 4, 5]
}

