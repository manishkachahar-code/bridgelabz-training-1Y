package com.gla.Collection;
import java.util.*;
public class ReverseQueue {
    void reverseQueue(Queue<Integer> q) {
        if (q.isEmpty()) return;

        int front = q.remove();
        reverseQueue(q);
        q.add(front);
    }
}
