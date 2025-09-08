package Linklist;

import java.util.ArrayList;

public class QueueOperations {
    ArrayList<Integer> list = new ArrayList<>();

    public void enqueue(int val) {
        list.add(val);
    }

    public int dequeue() {
        if (list.isEmpty()) return -1;
        int val = list.get(0);
        list.remove(0);
        return val;
    }

    public void display() {
        for (int i : list) System.out.print(i + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        QueueOperations q = new QueueOperations();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.display();
        System.out.println("Dequeued: " + q.dequeue());
        q.display();
    }
}

