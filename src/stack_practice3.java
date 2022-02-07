import java.util.*;

public class stack_practice3 {

    public static void main(String[] args) {
        Deque<Integer> arrayDeque = new ArrayDeque<>();
        // Add 3 at the tail of this deque
        arrayDeque.add(3);
        System.out.println(arrayDeque);
        // Add 4 at the head of this deque
        arrayDeque.push(4);
        System.out.println(arrayDeque);
        // Add 6 at the tail of this deque
        arrayDeque.offer(6);
        System.out.println(arrayDeque);
        // Add 2 at the head of this deque
        arrayDeque.addFirst(2);
        System.out.println(arrayDeque);
        // Add 5 at the tail of this deque
        arrayDeque.addLast(5);
        System.out.println(arrayDeque);
        // Add 1 at the head of this deque
        arrayDeque.addFirst(1);
        System.out.println(arrayDeque);
        arrayDeque.add(88);
        System.out.println(arrayDeque);
        arrayDeque.pop();
        System.out.println(arrayDeque);
    }
}
